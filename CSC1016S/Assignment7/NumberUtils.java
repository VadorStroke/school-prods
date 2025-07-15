// Name:Modisane Gomolemo
// Student Number:MDSGOM004
// NumberUtils class program
// Date:27 September 2024

public class NumberUtils {

    private NumberUtils() {

    }

    public static int[] toArray(int number) {

        String numString = "" + number;// converts the number to string
        int[] numArray = new int[numString.length()];
        for (int i = 0; i < numString.length(); i++) {
            numArray[i] = numString.charAt(i) - '0';// minusing '0' converts the Chars ASCII value to integer
        }

        return numArray;
    }

    public static int countMatches(int numberA, int numberB) {
        int count = 0;
        String numStringA = "" + numberA;// strings are easier to work with, so i converted the numbers to strings
        String numStringB = "" + numberB;

        for (int i = 0; i < numStringA.length(); i++) {
            if (numStringA.charAt(i) == numStringB.charAt(i)) {
                count++;// if the a number is in the same position and equal to the corresponding number
                        // then count increments
            }
        }

        return count;

    }

    public static int countIntersect(int numberA, int numberB) {
        String numStringA = "" + numberA;// converted the numbers to string
        String numStringB = "" + numberB;
        int count = 0;
        for (int i = 0; i < numStringA.length(); i++) {
            for (int x = 0; x < numStringA.length(); x++) {
                if (numStringA.charAt(i) == numStringB.charAt(x)) {
                    count++;// if a number is equal to the corresponding number irregardless of the position
                            // the count increments
                }
            }
        }
        return count;

    }
}
