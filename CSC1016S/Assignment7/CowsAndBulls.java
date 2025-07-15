public class CowsAndBulls {
    public final static int NUM_DIGITS = 4;
    public final static int MAX_VALUE = 9876;
    public final static int MIN_VALUE = 1234;
    public final static int MAX_GUESSES = 10;
    public static int actualNum = 0;// actual number to be guessed
    public static int numGuesses = 0;
    public static boolean guessed = false;// is going to be used to know whether number is guessed correctly

    public CowsAndBulls(int seed) {
        int[] numbers = new int[4];// stores exactly 4 digits
        NumberPicker numberPicker = new NumberPicker(seed, 1, 9);// A number picker with numbers randomly shuffled from
                                                                 // 1 to 9.
        for (int i = 0; i < NUM_DIGITS; i++) {
            numbers[i] = numberPicker.nextInt();
        }
        for (int i = 0; i < NUM_DIGITS; i++) {
            actualNum = actualNum * 10 + numbers[i];
        }
        numGuesses = MAX_GUESSES;
    }

    public int guessesRemaining() {
        return numGuesses;// return remaining guesses
    }

    public Result guess(int guessNumber) {
        int bulls = NumberUtils.countMatches(actualNum, guessNumber);// stores the number of bulls
        int cows = NumberUtils.countIntersect(actualNum, guessNumber) - bulls; // stores the number of cows(numbers
        // guessed correctky but diff position)
        numGuesses--;// decrements numGuessses with each guess
        if (bulls == 4) {
            guessed = true;// the number is guessed correctly this will be useful for gameOver()
        }
        return new Result(cows, bulls);// returns a result object
    }

    public int giveUp() {
        guessed = true;// if the player game up the guessed is set true this will also be useful for
                       // gameOver
        return actualNum;

    }

    public boolean gameOver() {
        return guessed || numGuesses == 0;// returns true if the number is guessed or the player gave up or the number
                                          // of guesses are 0
    }
}
