import java.util.Scanner;
import java.util.ArrayList;

public class Question1 {

    public static void main(String[] args) {
        System.out.println("Welcome to Great International Technology");
        Scanner input = new Scanner(System.in);
        boolean checker = true;
        String selection = "";
        String serialNum = "";
        String manufacture = "";
        String colour = "";
        int memory = 0;
        int size = 0;
        Box box;
        Screen screen;
        ArrayList<Computers> computers = new ArrayList<Computers>();

        while (checker) {
            System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit");
            selection = input.nextLine().toUpperCase();
            if (selection.equals("B") || selection.equals("S") || selection.equals("A")) {
                System.out.println("Enter the serial number");
                serialNum = input.nextLine();
                System.out.println("Enter the manufacturer");
                manufacture = input.nextLine();
                System.out.println("Enter the colour");
                colour = input.nextLine();
                if (selection.equals("B")) {
                    System.out.println("Enter the amount of memory (MB)");
                    memory = Integer.parseInt(input.nextLine());
                    box = new Box(serialNum, manufacture, colour, memory);
                    computers.add(box);

                } else if (selection.equals("S")) {
                    System.out.println("Enter the screen size in inches");
                    size = Integer.parseInt(input.nextLine());
                    screen = new Screen(serialNum, manufacture, colour, size);
                    computers.add(screen);

                } else {
                    computers.add(new Accessory(serialNum, manufacture, colour));
                }
                System.out.println("Done");
            } else if (selection.equals("D")) {
                System.out.println("Enter the serial number");
                serialNum = input.nextLine();
                boolean found = false;
                for (int i = 0; i < computers.size(); i++) {
                    if (computers.get(i).getSerialNum().equals(serialNum)) {
                        computers.remove(i);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Not found");
                } else {
                    System.out.println("Done");
                }

            } else if (selection.equals("L")) {
                for (int i = 0; i < computers.size(); i++) {
                    System.out.println(computers.get(i).toString());

                }
                System.out.println("Done");
            } else {
                checker = false;

            }
        }
    }
}