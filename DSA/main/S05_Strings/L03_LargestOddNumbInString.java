package DSA.main.S05_Strings;

public class L03_LargestOddNumbInString {

    /** Problem Statement: You are given a string num, representing a large integer.
     * Return the largest-valued odd integer (as a string) that is a non-empty substring of num,
     * or an empty string "" if no odd integer exists.
     * A substring is a contiguous sequence of characters within a string.
     */

    public static String largestOddNumbInString(String str) {
//        return brute(str);
        return optimal(str);
    }

    private static String brute(String str) {
//      /**
//       * Brute; TC:[ O(N*N) ]; SC:[ O(1) ]
//       ====================================
        int n = str.length();
        int max = -1;
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<=n; j++) {
                String temp = str.substring(i, j);
                int tempInt = Integer.parseInt(temp);
                if (tempInt%2==1 && tempInt > max) max = tempInt;
            }
        }
        return max== -1 ? "" : String.valueOf(max);
//       ====================================
//       */
    }

    private static String optimal(String str) {
//      /**
//       * Optimal; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        int n = str.length();
        for (int i=n-1; i>=0; i--) {
            if (Integer.parseInt(String.valueOf(str.charAt(i))) % 2 == 1) return str.substring(0, i+1);
        }
        return "";
//       ====================================
//       */
    }

}
