package DSA.main.S04_BinarySearch.BS_01_1D;

import static DSA.main.S04_BinarySearch.BS_01_1D.L02_LowerBound.lowerBound;

public class L04_SearchInsertPosition {

    /** Problem Statement: You are given a sorted array arr of distinct values and a target value x.
     * You need to search for the index of the target value in the array.
     */

    public static int searchInsertPosition(int[] arr, int t) {
        return optimal(arr, t);
    }

    private static int optimal(int[] arr, int x) {
//      /**
//       * Optimal; TC:[ O(log2(N)) ]; SC:[ O(1) ]
//       ====================================
        return lowerBound(arr, x);
//       ====================================
//       */
    }

}
