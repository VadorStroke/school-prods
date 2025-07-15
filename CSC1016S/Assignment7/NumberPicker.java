import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
/**
 * Given a number range, a NumberPicker returns the numbers in the range in a random order.
 * 
 * @author Stephan Jamieson 
 * @version 31/08/2016
 */
public class NumberPicker {

    private List<Integer> numbers;
    
    /**
     * Create a NumberPicker that uses the given seed value for randomisation and that 
     * returns the numbers in the range min to max (inclusive) in a random order.
     */
    public NumberPicker(final int seed, final int min, final int max) {
        numbers = new ArrayList<Integer>();
        final Random random = new Random(seed);
        for(int i = min; i<max+1; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers, random);
    }
    
    /**
     * Determine whether the NumberPicker contains any more numbers..
     */
    public boolean hasNext() { return !numbers.isEmpty(); }
    
    /**
     * Return a randomly selected number from the range.
     */
    public int nextInt() { return numbers.remove(0); }
    
}
