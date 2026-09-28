package DSA.main.S04_BinarySearch.BS_01_1D;

public class L09_SearchInRotatedSortedArray_2 {

    /** Problem Statement: Given an integer array arr of size N, sorted in ascending order
     * (may contain duplicate values) and a target value k.
     * Now the array is rotated at some pivot point unknown to you.
     * Return True if k is present and otherwise, return False.
     */

    public static boolean searchInRotatedSortedArray_2(int[] arr, int t) {
//        return brute(arr, t);
        return optimal(arr, t);
    }

    private static boolean brute(int[] arr, int t) {
//      /**
//       * Brute; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == t){
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
//       ====================================
//       */
    }

    private static boolean optimal(int[] arr, int t) {
//      /**
//       * Optimal; TC:[ O(log2(N)) -> Average; O(N/2) -> Worst ]; SC:[ O(1) ]
//       ====================================
        int low = 0;
        int high = arr.length-1;
        while (low<=high) {
            int mid = low + ((high-low)/2);
            if (arr[mid] == t) return Boolean.TRUE;
            if (arr[low]==arr[mid] && arr[mid]==arr[high]) {
                low++;
                high--;
                continue;
            }
            if (arr[mid] >= arr[low]) {
                if (arr[low]<=t && arr[mid]>t) {
                    high = mid-1;
                } else {
                    low = mid+1;
                }
            } else {
                if (arr[high]>=t && arr[mid]<t) {
                    low = mid+1;
                } else {
                    high = mid-1;
                }
            }
        }
        return Boolean.FALSE;
//       ====================================
//       */
    }

}
