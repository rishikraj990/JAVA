package DSA.main.S03_Array;

import static DSA.main.Utilities.Utility.createArrayWithDefaultValue;
import static DSA.main.Utilities.Utility.updateColumn;
import static DSA.main.Utilities.Utility.updateRow;

public class L25_SetMatrixZeroes {

    /** Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its
     * entire column and row to 0 and then return the matrix.
     */

    public static int[][] setMatrixZeros(int[][] arr) {
//        return brute(arr);
//        return better(arr);
        return optimal(arr);
    }

    private static int[][] brute(int[][] arr) {
//      /**
//       * Brute; TC:[ O(N*M * (N+M)) + O(N*M ]; SC:[ O(1) ]
//       ====================================
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                if(arr[i][j] == 0){
                    updateRow(arr, i, -1, 0);
                    updateColumn(arr, j, -1, 0);
                }
            }
        }
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                if(arr[i][j] == -1){
                    arr[i][j] =0;
                }
            }
        }
        return arr;
//       ====================================
//       */
    }

    private static int[][] better(int[][] arr) {
//      /**
//       * Better; TC:[ O(2(N * M) ]; SC:[ O(N+M) ]
//       ====================================
        int[] col = createArrayWithDefaultValue(arr[0].length, 0);
        int[] row = createArrayWithDefaultValue(arr.length, 0);
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                if(arr[i][j] == 0){
                    col[j] = 1;
                    row[i] = 1;
                }
            }
        }
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                if(col[j] == 1 || row[i] == 1){
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
//       ====================================
//       */
    }

    private static int[][] optimal(int[][] arr) {
//      /**
//       * Optimal; TC:[ O(2(N*M)) ]; SC:[ O(1) ]
//       ====================================
        int col = 1;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                if(arr[i][j] == 0){
                    if(j==0) {
                        col = 0;
                    } else {
                        arr[0][j] = 0;
                    }
                    arr[i][0] = 0;
                }
            }
        }
        for (int i=1; i<arr.length; i++){
            for (int j=1; j<arr[i].length; j++){
                if(arr[i][0] == 0 || arr[0][j] == 0){
                    arr[i][j] = 0;
                }
            }
        }
        if(arr[0][0] == 0){
            for (int j=0; j<arr[0].length; j++){
                arr[0][j] = 0;
            }
        }
        if(col == 0){
            for (int i=0; i<arr.length; i++){
                arr[i][0] = 0;
            }
        }
        return arr;
//       ====================================
//       */
    }

}
