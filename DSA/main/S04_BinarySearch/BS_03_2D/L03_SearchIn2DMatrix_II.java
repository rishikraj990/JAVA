package DSA.main.S04_BinarySearch.BS_03_2D;

public class L03_SearchIn2DMatrix_II {

    /** Problem Statement: Given a 2D array matrix where each row is sorted in ascending order from left to right
     * and each column is sorted in ascending order from top to bottom,
     * write an efficient algorithm to search for a specific integer target in the matrix.
     */

    public static boolean searchIn2DMatrix_II(int[][] arr, int t) {
//        return brute(arr, t);
//        return better(arr, t);
        return optimal(arr, t);
    }

    private static boolean brute(int[][] arr, int t) {
//      /**
//       * Brute; TC:[ O(N*M) ]; SC:[ O(1) ]
//       ====================================
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if (arr[i][j] == t) return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
//       ====================================
//       */
    }

    private static boolean better(int[][] arr, int t) {
//      /**
//       * Better; TC:[ O(N + log2(M)) ]; SC:[ O(1) ]
//       ====================================
        for (int i=0; i<arr.length; i++) {
            if (arr[i][0] <= t && arr[i][arr[i].length-1] >= t) {
                int low = 0;
                int high = arr[i].length-1;
                while (low<=high) {
                    int mid = low + ((high-low)/2);
                    if (arr[i][mid] == t) return Boolean.TRUE;
                    else if (arr[i][mid] > t) high = mid-1;
                    else low = mid+1;
                }
            }
        }
        return Boolean.FALSE;
//       ====================================
//       */
    }

    private static boolean optimal(int[][] arr, int t) {
//      /**
//       * Optimal; TC:[ O(N+M) ]; SC:[ O(1) ]
//       ====================================
        int row = 0;
        int col = arr[0].length-1;
        while (row <= arr.length-1 && col >= 0) {
            if (arr[row][col] == t) return Boolean.TRUE;
            else if (arr[row][col] > t) col--;
            else row++;
        }
        return Boolean.FALSE;
//       ====================================
//       */
    }

}
