public class Main {

    public static void main(String[] args) {

        // sum(5) = 5 + sum(4) = 15
        // sum(4) = 4 + sum(3) = 10
        // sum(3) = 3 + sum(2) = 6
        // sum(2) = 2 + sum(1) = 3
        // sum(1) = 1 + sum(0) = 1
        // sum(0) = 0

        // System.out.println(sum(100000));

        // n = 10
        // arr = [5, 2, 6, 2, 4, 3, 1, 2, 5, 2]
        /**
         * width = 1
         * 
         * i = 0
         * left = 0
         * mid = 1
         * right = 2
         * 
         * leftPart = [5]
         * rightPart = [2]
         * li = 0, ri = 0, ki = 0
         * arr[ki] = rightPart[ri++] // arr[0] = rightPart[0]
         * arr = [2, 2, 6, 2, 4, 3, 1, 2, 5, 2]
         * arr[ki] = leftPart[li++] // arr[1] = leftPart[0]
         * arr = [2, 5, 6, 2, 4, 3, 1, 2, 5, 2]
         * 
         * i = 2
         * left = 2
         * mid = 3
         * right = 4
         * 
         * i = 4
         * left = 4
         * mid = 5
         * right = 6
         * 
         * width = 2
         * 
         * i = 0
         * left = 0
         * mid = 2
         * right = 4
         */

        /**
         * arr = [5, 2, 6, 2, 4, 3, 1, 2, 5, 2]
         * mergeSort(arr, 0, 9) // [5, 2, 6, 2, 4, 3, 1, 2, 5, 2]
         *      mergeSort(arr, 0, 4) // [5, 2, 6, 2, 4]
         *          mergeSort(arr, 0, 2) // [5, 2, 6] => [2, 5, 6]
         *              mergeSort(arr, 0, 1) // [5, 2] => [2, 5]
         *                  mergeSort(arr, 0, 0) // [5]
         *                  mergeSort(arr, 1, 1) // [2]
         *                  merge(arr, 0, 0, 1) // 
         *              mergeSort(arr, 1, 1) // [6] => [6]
         *          mergeSort(arr, 2, 2) // [2, 4] => [2, 4]
         */

        /**
         * f(n) = f(n - 1) + f(n - 2)
         * 
         * 
         */

    }

    public static int sum(int n) {
		if(n == 0) {
			return 0;
		} else {
			return n + sum(n - 1);
		}
	}

}
