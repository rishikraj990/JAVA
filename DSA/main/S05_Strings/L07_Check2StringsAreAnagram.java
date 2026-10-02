package DSA.main.S05_Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L07_Check2StringsAreAnagram {

    /** Problem Statement: Valid Anagram,
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     * Two strings are considered anagrams if they contain the same characters with exactly the same frequencies,
     * regardless of their order.
     */

    public static boolean check2StringsAreAnagram(String str1, String str2) {
//        return brute(str1, str2);
        return optimal(str1, str2);
    }

    private static boolean brute(String str1, String str2) {
//      /**
//       * Brute; TC:[ O(2 * Nlog2(N)) ]; SC:[ O(N+N) ]
//       ====================================
        if (str1.length() != str2.length()) return Boolean.FALSE;
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
//       ====================================
//       */
    }

    private static boolean optimal(String str1, String str2) {
//      /**
//       * Optimal; TC:[ O(N+N) ]; SC:[ O(N) ]
//       ====================================
        if (str1.length() != str2.length()) return Boolean.FALSE;
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<str1.length(); i++) {
            char c1 = str1.charAt(i);
            map.put(c1, map.getOrDefault(c1, 0) + 1);
        }
        for (int i=0; i<str2.length(); i++) {
            char c2 = str2.charAt(i);
            if (!map.containsKey(c2)) return Boolean.FALSE;
            int feq = map.get(c2) - 1;
            if (feq <= 0) map.remove(c2);
            else map.put(c2, feq);
        }
        return map.isEmpty();
//       ====================================
//       */
    }

}
