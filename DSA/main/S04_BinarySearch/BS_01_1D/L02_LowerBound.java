package DSA.main.S04_BinarySearch.BS_01_1D;

public class L02_LowerBound {

    /** Problem Statement: Given a sorted array of N integers and an integer x,
     * write a program to find the lower bound of x.
     * The lower bound algorithm finds the first or the smallest index in a sorted array
     * where the value at that index is greater than or equal to a given key i.e. x.
     * The lower bound is the smallest index, ind, where arr[ind] >= x.
     * But if any such index is not found, the lower bound algorithm returns n i.e. size of the given array.
     */

    public static int lowerBound(int[] arr, int x) {
//        return brute(arr, x);
        return optimal(arr, x);
    }

    private static int brute(int[] arr, int x) {
//      /**
//       * Brute; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        int ans = arr.length;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>= x) {
                ans = i;
                break;
            }
        }
        return ans;
//       ====================================
//       */
    }

    private static int optimal(int[] arr, int x) {
//      /**
//       * Optimal; TC:[ O(log2(N)) ]; SC:[ O(1) ]
//       ====================================
        int ans = arr.length;
        int low = 0;
        int high = arr.length-1;
        while (low <= high) {
            int mid = low + ((high-low)/2);
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
//       ====================================
//       */
    }

}
