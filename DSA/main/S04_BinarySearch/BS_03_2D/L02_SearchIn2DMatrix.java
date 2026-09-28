package DSA.main.S04_BinarySearch.BS_03_2D;

public class L02_SearchIn2DMatrix {

    /** Problem Statement: Given a 2-D array mat where the elements of each row are sorted in non-decreasing order,
     * and the first element of a row is greater than the last element of the previous row (if it exists),
     * and an integer target, determine if the target exists in the given mat or not.
     */

    public static boolean searchIn2DMatrix(int[][] arr, int t) {
//        return brute(arr, t);
        return better(arr, t);
//        return optimal(arr, t);
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
//       * Optimal; TC:[ O(log2(N*M)) ]; SC:[ O(1) ]
//       ====================================
        int n = arr.length;
        int m = arr[0].length;
        int low = 0;
        int high = (n * m) - 1;
        while (low<=high) {
            int mid = low + ((high-low)/2);
            int row = mid/m;
            int col = mid%m;
            if (arr[row][col] == t) return Boolean.TRUE;
            else if (arr[row][col] > t) high = mid-1;
            else low = mid+1;
        }
        return Boolean.FALSE;
//       ====================================
//       */
    }

}
