package DSA.main.S05_Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L08_SortCharactersByFrequency {

    /** Problem Statement: Given a string s, sort it in decreasing order based on the frequency of the characters.
     * The frequency of a character is the number of times it appears in the string.
     * Return the sorted string. If there are multiple answers, return any of them.
     */

    public static String sortCharactersByFrequency(String str) {
//        return brute(str);
//        return better(str);
        return optimal(str);
    }

    private static String brute(String str) {
//      /**
//       * Brute; TC:[ O(N + K*(K+max)) ]; SC:[ O(N) ]
//       ====================================
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) +1);
        }
        StringBuilder sb = new StringBuilder();
        while (!map.isEmpty()) {
            int max = -1;
            char val = 0;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() > max) {
                    val = entry.getKey();
                    max = entry.getValue();
                }
            }
            for (int i=0; i<max; i++) {
                sb.append(val);
            }
            map.remove(val);
        }
        return sb.toString();
//       ====================================
//       */
    }

    private static String better(String str) {
//      /**
//       * Better; TC:[ O(N + Nlog₂(N) + N) ]; SC:[ O(N + N) ]
//       ====================================
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) +1);
        }

        List<Character> chars = new ArrayList<>(map.keySet());
        chars.sort((a, b) -> map.get(b) - map.get(a));

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<chars.size(); i++) {
            char c = chars.get(i);
            int feq = map.get(c);
            for (int j=0; j<feq; j++) {
                sb.append(c);
            }
        }

        return sb.toString();
//       ====================================
//       */
    }

    private static String optimal(String str) {
//      /**
//       * Optimal; TC:[ O(N + K + N) ]; SC:[ O(N + N) ]
//       ====================================
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) +1);
        }

        List<Character>[] buckets = new ArrayList[str.length() + 1];
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int freq = entry.getValue();
            if (buckets[freq] == null) buckets[freq] = new ArrayList<>();
            buckets[freq].add(entry.getKey());
        }

        StringBuilder sb = new StringBuilder();
        for (int freq=buckets.length-1; freq>=1; freq--) {
            if (buckets[freq] == null) continue;
            for (char c : buckets[freq]) {
                for (int i=0; i<freq; i++) {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
//       ====================================
//       */
    }

}
