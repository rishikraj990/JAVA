package DSA.main.S04_BinarySearch.BS_02_OnAns;

import static DSA.main.Utilities.Utility.findMaxValueInArray;
import static DSA.main.Utilities.Utility.findMinValueInArray;

public class L04_MinDaysToMakeMBouquets {

    /** Problem Statement: You are given an integer array bloomDay, an integer m and an integer k.
     * You want to make m bouquets. To make a bouquet, you need to use k adjacent flowers from the garden.
     * The garden consists of n flowers, the ith flower will bloom in the bloomDay[i] and
     * then can be used in exactly one bouquet. Return the minimum number of days you need to wait to be
     * able to make m bouquets from the garden. If it is impossible to make m bouquets return -1.
     */

    public static int minDaysToMakeMBouquets(int[] arr, int k, int m) {
//        return brute(arr, k, m);
        return optimal(arr, k, m);
    }

    private static int brute(int[] arr, int k, int m) {
//      /**
//       * Brute; TC:[ O(N + (Max-Min+1)*N) ]; SC:[ O(1) ]
//       ====================================
        if (k*m > arr.length) return -1;
        int min = findMinValueInArray(arr);
        int max = findMaxValueInArray(arr);
        for (int i=min; i<=max; i++) {
            if (canMakeRequiredBouquets(arr, k, m, i)) return i;
        }
        return -1;
//       ====================================
//       */
    }

    private static boolean canMakeRequiredBouquets(int[] arr, int k, int m, int i) {
        int ans = 0;
        int count = 0;
        for (int j=0; j<arr.length; j++) {
            if (arr[j] <= i) count++;
            else {
                ans += count/k;
                count = 0;
            }
        }
        ans += count/k;
        return ans >= m;
    }

    private static int optimal(int[] arr, int k, int m) {
//      /**
//       * Optimal; TC:[ O(N + N*log2(Max-Min+1)) ]; SC:[ O(1) ]
//       ====================================
        if (k*m > arr.length) return -1;
        int min = findMinValueInArray(arr);
        int max = findMaxValueInArray(arr);
        int low = min;
        int high = max;
        while (low<=high) {
            int mid = low + ((high-low)/2);
            if (canMakeRequiredBouquets(arr, k, m, mid)) high = mid-1;
            else low = mid+1;
        }
        return low;
//       ====================================
//       */
    }

}
