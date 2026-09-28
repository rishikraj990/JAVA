package DSA.main.S04_BinarySearch.BS_02_OnAns;

public class L07_KthMissingPositiveNumb {

    /** Problem Statement: Given a sorted array of unique positive integers arr,
     * your task is to return the kᵗʰ missing positive number that is not present in arr.
     * The array is guaranteed to be strictly increasing, and the missing numbers are those positive integers
     * that do not appear in arr but would appear in a full sequence starting from 1.
     */

    public static int kthMissingPositiveNumb(int[] arr, int k) {
//        return brute(arr, k);
        return optimal(arr, k);
    }

    private static int brute(int[] arr, int k) {
//      /**
//       * Brute; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        for (int i=0; i<arr.length; i++) {
            if (arr[i]<=k) k++;
            else break;
        }
        return k;
//       ====================================
//       */
    }

    private static int optimal(int[] arr, int k) {
//      /**
//       * Optimal; TC:[ O(log2(N)) ]; SC:[ O(1) ]
//       ====================================
        int low = 0;
        int high = arr.length-1;
        while (low<=high) {
            int mid = low + ((high-low)/2);
            int missing = arr[mid]-mid-1;
            if (missing>=k) high = mid-1;
            else low = mid+1;
        }
        return high+k+1;
//       ====================================
//       */
    }

}
