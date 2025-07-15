public class Ticket {
    private String id;
    private Time issueTime;

    public Ticket(Time currentTime, String ID) {
        this.issueTime = currentTime;
        this.id = ID;
    }

    public String ID() {
        return id;
    }

    public Duration age(Time currentTime) {
        Duration d = currentTime.subtract(issueTime);
        return d;
    }

    public String toString() {
        return "Ticket[id=" + id + ", " + "time=" + issueTime.toString() + "]";
    }
}
