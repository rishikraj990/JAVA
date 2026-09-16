package DSA.main.S03_Array;

import static DSA.main.Utilities.Utility.copyMatrix;
import static DSA.main.Utilities.Utility.createArrayMatrixWithDefaultValue;
import static DSA.main.Utilities.Utility.reverse;
import static DSA.main.Utilities.Utility.swap;

public class L26_RotateMatrixBy90Degrees {

    /** Problem Statement: Given an N * N 2D integer matrix, rotate the matrix by 90 degrees clockwise.
     * The rotation must be done in place, meaning the input 2D matrix must be modified directly.
     */

    public static void rotateMatrixBy90Degrees(int[][] arr) {
//        brute(arr);
        optimal(arr);
    }

    private static void brute(int[][] arr) {
//      /**
//       * Brute; TC:[ O(N*M) ]; SC:[ O(N*M) ]
//       ====================================
        int n = arr.length;
        int[][] ans = createArrayMatrixWithDefaultValue(n, 0);
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                ans[j][n-i-1] = arr[i][j];
            }
        }
        copyMatrix(arr, ans);
//       ====================================
//       */
    }

    private static void optimal(int[][] arr) {
//      /**
//       * Optimal; TC:[ O(N/2 * M/2) + O(N * N/2) ]; SC:[ O(1) ]
//       ====================================
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                swap(arr, i, j, j, i);
            }
        }
        for (int i=0; i<n; i++){
            reverse(arr[i]);
        }
//       ====================================
//       */
    }

}
