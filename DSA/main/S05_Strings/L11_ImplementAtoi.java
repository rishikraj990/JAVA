package DSA.main.S05_Strings;

public class L11_ImplementAtoi {

    /** Problem Statement: Implement the function myAtoi(s) which converts the
     * given string s to a 32-bit signed integer.
     *
     * Steps to Implement:
     * First, ignore any leading whitespace characters ' ' until the first non-whitespace character is found.
     * Check the next character to determine the sign. If it’s a '-', the number should be negative. If it’s a '+',
     * the number should be positive. If neither is found, assume the number is positive.
     * Read the digits and convert them into a number. Stop reading once a non-digit character is
     * encountered or the end of the string is reached. Leading zeros should be ignored during conversion.
     * The result should be clamped within the 32-bit signed integer range: [-2147483648, 2147483647].
     * If the computed number is outside this range, return -2147483648 if the number is less than -2147483648,
     * or return 2147483647 if the number is greater than 2147483647.
     * Finally, return the computed number after applying all the above steps.
     */

    public static int implementAtoi(String str) {
        return optimal(str);
    }

    private static int optimal(String str) {
//      /**
//       * Optimal; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        int n = str.length();
        int i = 0;
        while (i < n && str.charAt(i) == ' ') {
            i++;
        }
        int sym = 1;
        if (i < n && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
            if (str.charAt(i) == '-') sym = -1;
            i++;
        }
        int ans = 0;
        while (i < n && Character.isDigit(str.charAt(i))) {
            int digit = str.charAt(i) - '0';
            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                return sym == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans = ans * 10 + digit;
            i++;
        }
        return ans * sym;
//       ====================================
//       */
    }

}
