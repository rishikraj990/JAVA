package DSA.main.S04_BinarySearch.BS_02_OnAns;

import static DSA.main.Utilities.Utility.findMaxValueInArray;

public class L05_FindSmallestDivisor {

    /** Problem Statement: Given an integer array nums and an integer threshold,
     * find the smallest positive integer divisor such that: After dividing every element of nums by divisor,
     * rounding each result up, and adding all results, the final sum is less than or equal to threshold.
     * In simple words, for every number num, use ceil(num / divisor), then add all those values.
     * Return the smallest divisor that keeps this sum within the threshold.
     * If answer does not exist, return -1.
     */

    public static int findSmallestDivisor(int[] arr, int thresh) {
//        return brute(arr, thresh);
        return optimal(arr, thresh);
    }

    private static int brute(int[] arr, int thresh) {
//      /**
//       * Brute; TC:[ O(N+ N*(MavVal+1)) ]; SC:[ O(1) ]
//       ====================================
        if (thresh<arr.length) return -1;
        int max = findMaxValueInArray(arr);
        for (int i=1; i<=max; i++) {
            if (caluclateSum(arr, i) <= thresh) return i;
        }
        return -1;
//       ====================================
//       */
    }

    private static int caluclateSum(int[] arr, int i) {
        int sum = 0;
        for (int j=0; j<arr.length; j++) {
            sum += (int)Math.ceil((double) arr[j]/i);
        }
        return sum;
    }

    private static int optimal(int[] arr, int thresh) {
//      /**
//       * Optimal; TC:[ O(N+ log2(MavVal+1)*N) ]; SC:[ O(1) ]
//       ====================================
        if (thresh<arr.length) return -1;
        int low = 1;
        int high = findMaxValueInArray(arr);
        while (low<=high) {
            int mid = low + ((high-low)/2);
            if (caluclateSum(arr, mid) <= thresh) high = mid-1;
            else low = mid+1;
        }
        return low;
//       ====================================
//       */
    }

}
