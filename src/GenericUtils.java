/**
 * Provides generic methods for arrays of generic types
 * @author Philip Djurak
 * @version 13-04-2025
 */
public class GenericUtils {

    /**
     * Reverses elements of array
     * 
     * @param <T> the type of elements in the array
     * @param array array that is reversed
     */
    public static <T> void reverse (T[] array) {
        int lastIndex = array.length-1;
        for(int i = 0; i < array.length/2; i++) {
            T tempArray = array[i];
            array[i] = array[lastIndex];
            array[lastIndex] = tempArray;
            lastIndex--;
        }
    }

    /**
     * Returns sum of all elements of the array
     * 
     * @param <T> the type of number in the array
     * @param array array of numbers
     * @return the sum of all numbers from array as a double
     */
    public static <T extends Number> double sum (T[] array) {
        double sum = 0.0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i].doubleValue();
        }
        return sum;
    }
}