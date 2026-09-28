package DSA.main.S04_BinarySearch.BS_02_OnAns;

import java.util.Arrays;

public class L08_AggressiveCows {

    /** Problem Statement: You are given an array arr of size N which denotes the position of stalls.
     * You are also given an integer k which denotes the number of Aggressive Cows. You are given the task of
     * assigning stalls to k cows such that the minimum distance between any two of them is the maximum possible.
     * Find the maximum possible minimum distance.
     */

    public static int aggressiveCows(int[] arr, int k) {
//        return brute(arr, k);
        return optimal(arr, k);
    }

    private static int brute(int[] arr, int k) {
//      /**
//       * Brute; TC:[ O(N*log2(N)) + O((MaxVal-MinVal)*N) ]; SC:[ O(1) ]
//       ====================================
        Arrays.sort(arr);
        int max = arr[arr.length-1] - arr[0];
        for (int i=1; i<=max; i++) {
            if (!canAssign(arr, k, i)) return i-1;
        }
        return max;
//       ====================================
//       */
    }

    private static boolean canAssign(int[] arr, int k, int i) {
        int cord = arr[0];
        int cow = 1;
        for (int j=1; j<arr.length; j++) {
            if (arr[j]-cord >= i) {
                cow++;
                cord = arr[j];
            }
            if (cow >= k) return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    private static int optimal(int[] arr, int k) {
//      /**
//       * Optimal; TC:[ O(N*log2(N)) + O(log2(MaxVal-MinVal)*N) ]; SC:[ O(1) ]
//       ====================================
        Arrays.sort(arr);
        int low = 1;
        int high = arr[arr.length-1] - arr[0];
        while (low<=high) {
            int mid = low + ((high-low)/2);
            if (canAssign(arr, k, mid)) low = mid+1;
            else high = mid-1;
        }
        return high;
//       ====================================
//       */
    }

}
