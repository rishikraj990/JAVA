package DSA.main.S05_Strings;

import java.util.Stack;

public class L02_RevWordsInString_PalindromeCheck {

    /** Problem Statement: Given an input string, containing upper-case and lower-case letters, digits,
     * and spaces( ' ' ). A word is defined as a sequence of non-space characters.
     * The words in s are separated by at least one space.
     * Return a string with the words in reverse order, concatenated by a single space.
     */

    public static String revWordsInString_PalindromeCheck(String str) {
//        return brute(str);
        return optimal(str);
    }

    private static String brute(String str) {
//      /**
//       * Brute; TC:[ O(N+N) ]; SC:[ O(N+N) ]
//       ====================================
        Stack<Character> stk = new Stack<Character>();
        StringBuilder res = new StringBuilder();
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) != ' ') {
                stk.push(str.charAt(i));
            } else {
                while (!stk.empty()) {
                    res.insert(0, stk.pop());
                }
                res.insert(0, str.charAt(i));
            }
        }
        while (!stk.empty()) {
            res.insert(0, stk.pop());
        }
        return res.toString();
//       ====================================
//       */
    }

    private static String optimal(String str) {
//      /**
//       * Optimal; TC:[ O(N) ]; SC:[ O(N) ]
//       ====================================
        StringBuilder res = new StringBuilder();
        int i = str.length()-1;
        while (i >=0) {
            while (i>=0 && str.charAt(i) == ' ') {
                i--;
            }
            if (i < 0) break;
            int e = i;
            while (i >=0 && str.charAt(i) != ' '){
                i--;
            }
            if (res.length() > 0) {
                res.append(" ");
            }
            res.append(str, i + 1, e + 1);
        }
        return res.toString();
//       ====================================
//       */
    }

}
