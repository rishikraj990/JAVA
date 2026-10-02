package DSA.main.S05_Strings;

public class L06_Check1StringIsRotationOf2nd {

    /** Problem Statement: Given two strings s and goal, return true if and
     * only if s can become goal after some number of shifts on s.
     * A shift on s consists of moving the leftmost character of s to the rightmost position.
     * For example, if s = "abcde", then it will be "bcdea" after one shift.
     */

    public static boolean check1StringIsRotationOf2nd(String str1, String str2) {
//        return brute(str1, str2);
        return optimal(str1, str2);
    }

    private static boolean brute(String str1, String str2) {
//      /**
//       * Brute; TC:[ O(N-1) ]; SC:[ O(1) ]
//       ====================================
        int n = str1.length();
        int m = str2.length();
        if (n!=m) return Boolean.FALSE;
        if (str1.equals(str2)) return Boolean.TRUE;
        for (int i=0; i<n-1; i++) {
            String temp = str1.substring(i+1) + str1.substring(0, i+1);
            if (temp.equals(str2)) return Boolean.TRUE;
        }
        return Boolean.FALSE;
//       ====================================
//       */
    }

    private static boolean optimal(String str1, String str2) {
//      /**
//       * Optimal; TC:[ O(1) ]; SC:[ O(1) ]
//       ====================================
        if (str1.length() != str2.length()) return Boolean.FALSE;
        String temp = str1.concat(str1);
        return temp.contains(str2);
//       ====================================
//       */
    }

}
