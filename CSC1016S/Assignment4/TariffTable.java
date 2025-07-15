// Name: Modisane Gomolemo
// MDSGOM004
// 30 August 2024
// Stores a ParkingTariff object in an array

public class TariffTable {
    private int nextFree;
    private ParkingTariff[] parkingTariffs;

    public TariffTable(int maxSize) {
        parkingTariffs = new ParkingTariff[maxSize];

    }

    public void addTariff(TimePeriod period, Money tariff) {
        ParkingTariff parkTariff = new ParkingTariff(period, tariff);

        if (nextFree == 0 || parkingTariffs[nextFree - 1].isDirectlyFollowedBy(period)) {// checks whether the array is
                                                                                         // empty or the previous value
                                                                                         // is preceded by the coming
                                                                                         // value
            parkingTariffs[nextFree] = parkTariff;
            nextFree++;
        } else {
            throw new IllegalArgumentException("Tariff periods must be adjacent.");
        }

    }

    public Money getTariff(Duration duration) {
        for (int i = 0; i < nextFree; i++) {
            if (parkingTariffs[i].containsDuration(duration)) {
                return parkingTariffs[i].getCost();
            }
        }
        return new Money(0, new Currency("R", "ZAR", 100));// Did not use null as its a little risky

    }

    public String toString() {
        String table = "";
        for (int i = 0; i < parkingTariffs.length; i++) {
            if (parkingTariffs[i] != null) {// including this removed an error where the automarker detected a null
                                            // value
                table += parkingTariffs[i].toString() + " : " + parkingTariffs[i].getCost().toString() + "\n";

            }
        }
        return table.trim();// removes the last space

    }
}
