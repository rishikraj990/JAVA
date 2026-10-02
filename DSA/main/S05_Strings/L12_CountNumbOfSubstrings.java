package DSA.main.S05_Strings;

public class L12_CountNumbOfSubstrings {

    /** Problem Statement: Number of substrings of a string
     * Find total number of non-empty substrings of a string with N characters.
     */

    public static int countNumbOfSubstrings(String str) {
//        return brute(str);
        return optimal(str);
    }

    private static int brute(String str) {
//      /**
//       * Brute; TC:[ O(N²)]; SC:[ O(1) ]
//       ====================================
        int ans = 0;
        int n = str.length();
        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                ans++;
            }
        }
        return ans;
//       ====================================
//       */
    }

    private static int optimal(String str) {
//      /**
//       * Optimal; TC:[ O(1) ]; SC:[ O(1) ]
//       ====================================
        int n = str.length();
        return (n * (n+1))/2;
//       ====================================
//       */
    }

}
