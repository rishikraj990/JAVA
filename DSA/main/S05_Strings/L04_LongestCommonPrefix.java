package DSA.main.S05_Strings;

import java.util.Arrays;

public class L04_LongestCommonPrefix {

    /** Problem Statement: Write a function to find the longest common prefix string amongst an array of strings.
     * If there is no common prefix, return an empty string "".
     */

    public static String longestCommonPrefix(String[] strArr) {
//        return brute(strArr);
        return optimal(strArr);
    }

    private static String brute(String[] strArr) {
//      /**
//       * Brute; TC:[ O(N * M) ]; SC:[ O(1) ]
//       ====================================
        String firstWord = strArr[0];
        int index = -1;
        for (int i=1; i<strArr.length; i++) {
            index++;
            if (strArr[i].charAt(index) != firstWord.charAt(index)) index--;
        }
        return index == -1 ? "" : firstWord.substring(0, index+1);
//       ====================================
//       */
    }

    private static String optimal(String[] strArr) {
//      /**
//       * Optimal; TC:[ O(N*log2(M) + M => Length of 1st word) ]; SC:[ O(1) ]
//       ====================================
        Arrays.sort(strArr);
        String firstWord = strArr[0];
        String lastWord = strArr[strArr.length-1];
        int i;
        for (i=0; i<firstWord.length(); i++) {
            if (lastWord.length()>i && firstWord.charAt(i) != lastWord.charAt(i)) {
                i--;
                break;
            }
        }
        return i == -1 ? "" : firstWord.substring(0, i+1);
//       ====================================
//       */
    }

}
