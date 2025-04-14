

public class Main {
    public static void main(String[] args) {

        Integer[] intNumbers = {1, 2, 3, 4, 5};
        GenericUtils.reverse(intNumbers);

        for (int i = 0; i < intNumbers.length; i++) {
            System.out.println(intNumbers[i]);
        }

        Double[] doubleNumbers = {1.2, 3.4, 2.8};
        double sum = GenericUtils.sum(doubleNumbers);
        System.out.println(sum);
    }
}
