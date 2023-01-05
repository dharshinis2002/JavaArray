import java.util.Arrays;

public class Numofevenodd {
    public static void main(String[] args) {

    int count =0;
        int[] array={1,2,4,6,8,3,9};
        System.out.println("original array :"+ Arrays.toString(array));
    for (int i=0;i< array.length;i++) {
        if (array[i] % 2 == 0) {
            count++;
        }

    } System.out.println("number of even :" + count);
        System.out.println("num of odd :" +(array.length -count));


    }
    }

