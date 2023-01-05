public class Index {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 9) {
                index1 = i;
                System.out.println("index of " + 9 + "is" + index1);

            }

        }

        int index2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 6) {
                index2 = i;
                System.out.println("index of " + 6 + "is" + index2);

            }
        }
        int index3 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 7) {
                index3 = i;
                System.out.println("index of " + 7 + "is" + index1);

            }
        }
    }
}