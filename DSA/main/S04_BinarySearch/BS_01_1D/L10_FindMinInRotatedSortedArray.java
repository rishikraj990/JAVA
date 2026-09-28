package DSA.main.S04_BinarySearch.BS_01_1D;

public class L10_FindMinInRotatedSortedArray {

    /** Problem Statement: Given an integer array arr of size N, sorted in ascending order
     * (with distinct values), the array is rotated at any index which is unknown.
     * Find the minimum element in the array.
     */

    public static int findMinInRotatedSortedArray(int[] arr) {
//        return brute(arr);
        return optimal(arr);
    }

    private static int brute(int[] arr) {
//      /**
//       * Brute; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        int min = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
//       ====================================
//       */
    }

    private static int optimal(int[] arr) {
//      /**
//       * Optimal; TC:[ O(log2(N)) ]; SC:[ O(1) ]
//       ====================================
        int low = 0;
        int high = arr.length-1;
        int min = arr[0];
        while (low<=high){
            if (arr[low] <= arr[high]) {
                min  = Math.min(min, arr[low]);
                break;
            }
            int mid = low + ((high-low)/2);
            if (arr[low] <= arr[mid]) {
                min  = Math.min(min, arr[low]);
                low = mid+1;
            } else {
                min  = Math.min(min, arr[mid]);
                high = mid-1;
            }
        }
        return min;
//       ====================================
//       */
    }

}
