public class Dublicatevalue {
    public static void main(String[] args) {

        int[] array = {1, 2,2, 3, 4, 5, 9, 3, 5, 1, 6, 7, 8, 9, 10};


        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if( (array[i] == array[j])&&(i !=j)){

                    System.out.println("dublicate array element:" + array[j]);

                }
            }
        }
    }
}