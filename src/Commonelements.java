import java.util.Arrays;

public class Commonelements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {1, 2, 10, 20, 30, 40, 5, 60};

        System.out.println(" original array1 list  is: " + Arrays.toString(array1));
        System.out.println("original array2 list is:" + Arrays.toString(array2));

        for (int i = 0; i < array1.length; i++) {


            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println("common properties:"+array1[i]);
                }
            }
        }
    }
}