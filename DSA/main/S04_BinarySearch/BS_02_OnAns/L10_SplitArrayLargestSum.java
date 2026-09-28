package DSA.main.S04_BinarySearch.BS_02_OnAns;

import static DSA.main.Utilities.Utility.findMaxValueInArray;
import static DSA.main.Utilities.Utility.sunOfAllElementsInArray;

public class L10_SplitArrayLargestSum {

    /** Problem Statement: Given an integer array a of size n and an integer k.
     * Split the array a into k non-empty subarrays such that the largest sum of any subarray is minimized.
     * Return the minimized largest sum of the split.
     */

    public static int splitArrayLargestSum(int[] arr, int k) {
//        return brute(arr, k);
        return optimal(arr, k);
    }

    private static int brute(int[] arr, int k) {
//      /**
//       * Brute; TC:[ O(N + N*(Sum(arr)-MaxValue+1)) ]; SC:[ O(1) ]
//       ====================================
        if (arr.length < k) return -1;
        int min = findMaxValueInArray(arr);
        int max = sunOfAllElementsInArray(arr);
        for (int i=min; i<=max; i++) {
            if (canFormRequiredSubArrays(arr, i) == k) return i;
        }
        return max;
//       ====================================
//       */
    }

    private static int canFormRequiredSubArrays(int[] arr, int i) {
        int subArray = 1;
        int sum = 0;
        for (int j=0; j<arr.length; j++) {
            if(sum + arr[j] <= i) sum+=arr[j];
            else {
                subArray++;
                sum=arr[j];
            }
        }
        return subArray;
    }

    private static int optimal(int[] arr, int k) {
//      /**
//       * Optimal; TC:[ O(N + N*(log2( Sum(arr)-MaxValue+1 ))) ]; SC:[ O(1) ]
//       ====================================
        if (arr.length < k) return -1;
        int low = findMaxValueInArray(arr);
        int high = sunOfAllElementsInArray(arr);
        while (low<=high) {
            int mid = low + ((high-low)/2);
            if (canFormRequiredSubArrays(arr, mid) > k) low = mid+1;
            else high = mid-1;
        }
        return low;
//       ====================================
//       */
    }

}
