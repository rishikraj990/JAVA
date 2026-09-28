package DSA.main.S04_BinarySearch.BS_01_1D;

import static DSA.main.S04_BinarySearch.BS_01_1D.L02_LowerBound.lowerBound;

public class L05_FloorCeilInSortedArray {

    /** Problem Statement: You're given an sorted array arr of n integers and an integer x.
     * Find the floor and ceiling of x in arr[0..n-1].
     * The floor of x is the largest element in the array which is smaller than or equal to x.
     * The ceiling of x is the smallest element in the array greater than or equal to x
     */

    public static int[] floorCeilInSortedArray(int[] arr, int t) {
        return optimal(arr, t);
    }

    private static int[] optimal(int[] arr, int x) {
//      /**
//       * Optimal; TC:[ O(2log2(N)) ]; SC:[ O(1) ]
//       ====================================
        return new int[]{findFloor(arr, x), arr[lowerBound(arr, x)]};
//       ====================================
//       */
    }

    private static int findFloor(int[] arr, int x) {
        int ans = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low<=high) {
            int mid = low + ((high-low)/2);
            if (arr[mid] <= x) {
                ans = arr[mid];
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return ans;
    }

}
