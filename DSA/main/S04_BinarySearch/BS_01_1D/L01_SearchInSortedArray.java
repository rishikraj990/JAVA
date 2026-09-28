package DSA.main.S04_BinarySearch.BS_01_1D;

public class L01_SearchInSortedArray {

    /** Problem Statement: You are given a sorted array of integers and a target,
     * your task is to search for the target in the given array and find the index.
     * Assume the given array does not contain any duplicate numbers.
     * If the target is not found, return -1
     */

    public static int searchInSortedArray(int[] arr, int t) {
//        return brute(arr, t);
        return optimal_Iterative(arr, t);
//        return optimal_Recursive(arr, t);
    }

    private static int brute(int[] arr, int t) {
//      /**
//       * Brute; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        for (int i=0; i<arr.length; i++) {
            if(arr[i] == t) {
                return i;
            }
        }
        return -1;
//       ====================================
//       */
    }

    private static int optimal_Iterative(int[] arr, int t) {
//      /**
//       * Optimal; TC:[ O(log2(N)) ]; SC:[ O(1) ]
//       ====================================
        int low = 0;
        int high = arr.length -1;
        while (low<=high) {
            int mid = low + ((high-low)/2);
            if (arr[mid] == t) return mid;
            else if (t < arr[mid]) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
//       ====================================
//       */
    }

    private static int optimal_Recursive(int[] arr, int t) {
//      /**
//       * Optimal; TC:[ O(log2(N)) ]; SC:[ O(1) ]
//       ====================================
        return binarSearch_Recursive(arr, t, 0, arr.length-1);
//       ====================================
//       */
    }

    private static int binarSearch_Recursive(int[] arr, int t, int low, int high) {
        if(low>high) return -1;
        int mid = low + ((high-low)/2);
        if (arr[mid] == t) return mid;
        else if (t < arr[mid]) return binarSearch_Recursive(arr, t, low, mid-1);
        else return binarSearch_Recursive(arr, t, mid+1, high);
    }

}
