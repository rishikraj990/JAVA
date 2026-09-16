package DSA.main.S03_Array;

import java.util.LinkedList;

public class L29_PascalsTriangle_I {

    /** Problem Statement: Write a program to generate Pascal's triangle. In Pascal’s triangle, each number is the
     * sum of the two numbers directly above it as shown in the figure below:
     */

    public static int pascalsTriangle(int r, int c) {
        return optimal_placeValue(r, c);

//        return brute_row(n);
//        return optimal_row(n);

//        return optimal_triangle(n);
    }

    private static int optimal_placeValue(int r, int c) {
//      /**
//       * Optimal; TC:[ O(C) ]; SC:[ O(1) ]
//       ====================================
//        n       row-1                 n!
//         C  ->      C         -> ------------ ->
//          r          column-1     r! x (n-r)!

        r--;
        c--;
        long res = 1;
        long div = 1;
        for (int i=0; i<=c; i++){
            res *= (r-i);
            div *= (i+1);
        }
        return Math.toIntExact(res / div);
//       ====================================
//       */
    }

    public static LinkedList<Integer> brute_row(int n) {
//      /**
//       * Brute; TC:[ O(N * C) ]; SC:[ O(1) ]
//       ====================================
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i=0; i<n; i++){
            ll.add(optimal_placeValue(n, i));
        }
        return ll;
//       ====================================
//       */
    }

    public static LinkedList<Integer> optimal_row(int n) {
//      /**
//       * Optimal; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        LinkedList<Integer> ll = new LinkedList<>();
        int ans = 1;
        ll.add(ans);
        for (int i=1; i<n; i++){
            ans = (ans * (n-i)) / i;
            ll.add(ans);
        }
        return ll;
//       ====================================
//       */
    }

    public static LinkedList<LinkedList<Integer>> optimal_triangle(int n) {
//      /**
//       * Optimal; TC:[ O(N^2) ]; SC:[ O(1) ]
//       ====================================
        LinkedList<LinkedList<Integer>> ll = new LinkedList<>();
        for (int i=1; i<=n; i++) {
            LinkedList<Integer> temp = optimal_row(i);
            ll.add(temp);
        }
        return ll;
//       ====================================
//       */
    }

}
