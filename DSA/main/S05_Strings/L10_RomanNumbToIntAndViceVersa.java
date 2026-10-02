package DSA.main.S05_Strings;

import java.util.Map;

public class L10_RomanNumbToIntAndViceVersa {

    /** Problem Statement: Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * For example, II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II.
     * The number 27 is written as XXVII, which is XX + V + II.
     * Roman numerals are usually written largest to smallest from left to right. However,
     * the numeral for four is not IIII. Instead, the number four is written as IV.
     * Because the one is before the five we subtract it making four.
     * The same principle applies to the number nine, which is written as IX.
     * There are six instances where subtraction is used:
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * Given a roman numeral, convert it to an integer.
     *
     * Roman numerals are formed by appending the conversions of decimal place values from highest to lowest.
     * Converting a decimal place value into a Roman numeral has the following rules:
     * If the value does not start with 4 or 9, select the symbol of the maximal value that can be
     * subtracted from the input, append that symbol to the result,
     * subtract its value, and convert the remainder to a Roman numeral.
     * If the value starts with 4 or 9 use the subtractive form representing one symbol subtracted
     * from the following symbol, for example, 4 is 1 (I) less than 5 (V): IV and 9 is 1 (I) less than 10 (X): IX.
     * Only the following subtractive forms are used: 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and 900 (CM).
     * Only powers of 10 (I, X, C, M) can be appended consecutively at most 3 times to represent multiples of 10.
     * You cannot append 5 (V), 50 (L), or 500 (D) multiple times.
     * If you need to append a symbol 4 times use the subtractive form.
     * Given an integer, convert it to a Roman numeral.
     */

    public static String romanNumbToIntAndViceVersa(String str) {
        return optimal(str);
    }

    private static String optimal(String str) {
//      /**
//       * Optimal; TC:[ O(N+N) ]; SC:[ O(1) ]
//       ====================================
        int intger = romanNumbToInt(str);
        System.out.println("Converted Integer is: " + intger);
        return intNumbToRoman(intger);
//       ====================================
//       */
    }

    private static int romanNumbToInt(String str) {
//      /**
//       * Optimal; TC:[ O(N) ]; SC:[ O(7) ]
//       ====================================
        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        int ans = 0;
        for (int i=0; i<str.length(); i++) {
            int cur = map.get(str.charAt(i));
            if (i+1 < str.length() && cur < map.get(str.charAt(i+1))) ans -= cur;
            else ans += cur;
        }
        return ans;
//       ====================================
//       */
    }

    private static String intNumbToRoman(int intger) {
//      /**
//       * Optimal; TC:[ O(13*K) ]; SC:[ O(13 + 13) ]
//       ====================================
        int[] values = {
                1000, 900, 500, 400,
                100, 90, 50, 40,
                10, 9, 5, 4, 1
        };

        String[] symbols = {
                "M", "CM", "D", "CD",
                "C", "XC", "L", "XL",
                "X", "IX", "V", "IV", "I"
        };
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<values.length; i++) {
            while (values[i]<=intger) {
                sb.append(symbols[i]);
                intger -= values[i];
            }
        }
        return sb.toString();
//       ====================================
//       */
    }

}
