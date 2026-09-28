package DSA.main.S04_BinarySearch.BS_03_2D;

public class L04_FindPeakElementIn2DMatrix {

    /** Problem Statement: Given a 0-indexed n x m matrix mat where no two adjacent cells are equal,
     * find any peak element mat[i][j] and return the array [i, j]. A peak element in a 2D grid is an element
     * that is strictly greater than all of its adjacent neighbours to the left, right, top, and bottom.
     * Assume that the entire matrix is surrounded by an outer perimeter with the value -1 in each cell.
     * Note: As there can be many peak values, 1 is given as output
     * if the returned index is a peak number, otherwise 0.
     */

    public static int[] findPeakElementIn2DMatrix(int[][] arr) {
//        return brute(arr);
//        return better(arr);
        return optimal(arr);
    }

    private static int[] brute(int[][] arr) {
//      /**
//       * Brute; TC:[ O(N*M*4) ]; SC:[ O(1) ]
//       ====================================
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                int u = i==0 ? -1 : arr[i-1][j];
                int r = j==arr[i].length-1 ? -1 : arr[i][j+1];
                int b = i==arr.length-1 ? -1 : arr[i+1][j];
                int l = j==0 ? -1 : arr[i][j-1];
                if ( arr[i][j] >  u
                        && arr[i][j] > r
                        && arr[i][j] > b
                        && arr[i][j] >  l) return new int[] {i, j};
            }
        }
        return new int[] {-1, -1};
//       ====================================
//       */
    }

    private static int[] better(int[][] arr) {
//      /**
//       * Better; TC:[ O(N*M) ]; SC:[ O(1) ]
//       ====================================
        int maxi = 0;
        int maxj = 0;
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if (arr[i][j] > arr[maxi][maxj]) {
                    maxi = i;
                    maxj = j;
                }
            }
        }
        return new int[] {maxi, maxj};
//       ====================================
//       */
    }

    private static int[] optimal(int[][] arr) {
//      /**
//       * Optimal; TC:[ O(N*log2(M)) ]; SC:[ O(1) ]
//       ====================================
        int low = 0;
        int high = arr[0].length-1;
        while (low<=high) {
            int mid = low + high >>> 1;
            int i = largestElementInCol(arr, mid);
            int r = mid==arr[i].length-1 ? -1 : arr[i][mid+1];
            int l = mid==0 ? -1 : arr[i][mid-1];
            if ( arr[i][mid] > r && arr[i][mid] >  l) return new int[] {i, mid};
            else if (arr[i][mid] > r && arr[i][mid] <  l) high = mid - 1;
            else low = mid + 1;
        }
        return new int[] {-1, -1};
//       ====================================
//       */
    }

    private static int largestElementInCol(int[][] arr, int mid) {
        int maxi = 0;
        for (int i=1; i<arr.length; i++) {
            if (arr[i][mid] > arr[maxi][mid]) maxi = i;
        }
        return maxi;
    }

}
