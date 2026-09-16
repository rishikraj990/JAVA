package DSA.main.S03_Array;

import static DSA.main.Utilities.Utility.printArray;
import static DSA.main.Utilities.Utility.swap;

public class L16_SortArrayOf0s1s2s {

    /** Problem Statement: Given an array nums consisting of only 0, 1, or 2. Sort the array in non-decreasing order.
     * The sorting must be done in-place, without making a copy of the original array.
     */

    public static void main(String[] args) {
//        int n = readInt();
//        int[] arr = readArray(n);
        int n = 7;
        int[] arr = {1, 0, 2, 1, 2, 1, 0} ;

        printArray(findNumberAppears1sOtherNumbers2s(arr));
    }

    private static int[] findNumberAppears1sOtherNumbers2s(int[] arr) {

//      /**
//       * Brute; TC:[ O(N log2(N)) ]; SC:[ O() ]
//       ====================================
        //MERGE SORT
//       ====================================
//       */

//      /**
//       * Better; TC:[ O(2N) ]; SC:[ O(1) ]
//       ====================================
//        int c0 = 0;
//        int c1 = 0;
//        int c2 = 0;
//        for (int i=0; i<arr.length; i++){
//            if(arr[i] == 0){
//                c0++;
//            } else if (arr[i] == 1){
//                c1++;
//            } else {
//                c2++;
//            }
//        }
//        for (int i=0; i<c0; i++){
//            arr[i] = 0;
//        }
//        for (int i=c0; i<c0+c1; i++){
//            arr[i] = 1;
//        }
//        for (int i=c0+c1; i<c0+c1+c2; i++){
//            arr[i] = 2;
//        }
//        return arr;
//       ====================================
//       */

//      /**
//       * Optimal; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        // Dutch national flag Algo
        int l = 0;
        int m = 0;
        int h = arr.length-1;
        while (m < h){
            if (arr[m] == 0){
                swap(arr, m, l);
                l++;
                m++;
            } else if (arr[m] == 1) {
                m++;
            } else {
                swap(arr, m, h);
                h--;
            }
        }
        return arr;
//       ====================================
//       */
    }

}
