package DSA.main.S03_Array;

import static DSA.main.Utilities.Utility.printArray;

public class L05_LeftRotateArray1 {

    /**
     * Problem Statement: Given an integer array arr, rotate the array to the left by one.
     */

    public static void main(String[] args) {
//        int n = readInt();
//        int[] arr = readArray(n);
        int n = 7;
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        leftRotate1(arr);
        printArray(arr);
    }

    private static void leftRotate1(int[] arr) {
//      /**
//       * Optimal; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        if(arr.length<=1){
            return;
        }
        int temp = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
//       ====================================
//       */
    }

}
