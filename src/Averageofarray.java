public class Averageofarray {
    public static void main(String[] args) {
        int sum=0;
        int [] array={1,2,3,4,5};

        for (int i=0;i< array.length;i++) {
            sum = sum + array[i];

        } double average = sum / array.length;

         System.out.println("average of array is:"+average);

    }
}
