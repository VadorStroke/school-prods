// Name:Modisane Gomolemo
// MDSGOM004
// 30 August 2024
// this class Stores the cost and the timeperiod

public class ParkingTariff {
    private Money cost;
    private TimePeriod timePeriod;

    public ParkingTariff() {

        Money money = new Money(0, new Currency("R", "ZAR", 100));
        this.cost = money;
        TimePeriod time = new TimePeriod(new Duration("minute", 0), new Duration("minute", 60));
        this.timePeriod = time;
    }

    public ParkingTariff(TimePeriod time, Money money) {
        this.cost = money;
        this.timePeriod = time;

    }

    public boolean containsDuration(Duration duration) {
        if (timePeriod.includes(duration)) {
            return true;
        }
        return false;
    }

    public Money getCost() {
        return this.cost;
    }

    public TimePeriod getTimePeriod() {
        return this.timePeriod;
    }

    public boolean isDirectlyFollowedBy(TimePeriod time) {
        if (timePeriod.precedes(time) && timePeriod.adjacent(time)) {
            return true;
        }
        return false;
    }

    public void setMoney(Money money) {
        this.cost = money;
    }

    public void setTimePeriod(TimePeriod time) {
        this.timePeriod = time;
    }

    public String toString() {
        return timePeriod.toString();
    }

}
