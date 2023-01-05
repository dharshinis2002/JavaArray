import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("original array is:" + Arrays.toString(array));

        for (int j = array.length - 1; j >= 0; j--) {
            System.out.println("reverse array is:" + array[j]);
        }
    }
}