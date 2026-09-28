package DSA.main.S04_BinarySearch.BS_02_OnAns;

public class L02_NthRootOfNumb {

    /** Problem Statement: Given two numbers N and M, find the Nth root of M.
     * The nth root of a number M is defined as a number X when raised to the power N equals M.
     * If the 'nth root is not an integer, return -1.
     */

    public static int nthRootOfNumb(int n, int m) {
//        return brute(n, m);
        return optimal(n, m);
    }

    private static int brute(int n, int m) {
//      /**
//       * Brute; TC:[ O(M*N) ]; SC:[ O(1) ]
//       ====================================
        for (int i=1; i<m; i++) {
            int expo = expoMethodBrute(n, i, m);
            if(expo == 0) return i;
            else if (expo == 2) break;
        }
        return -1;
//       ====================================
//       */
    }

    private static int expoMethodBrute(int n, int i, int m) {
        int ans = 1;
        for (int j=n; j>=1; j--) {
            ans *= i;
            if (ans == m) return 0;
            else if (ans > m) return 2;
        }
        return 1;
    }

    private static int optimal(int n, int m) {
//      /**
//       * Optimal; TC:[ O(log2(M)*log2(N)) ]; SC:[ O(1) ]
//       ====================================
        int low = 1;
        int high = m;
        while (low<=high) {
            int mid = low + ((high-low)/2);
            int expo = powerExpoOpt(n, mid, m);
            if(expo == 0) return mid;
            else if (expo == 2) high = mid-1;
            else low = mid+1;
        }
        return -1;
//       ====================================
//       */
    }

    private static int powerExpoOpt(int n, int mid, int m) {
        int ans = 1;
        while (n>0) {
            if (n%2 == 1) {
                ans = ans*mid;
                n--;
            } else {
                mid *= mid;
                n /= 2;
            }
            if (ans == m) return 0;
            else if (ans > m) return 2;
        }
        return 1;
    }

}
