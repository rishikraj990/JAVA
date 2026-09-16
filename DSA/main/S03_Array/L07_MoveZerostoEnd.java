package DSA.main.S03_Array;

import static DSA.main.Utilities.Utility.printArray;
import static DSA.main.Utilities.Utility.swap;

public class L07_MoveZerostoEnd {

    /** Problem Statement: You are given an array of integers, your task is to move all the zeros in the array
     * to the end of the array and move non-negative integers to the front by maintaining their order.
     */

    public static void main(String[] args) {
//        int n = readInt();
//        int[] arr = readArray(n);
        int n = 8;
        int[] arr = {1, 0, 2, 3, 0, 4, 0, 1};
        moveZeroToEnd(arr);
        printArray(arr);
    }

    private static void moveZeroToEnd(int[] arr) {
//      /**
//       * Brute; TC:[ O(N + N) ]; SC:[ O(N) ]
//       ====================================
//        int n = arr.length;
//        int[] temp = new int[n];
//        int j=0;
//        for (int i=0; i<n-1; i++){
//            if(arr[i]!=0){
//                temp[j] = arr[i];
//                j++;
//            }
//        }
//        int i;
//        for (i=0; i<j; i++){
//            arr[i] = temp[i];
//        }
//        for (; i<n; i++){
//            arr[i] = 0;
//        }
//       ====================================
//       */

//      /**
//       * Optimal; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        int n = arr.length;
        int j=0;
        for (int i=0; i<n; i++){
            if(arr[i] !=0 && arr[j] !=0){
                j++;
            } else if (arr[j] == 0 && arr[i] == 0){
                continue;
            } else {
                swap(arr, i, j);
                j++;
            }
        }
//       ====================================
//       */
    }

}
