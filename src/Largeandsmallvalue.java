import java.util.Arrays;

public class Largeandsmallvalue {
    public static void main(String[] args) {
        int []array={1,2,3,5,7,9,4,6,11};
        System.out.println("original array:"+ Arrays.toString(array));
        int max=array[0];
        int min=array[0];
    for (int i=0;i< array.length;i++) {
        if (array[i] > max) {
            max = array[i];
        } else if (array[i] < min) {
            min = array[i];
        }
    } System.out.println("difference between large num to small num:"+(max-min));
    }




    }

