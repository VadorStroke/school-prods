import java.util.Scanner;

// Edited by:Modisane Gomolemo
// 30 August 2024
/**
 * Write a description of class CarParkSimSolution here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarParkSim {

    private CarParkSim() {
    }

    public static void main(final String[] args) {
        final Scanner keyboard = new Scanner(System.in);
        final Clock clock = new Clock(new Time("00:00:00"));
        final Register register = new Register();
        //
        TariffTable tarifT = new TariffTable(10);
        tarifT.addTariff(new TimePeriod(new Duration("minutes", 0), new Duration("minutes", 30)), // This is for each
                                                                                                  // value given to us
                new Money("R10", new Currency("R", "ZAR", 100)));
        tarifT.addTariff(new TimePeriod(new Duration("minutes", 30), new Duration("hour", 1)),
                new Money("R15", new Currency("R", "ZAR", 100)));
        tarifT.addTariff(new TimePeriod(new Duration("hour", 1), new Duration("hour", 3)),
                new Money("R20", new Currency("R", "ZAR", 100)));
        tarifT.addTariff(new TimePeriod(new Duration("hour", 3), new Duration("hour", 4)),
                new Money("R30", new Currency("R", "ZAR", 100)));
        tarifT.addTariff(new TimePeriod(new Duration("hour", 4), new Duration("hour", 5)),
                new Money("R40", new Currency("R", "ZAR", 100)));
        tarifT.addTariff(new TimePeriod(new Duration("hour", 5), new Duration("hour", 6)),
                new Money("R50", new Currency("R", "ZAR", 100)));
        tarifT.addTariff(new TimePeriod(new Duration("hour", 6), new Duration("hour", 8)),
                new Money("R60", new Currency("R", "ZAR", 100)));
        tarifT.addTariff(new TimePeriod(new Duration("hour", 8), new Duration("hour", 10)),
                new Money("R70", new Currency("R", "ZAR", 100)));
        tarifT.addTariff(new TimePeriod(new Duration("hour", 10), new Duration("hour", 12)),
                new Money("R90", new Currency("R", "ZAR", 100)));
        tarifT.addTariff(new TimePeriod(new Duration("hour", 12), new Duration("day", 1)),
                new Money("R100", new Currency("R", "ZAR", 100)));

        System.out.println("Car Park Simulator");
        System.out.printf("The current time is %s.\n", clock.examine());
        System.out.println("Commands: tariffs, advance {minutes}, arrive, depart, quit.");
        System.out.print(">");
        String input = keyboard.next().toLowerCase();
        while (!input.equals("quit")) {
            if (input.equals("advance")) {
                clock.advance(new Duration("minute", keyboard.nextInt()));
                System.out.printf("The current time is %s.\n", clock.examine());
            } else if (input.equals("arrive")) {
                final Ticket ticket = new Ticket(clock.examine());
                register.add(ticket);
                System.out.printf("Ticket issued: %s.\n", ticket);
            } else if (input.equals("depart")) {
                final String ID = keyboard.next();
                if (!register.contains(ID)) {
                    System.out.println("Invalid ticket ID.");
                } else {
                    final Ticket ticket = register.retrieve(ID);
                    System.out.printf("Ticket details: %s.\n", ticket);
                    System.out.printf("Current time: %s.\n", clock.examine());
                    final Duration durationOfStay = ticket.age(clock.examine());
                    System.out.printf("Duration of stay: %s.\n", Duration.format(durationOfStay, "minute"));
                    System.out.println("Cost of stay : " + tarifT.getTariff(durationOfStay).toString() + ".");
                }

            } else if (input.equals("tariffs")) {
                System.out.println(tarifT.toString());// Prints out the whole Teriff

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
