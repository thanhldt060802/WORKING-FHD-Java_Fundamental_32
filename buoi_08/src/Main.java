import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Integer[] arr1 = new Integer[5];
        // System.out.println(Arrays.toString(arr1));

        // int[] arr2 = new int[5];
        // System.out.println(Arrays.toString(arr2));

        // String[] arr = new String[5];
        // System.out.println(Arrays.toString(arr));

        // int[] arr = new int[] {2, 4, 6, 8, 10};
        // System.out.println(Arrays.toString(arr));
        // System.out.println(arr[2]);
        // arr[2] = 100;
        // System.out.println(Arrays.toString(arr));
        // System.out.println(arr[2]);
        // System.out.println(arr.length);
        // System.out.println(arr[10]);

        // int sum = 0;
        // // for (int i = 0; i < arr.length; i++) {
        // //     sum += arr[i];  // sum = sum + arr[i]
        // // }
        // for (int n : arr) {
        //     sum += n;
        // }
        // System.out.println(sum);

        // String str = "Le Dao Tan Thanh";
        // // for (char c : str.toCharArray()) {
        // //     System.out.println(c);
        // // }
        // // String[] words = str.split(" ");
        // for (String word : str.split(" ")) {
        //     System.out.println(word);
        // }

        // int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // int sum = 0;
        // for (int n : arr) {
        //     if (n % 2 == 0) {
        //         sum += n;
        //     }
        // }
        // System.out.println(sum);

        // int[] arr = new int[5];
        // System.out.println(Arrays.toString(arr));
        // arr[2] = 10;
        // System.out.println(Arrays.toString(arr));

        // int[][] arr2d = new int[2][];
        // arr2d[0] = new int[] {-1, -2, -3};
        // arr2d[1] = new int[] {1, 2, 3, 4, 5};
        // // System.out.println(Arrays.toString(arr2d));
        // System.out.println(Arrays.deepToString(arr2d));

        // int[][] arr2d = new int[][] {
        //     {-1, -2, -3},
        //     {1, 2, 3, 4, 5}
        // };
        // System.out.println(Arrays.deepToString(arr2d));
        // System.out.println(arr2d[0][2]);
        // arr2d[0][2] = 100;
        // System.out.println(Arrays.deepToString(arr2d));
        // System.out.println(arr2d[0][2]);
        // for (int i = 0; i < arr2d.length; i++) {
        //     int sum = 0;
        //     for (int j = 0; j < arr2d[i].length; j++) {
        //         sum += arr2d[i][j];
        //     }
        //     System.out.println(sum);
        // }
        // for (int[] arr1d : arr2d) {
        //     int sum = 0;
        //     for (int n : arr1d) {
        //         sum += n;
        //     }
        //     System.out.println(sum);
        // }

        // String[][] arr2d = new String[3][4];
        // System.out.println(Arrays.deepToString(arr2d));

        // int[][][] arr3d = new int[2][3][2];
        // System.out.println(Arrays.deepToString(arr3d));
        // int[][][] arr3d = new int[][][] {
        //     {
        //         {1, 2, 3},
        //         {4, 5, 6},
        //     },
        //     {
        //         {7, 8, 9, 10},
        //         {11, 12}
        //     }
        // };
        // System.out.println(Arrays.deepToString(arr3d));
        // System.out.println(arr3d[1][0][2]);

        int[] arr1 = new int[] {1, 2, 3, 4, 5};
        int[] arr2 = arr1.clone();

        arr2[2] = 100;
        
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }

}
