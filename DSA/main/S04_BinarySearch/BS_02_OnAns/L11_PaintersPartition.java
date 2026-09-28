package DSA.main.S04_BinarySearch.BS_02_OnAns;

import static DSA.main.Utilities.Utility.findMaxValueInArray;
import static DSA.main.Utilities.Utility.sunOfAllElementsInArray;

public class L11_PaintersPartition {

    /** Problem Statement: You are given A painters and an array ARR of N integers where ARR[i] denotes the
     * length of the ith board. Each painter takes B units of time to paint 1 unit of board.
     * You must assign boards to painters such that:
     * Each painter paints only contiguous segments of boards.
     * No board can be split between painters.
     * The goal is to minimize the time to paint all boards.
     * Return the minimum time required to paint all boards modulo 10000003.
     */

    public static int paintersPartition(int[] arr, int a, int b) {
        int modulo = 10000003;
//        return brute(arr, a, b, modulo);
        return optimal(arr, a, b, modulo);
    }

    private static int brute(int[] arr, int a, int b, int modulo) {
//      /**
//       * Brute; TC:[ O(N + N*(Sum(arr)-MaxValue+1)) ]; SC:[ O(1) ]
//       ====================================
        int min = findMaxValueInArray(arr);
        int max = sunOfAllElementsInArray(arr);
        for (int i=min; i<=max; i++) {
            if (pinterRequired(arr, i) <= a) return i*b;
        }
        return (max*b)%modulo;
//       ====================================
//       */
    }

    private static int pinterRequired(int[] arr, int i) {
        int painter = 1;
        int timeSum = 0;
        for (int j=0; j<arr.length; j++) {
            if (timeSum+arr[j] <= i) timeSum+=arr[j];
            else {
                painter++;
                timeSum = arr[j];
            }
        }
        return painter;
    }

    private static int optimal(int[] arr, int a, int b, int modulo) {
//      /**
//       * Optimal; TC:[ O(N + N*log2( (Sum(arr)-MaxValue+1) )) ]; SC:[ O(1) ]
//       ====================================
        int low = findMaxValueInArray(arr);
        int high = sunOfAllElementsInArray(arr);
        while (low<=high) {
            int mid = low + ((high-low)/2);
            if (pinterRequired(arr, mid) > a) low = mid+1;
            else high = mid-1;
        }
        return (low*b)%modulo;
//       ====================================
//       */
    }

}
