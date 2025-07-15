public class Register {
    private Ticket[] tickets;
    private int numTickets;

    public Register() {
        numTickets = 0;
        tickets = new Ticket[100];
    }

    public void add(Ticket ticket) {
        tickets[numTickets] = ticket;
        numTickets++;
    }

    public boolean contains(String ticketID) {
        // boolean ans = false;
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] != null && tickets[i].ID().equals(ticketID)) {
                // ans = true;
                return true;
            }
        }
        // return ans;
        return false;
    }

    public Ticket retrieve(String ticketID) {
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i].ID().equals(ticketID)) {
                return tickets[i];
            }

        }
        return null;
    }
}
