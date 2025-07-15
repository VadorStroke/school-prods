// Name: Modisane Gomolemo
// Student Number: MDSGOM004
// Shift class
// 20 September 2024

public class Shift {

    private CalendarTime begin;
    private CalendarTime end;

    public Shift(CalendarTime start, CalendarTime finish) {
        this.begin = start;
        this.end = finish;
    }

    public CalendarTime finish() {
        return this.end;
    }

    public CalendarTime start() {
        return this.begin;
    }

    public Duration length() {
        Duration len = this.end.subtract(begin);
        return len;// returs the length of the shift
    }

    public boolean inWeek(Week week) {
        return week.includes(this.begin.date()) || week.includes(this.end.date());// checks whether shift has that week
    }

    public boolean includesDate(Date date) {
        return (date.compareTo(this.begin.date()) >= 0 && date.compareTo(this.end.date()) <= 0);// checks whether the
                                                                                                // date is in the shift
    }

    public String toString() {
        return this.begin.toString() + " - " + this.end.toString();// represents the Shift in a formatted string
    }

}
