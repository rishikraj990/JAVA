package DSA.main.S05_Strings;

import java.util.HashMap;
import java.util.Map;

public class L14_SumOfBeautyOfAllSubstring {

    /** Problem Statement: The beauty of a string is defined as the difference between the frequency of the most
     * frequent character and the least frequent character (excluding characters that do not appear) in that string.
     * Given a string s, return the sum of beauty values of all possible substrings of s.
     */

    public static int sumOfBeautyOfAllSubstring(String str) {
//        return brute(str);
        return optimal(str);
    }

    private static int brute(String str) {
//      /**
//       * Brute; TC:[ O(N² * (N + K)) ]; SC:[ O(K) ]
//       ====================================
        int n = str.length();
        int ans = 0;
        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                String substring = str.substring(i, j+1);
                ans += maxDif(substring);
            }
        }
        return ans;
//       ====================================
//       */
    }

    private static int maxDif(String substring) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<substring.length(); i++) {
            char c = substring.charAt(i);
            map.put(c,  map.getOrDefault(c, 0)+1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            max = Math.max(max, entry.getValue());
            min = Math.min(min, entry.getValue());
        }
        return max-min;
    }

    private static int optimal(String str) {
//      /**
//       * Optimal; TC:[ O(N² * K) ]; SC:[ O(K) ]
//       ====================================
        int n = str.length();
        int ans = 0;
        for (int i=0; i<n; i++) {
            Map<Character, Integer> map = new HashMap<>();
            for (int j=i; j<n; j++) {
                char c = str.charAt(j);
                map.put(c,  map.getOrDefault(c, 0)+1);

                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                    max = Math.max(max, entry.getValue());
                    min = Math.min(min, entry.getValue());
                }
                ans += max-min;
            }
        }
        return ans;
//       ====================================
//       */
    }

}
