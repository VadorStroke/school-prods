// Name:Modisane Gomolemo
// MDSGOM004
// 30 August 2024

public class TimePeriod {

    private Duration lowerBound;
    private Duration upperBound;

    public TimePeriod(Duration lowerBound, Duration upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public Duration lowerBound() {
        return this.lowerBound;
    }

    public Duration upperBound() {
        return this.upperBound;
    }

    public boolean includes(Duration duration) {
        if (this.lowerBound().compareTo(duration) <= 0 & this.upperBound().compareTo((duration)) > 0) {
            return true;
        }
        return false;
    }

    public boolean precedes(TimePeriod other) {
        if (this.upperBound().compareTo(other.lowerBound()) <= 0) {
            return true;
        }
        return false;
    }

    public boolean adjacent(TimePeriod other) {
        if (this.upperBound().equals(other.lowerBound()) || this.lowerBound().equals(other.upperBound())) {
            return true;
        }
        return false;
    }

    public String toString() {
        String first = Duration.format(this.lowerBound(), "minutes");
        String second = Duration.format(this.upperBound(), "minues");

        return "[" + first + " .. " + second + "]";
    }

}
