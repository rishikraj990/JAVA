package DSA.main.S05_Strings;

public class L01_RemoveOutermostParentheses {

    /** Problem Statement: A valid parentheses string is defined by the following rules:
     * It is the empty string "".
     * If A is a valid parentheses string, then so is "(" + A + ")".
     * If A and B are valid parentheses strings, then A + B is also valid.
     * A primitive valid parentheses string is a non-empty valid string that cannot be
     * split into two or more non-empty valid parentheses strings.
     * Given a valid parentheses string s, consider its primitive decomposition:
     * s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.
     * Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.
     */

    public static String removeOutermostParentheses(String str) {
//        return brute(str);
        return optimal(str);
    }

    private static String brute(String str) {
//      /**
//       * Brute; TC:[ O(N^2) => Appending String Create an entire new string ]; SC:[ O(N) ]
//       ====================================
        String res = "";
        int balance = 0;
        int start = 0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == '(') {
                if (balance == 0) start = i;
                balance++;
            } else if (str.charAt(i) == ')') {
                balance--;
                if (balance == 0) res += str.substring(start+1, i);
            }
        }
        return res;
//       ====================================
//       */
    }

    private static String optimal(String str) {
//      /**
//       * Optimal; TC:[ O(N) ]; SC:[ O(N) ]
//       ====================================
        StringBuilder res = new StringBuilder();
        int balance  = 0;
        int start = 0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == '(') {
                if (balance == 0) start = i;
                balance++;
            } else if (str.charAt(i) == ')') {
                balance--;
                if (balance == 0) res.append(str, start + 1, i);
            }
        }
        return res.toString();
//       ====================================
//       */
    }

}
