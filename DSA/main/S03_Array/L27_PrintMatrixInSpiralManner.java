package DSA.main.S03_Array;

import java.util.LinkedList;

public class L27_PrintMatrixInSpiralManner {

    /** Problem Statement: Given a Matrix, print the given matrix in spiral order.
     */

    public static LinkedList<Integer> printMatrixInSpiralManner(int[][] arr) {
        return optimal(arr);
    }

    private static LinkedList<Integer> optimal(int[][] arr) {
//      /**
//       * Optimal; TC:[ O(N * M) ]; SC:[ O(N+M) ]
//       ====================================
        LinkedList<Integer> ll = new LinkedList<>();
        int top = 0;
        int right = arr[0].length-1;
        int bottom = arr.length-1;
        int left = 0;
        while (left <= right && top <= bottom) {
            for (int i=left; i<=right; i++){
                ll.add(arr[top][i]);
            }
            top++;
            for (int i=top; i<=bottom; i++){
                ll.add(arr[i][right]);
            }
            right--;
            if (top < bottom) {
                for (int i=right; i>=left; i--){
                    ll.add(arr[bottom][i]);
                }
                bottom--;
            }
            if (left < right) {
                for (int i=bottom; i>=top; i--){
                    ll.add(arr[i][left]);
                }
                left++;
            }
        }
        return ll;
//       ====================================
//       */
    }

}
