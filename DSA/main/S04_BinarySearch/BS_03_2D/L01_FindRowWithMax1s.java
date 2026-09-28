package DSA.main.S04_BinarySearch.BS_03_2D;

public class L01_FindRowWithMax1s {

    /** Problem Statement: Given a non-empty grid mat consisting of only 0s and 1s,
     * where all the rows are sorted in ascending order, find the index of the row with the maximum number of ones.
     * If two rows have the same number of ones, consider the one with a smaller index.
     * If no 1 exists in the matrix, return -1.
     */

    public static int findRowWithMax1s(int[][] arr) {
//        return brute(arr);
        return optimal(arr);
    }

    private static int brute(int[][] arr) {
//      /**
//       * Brute; TC:[ O(N*M) ]; SC:[ O(1) ]
//       ====================================
        int ans = -1;
        int max1 = 0;
        for (int i=0; i<arr.length; i++) {
            int cnt = 0;
            for (int j=0; j<arr[i].length; j++) {
                cnt += arr[i][j] == 1 ? 1 : 0;
            }
            if (cnt > max1) {
                max1 = cnt;
                ans = i;
            }
        }
        return ans;
//       ====================================
//       */
    }

    private static int optimal(int[][] arr) {
//      /**
//       * Optimal; TC:[ O(N*log2(M)) ]; SC:[ O(1) ]
//       ====================================
        int ans = -1;
        int max1 = 0;
        for (int i=0; i<arr.length; i++) {
            int low = 0;
            int high = arr[i].length-1;
            while (low<=high) {
                int mid = low + ((high-low)/2);
                if (arr[i][mid] == 1) high = mid-1;
                else low = mid+1;
            }
            if ((arr[i].length - low) > max1) {
                max1 = arr[i].length - low;
                ans = i;
            }
        }
        return ans;
//       ====================================
//       */
    }

}
