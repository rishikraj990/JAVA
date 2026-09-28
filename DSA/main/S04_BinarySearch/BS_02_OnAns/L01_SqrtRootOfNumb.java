package DSA.main.S04_BinarySearch.BS_02_OnAns;

public class L01_SqrtRootOfNumb {

    /** Problem Statement: You are given a positive integer n. Your task is to find and return its square root.
     * If ‘n’ is not a perfect square, then return the floor value of sqrt(n).
     */

    public static int sqrtRootOfNumb(int n) {
//        return brute(n);
        return optimal(n);
    }

    private static int brute(int n) {
//      /**
//       * Brute; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        int ans = 1;
        for (int i=1; i<n; i++) {
            if (i*i <= n) ans = i;
            else break;
        }
        return ans;
//       ====================================
//       */
    }

    private static int optimal(int n) {
//      /**
//       * Optimal; TC:[ O(log2(N)) ]; SC:[ O(1) ]
//       ====================================
        int low = 1;
        int high = n;
        while (low<=high) {
            int mid = low + ((high-low)/2);
            if (mid*mid <= n) low = mid+1;
            else high = mid-1;
        }
        return high;
//       ====================================
//       */
    }

}
