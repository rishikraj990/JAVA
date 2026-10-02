package DSA.main.S05_Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class L05_IsomorphicString {

    /** Problem Statement: Isomorphic Strings
     * Given two strings s and t, determine if they are isomorphic.
     * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
     * All occurrences of a character must be replaced with another character while preserving the order of characters.
     * No two characters may map to the same character, but a character may map to itself.
     */

    public static boolean isomorphicString(String str, String ttr) {
//        return brute(str, ttr);
//        return better(str, ttr);
        return optimal(str, ttr);
    }

    private static boolean brute(String str, String ttr) {
//      /**
//       * Brute; TC:[ O(N*N) ]; SC:[ O(1) ]
//       ====================================
        int n = str.length();
        int m = ttr.length();
        if (n!=m) return Boolean.FALSE;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (str.charAt(i)==str.charAt(j) && ttr.charAt(i)!=ttr.charAt(j)) return Boolean.FALSE;
                if (ttr.charAt(i)==ttr.charAt(j) && str.charAt(i)!=str.charAt(j)) return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
//       ====================================
//       */
    }

    private static boolean better(String str, String ttr) {
//      /**
//       * Better; TC:[ O(N) ]; SC:[ O(N+N) ]
//       ====================================
        int n = str.length();
        int m = ttr.length();
        if (n!=m) return Boolean.FALSE;
        Map<Character, Character> strMap = new HashMap<>();
        Map<Character, Character> ttrMap = new HashMap<>();
        for (int i=0; i<n; i++) {
            char a = str.charAt(i);
            char b = ttr.charAt(i);
            if (strMap.containsKey(a) && strMap.get(a) != b) return Boolean.FALSE;
            if (ttrMap.containsKey(b) && ttrMap.get(b) != a) return Boolean.FALSE;
            if (!strMap.containsKey(a) && !ttrMap.containsKey(b)) {
                strMap.put(a, b);
                ttrMap.put(b, a);
            }
        }
        return Boolean.TRUE;
//       ====================================
//       */
    }

    private static boolean optimal(String str, String ttr) {
//      /**
//       * Optimal; TC:[ O(N) ]; SC:[ O(N+M) ]
//       ====================================
        int n = str.length();
        int m = ttr.length();
        if (n!=m) return Boolean.FALSE;
        Map<Character, Character> strMap = new HashMap<>();
        Set<Character> ttrSet = new HashSet<>();
        for (int i=0; i<n; i++) {
            char a = str.charAt(i);
            char b = ttr.charAt(i);
            if (strMap.containsKey(a) && strMap.get(a) != b) return Boolean.FALSE;
            else if (!strMap.containsKey(a)){
                if (ttrSet.contains(b)) return Boolean.FALSE;
                strMap.put(a, b);
                ttrSet.add(b);
            }
        }
        return Boolean.TRUE;
//       ====================================
//       */
    }

}
