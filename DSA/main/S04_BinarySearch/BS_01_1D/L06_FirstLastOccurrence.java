package DSA.main.S04_BinarySearch.BS_01_1D;

import static DSA.main.S04_BinarySearch.BS_01_1D.L02_LowerBound.lowerBound;
import static DSA.main.S04_BinarySearch.BS_01_1D.L03_UpperBound.upperBound;

public class L06_FirstLastOccurrence {

    /** Problem Statement: Given a sorted array of N integers, write a program to find the index
     * of the first and last occurrence of the target key. If the target is not found then return [-1, -1].
     * Note: Consider 0 based indexing
     */

    public static int[] firstLastOccurrence(int[] arr, int t) {
//        return brute(arr, t);
        return optimal(arr, t);
    }

    private static int[] brute(int[] arr, int t) {
//      /**
//       * Brute; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        int first = -1;
        int last = -1;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == t) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        return new int[]{first, last};
//       ====================================
//       */
    }

    private static int[] optimal(int[] arr, int t) {
//      /**
//       * Optimal; TC:[ O(2log2(N)) ]; SC:[ O(1) ]
//       ====================================
        int first = lowerBound(arr, t);
        int last = -1;
        if(first == arr.length || arr[first] != t) first = -1;
        if (first != -1){
            last = upperBound(arr, t) - 1;
        }
        return new int[]{first, last};
//       ====================================
//       */
    }

}
