import java.util.Scanner;

public class Addtwomatrices {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner in = new Scanner(System.in);

        System.out.println("enter the 1st num");
        a = in.nextInt();

        System.out.println("enter the 2nd num");
        b = in.nextInt();

        int array1[][] = new int[a][b];
        int array2[][] = new int[a][b];
        int sum[][] = new int[a][b];
        //array1
        for (c = 0; c < a; c++) {
            for (d = 0; d < b; d++) {
                array1[c][d] = array1[a][b];
//array2

            }
        }
        for (c = 0; c < b; c++) {
            for (d = 0; d < b; d++) {
                array2[c][d] = array2[a][b];
//sum
            }
        }
        for (c = 0; c < a; c++) {
            for (d = 0; d < b; d++) {
                sum[c][d] = array1[c][d] + array2[c][d];


            }

         }
        //System.out.println("add of two matrices"+(sum[][]));
    }
}
