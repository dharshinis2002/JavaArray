import java.util.Arrays;

public class Seclarge {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 7, 8, 9};
        int size = array.length;
        System.out.println("original array:" + Arrays.toString(array));

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {

                }
            }
        }      System.out.println("Second largest num" + array[size - 2]);


    }
}

