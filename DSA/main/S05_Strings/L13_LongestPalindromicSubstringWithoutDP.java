package DSA.main.S05_Strings;

public class L13_LongestPalindromicSubstringWithoutDP {

    /** Problem Statement: Given a string s, return the longest palindromic substring in s Without DP.
     * A palindromic substring is a contiguous sequence of characters within the string
     * that reads the same forward and backward.
     */

    public static String longestPalindromicSubstringWithoutDP(String str) {
//        return brute(str);
        return better(str);
//        return optimal(str);  -> With DP
    }

    private static String brute(String str) {
//      /**
//       * Brute; TC:[ O(N^3) ]; SC:[ O(1) ]
//       ====================================
        int n = str.length();
        String ans = "";
        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                String subString = str.substring(i, j+1);
                if (isPalindrome(subString) && subString.length()>ans.length()) ans = subString;
            }
        }
        return ans;
//       ====================================
//       */
    }

    private static boolean isPalindrome(String subString) {
        int i = 0;
         int n = subString.length()-1;
         while (i<n) {
             if (subString.charAt(i) != subString.charAt(n)) return Boolean.FALSE;
             i++;
             n--;
         }
         return Boolean.TRUE;
    }

    private static String better(String str) {
//      /**
//       * Better; TC:[ O(N^2) ]; SC:[ O(1) ]
//       ====================================
        int n = str.length();
        int start = 0;
        int end = 0;
        for (int i=0; i<n; i++) {
            int l1 = expandForPal(str, i, i);
            int l2 = expandForPal(str, i, i+1);
            int l = Math.max(l1, l2);
            if (l > end - start + 1) {
                start = i - (l - 1) / 2;
                end = i + l / 2;
            }
        }
        return str.substring(start, end + 1);
//       ====================================
//       */
    }

    private static int expandForPal(String str, int left, int right) {
        while (left >= 0 && right < str.length()
                && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

}
