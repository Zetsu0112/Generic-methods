/**
 * Tests Generic Methods From GenericUtils class
 * @author Philip Djurak
 * @version 13-04-2025
 */

public class Main {
    public static void main(String[] args) {

        // Test reverse method (Swapping)
        Integer[] intNumbers = {1, 2, 3, 4, 5};
        GenericUtils.reverse(intNumbers);

        for (int i = 0; i < intNumbers.length; i++) {
            System.out.println(intNumbers[i]);
        }

        // Test sum method
        Double[] doubleNumbers = {1.2, 3.4, 2.8};
        double sum = GenericUtils.sum(doubleNumbers);
        System.out.println(sum);
    }
}
