
public class GenericUtils {

    public static <T> void reverse (T[] array) {
        int lastIndex = array.length-1;
        for(int i = 0; i < array.length/2; i++) {
            T tempArray = array[i];
            array[i] = array[lastIndex];
            array[lastIndex] = tempArray;
            lastIndex--;
        }
    }
}