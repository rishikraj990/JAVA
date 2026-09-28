package DSA.main.S04_BinarySearch.BS_01_1D;

public class L08_SearchInRotatedSortedArray_1 {

    /** Problem Statement: Given an integer array nums, sorted in ascending order (with distinct values)
     * and a target value k. The array is rotated at some pivot point that is unknown.
     * Find the index at which k is present and if k is not present return -1.
     */

    public static int searchInRotatedSortedArray_1(int[] arr, int t) {
//        return brute(arr, t);
        return optimal(arr, t);
    }

    private static int brute(int[] arr, int t) {
//      /**
//       * Brute; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        for (int i=0; i<arr.length; i++){
            if (arr[i] == t){
                return i;
            }
        }
        return -1;
//       ====================================
//       */
    }

    private static int optimal(int[] arr, int t) {
//      /**
//       * Optimal; TC:[ O(log2(N)) ]; SC:[ O(1) ]
//       ====================================
        int low = 0;
         int high  = arr.length-1;
         while (low <= high) {
             int mid = low + ((high-low)/2);
             if (arr[mid] == t) return mid;
             if (arr[mid] >= arr[low]) {
                 if (arr[mid] > t && arr[low] <= t) high = mid-1;
                 else low = mid+1;
             } else {
                 if (arr[mid] < t && arr[high] >= t) low = mid+1;
                 else high = mid-1;
             }
         }
         return -1;
//       ====================================
//       */
    }

}
