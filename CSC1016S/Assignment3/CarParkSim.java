
import java.util.Scanner;

/**
 * The CarParkSim class contains the main car park simulation method.
 * It creates and manipulates the main objects, and handles user I/O.
 *
 * @author Stephan Jamieson and ...
 * @version 14/7/2019
 */
public class CarParkSim {

    public static void main(final String[] args) {
        final Scanner keyboard = new Scanner(System.in);
        // YOUR CODE HERE.
        // Declare variables to store a Clock and a Register object, create the relevant
        // objects and assign them.
        Time t = new Time("00:00");
        Clock clock = new Clock(t);
        Register register = new Register();

        System.out.println("Car Park Simulator");
        // YOUR CODE HERE.
        // Print current time.
        System.out.println("The current time is " + clock.examine().toString() + ".");

        System.out.println("Commands: advance {minutes}, arrive, depart, quit.");
        System.out.print(">");
        String input = keyboard.next().toLowerCase();
        while (!input.equals("quit")) {
            if (input.equals("advance")) {
                // YOUR CODE HERE.
                int advalue = keyboard.nextInt();
                Duration d = new Duration("minutes", advalue);
                clock.advance(d);
                System.out.println("The current time is " + clock.examine().toString() + ".");
                // Advance the clock, print the current time.
            } else if (input.equals("arrive")) {
                // YOUR CODE HERE

                Ticket ticket = new Ticket(clock.examine(), UIDGenerator.makeUID());
                register.add(ticket);
                System.out.println("Ticket issued: " + ticket.toString() + ".");
                // Create a new ticket, add it to the register, print details of ticket issued.
            } else if (input.equals("depart")) {
                // YOUR CODE HERE.

                String depValue = keyboard.next();

                if (register.contains(depValue)) {
                    Ticket ticket = register.retrieve(depValue);
                    System.out.println("Ticket details: " + ticket.toString() + ".");
                    System.out.println("Current time: " + clock.examine().toString() + ".");
                    Duration k = ticket.age(clock.examine());
                    System.out.println("Duration of stay: " + Duration.format(k, "minute") + ".");
                } else {
                    System.out.println("Invalid ticket ID.");
                }
                // Determine if ticket is valid, i.e. in the register.
                // If not, print error message.
                // If yes, retreive it, calculate duration of stay and print it.
            } else {
                System.out.println("That command is not recognised.");
                System.out.println("Commands: advance <minutes>, arrive, depart, quit.");
            }
            System.out.print(">");
            input = keyboard.next().toLowerCase();
        }
        System.out.println("Goodbye.");
    }

}
