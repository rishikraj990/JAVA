package DSA.main.S05_Strings;

import java.util.Stack;

public class L09_MaxNestingDepthOfParenthesis {

    /** Problem Statement: A string s is a valid parentheses string (VPS) if it meets the following conditions:
     * It only contains digits 0-9, arithmetic operators +, -, *, /, and parentheses (, ).
     * The parentheses are balanced and correctly nested.
     * Your task is to compute the maximum nesting depth of parentheses in s.
     * The nesting depth is the highest number of parentheses that are open at the same time at any point in the string.
     */

    public static int maxNestingDepthOfParenthesis(String str) {
//        return brute(str);
        return optimal(str);
    }

    private static int brute(String str) {
//      /**
//       * Brute; TC:[ O(N) ]; SC:[ O(N/2) ]
//       ====================================
        Stack<Character> stack = new Stack<>();
        int ans = 0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
                ans = Math.max(ans, stack.size());
            } else if (str.charAt(i) == ')') {
                stack.pop();
            }
        }
        return ans;
//       ====================================
//       */
    }

    private static int optimal(String str) {
//      /**
//       * Optimal; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        int ans = 0;
        int cur = 0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == '(') {
                cur++;
                ans = Math.max(ans, cur);
            } else if (str.charAt(i) == ')') {
                cur--;
            }
        }
        return ans;
//       ====================================
//       */
    }

}
