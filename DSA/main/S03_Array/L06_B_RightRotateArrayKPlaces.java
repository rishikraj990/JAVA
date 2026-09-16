package DSA.main.S03_Array;

import static DSA.main.Utilities.Utility.printArray;

public class L06_B_RightRotateArrayKPlaces {

    /**
     * Problem Statement: Given an array of integers, rotating array of elements by k elements right.
     */

    public static void main(String[] args) {
//        int n = readInt();
//        int[] arr = readArray(n);
        int n = 7;
        int[] arr = {1, 2, 3, 4,    5, 6, 7};
        //           4, 5, 6, 7, 1, 2, 3
        //           5, 6, 7, 1, 2, 3, 4
        int k = 10;
        rightRotateByK(arr, k);
        printArray(arr);
    }

    private static void rightRotateByK(int[] arr, int k) {
//      /**
//       * Brute; TC:[ O(K+N)]; SC:[ O(K) ]
//       ====================================
//        int n = arr.length;
//        k = k % n;
//        int[] temp = new int[k];
//        for(int i=(n-k); i<n; i++){
//            temp[i-(n-k)] = arr[i];
//        }
//        for (int i=n-k-1; i>=0; i--){
//            arr[i+k] = arr[i];
//        }
//        for(int i=0; i<k; i++){
//            arr[i] = temp[i];
//        }
//       ====================================
//       */

//      /**
//       * Optimal; TC:[ O(2N) ]; SC:[ O(1) ]
//       ====================================
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
//       ====================================
//       */
    }

    private static void reverse(int[] arr, int startIndex, int endIndex) {
        while (startIndex<endIndex) {
            int temp = arr[endIndex];
            arr[endIndex] = arr[startIndex];
            arr[startIndex] = temp;
            endIndex--;
            startIndex++;
        }
    }

}
