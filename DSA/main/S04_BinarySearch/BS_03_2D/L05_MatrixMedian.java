package DSA.main.S04_BinarySearch.BS_03_2D;

import java.util.Arrays;

import static DSA.main.S04_BinarySearch.BS_01_1D.L03_UpperBound.upperBound;

public class L05_MatrixMedian {

    /** Problem Statement: Given a row-wise sorted matrix mat, find the median of all elements in the matrix.
     * Each row is sorted in non-decreasing order. The total number of elements is odd,
     * so the median is the exact middle element after all matrix values are arranged in sorted order.
     */

    public static int matrixMedian(int[][] arr) {
//        return brute(arr);
        return optimal(arr);
    }

    private static int brute(int[][] arr) {
//      /**
//       * Brute; TC:[ O((N*M) + (N*M)log2(N*M)) ]; SC:[ O(N*M) ]
//       ====================================
        int n = arr.length;
        int m = arr[0].length;
        int[] temp = new int[n*m];
        int k=0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                temp[k++] = arr[i][j];
            }
        }
        Arrays.sort(temp);
        return temp[(n*m)/2];
//       ====================================
//       */
    }

    private static int optimal(int[][] arr) {
//      /**
//       * Optimal; TC:[ O(N + log2(high-lowRange) * N × log2M) ]; SC:[ O(1) ]
//       ====================================
        int n = arr.length;
        int m = arr[0].length;

        int low = arr[0][0];
        int high = arr[0][m - 1];
        for (int i = 1; i < n; i++) {
            low = Math.min(low, arr[i][0]);
            high = Math.max(high, arr[i][m - 1]);
        }

        // This is how many elements may stay before the median.
        int required = (n * m) / 2;

        while (low < high) {
            // This is the current guessed median value.
            int mid = low + (high - low) / 2;
            int count = 0;

            for (int i = 0; i < n; i++) {
                // Count how many values in this row are less than or equal to mid.
                count += upperBound(arr[i], mid);
            }

            // Move right because too few elements are still less than or equal to mid.
            if (count <= required) {
                low = mid + 1;
            } else {
                // Keep mid in the answer range because it may already be the median.
                high = mid;
            }
        }
        return low;
//       ====================================
//       */
    }

}
