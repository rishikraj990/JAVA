package DSA.S01_Basic.S01_05_BasicRecursion;

import java.util.Scanner;

public class L08_CheckIfStringIsPalindromeOrNot {

    /**
     * Problem Statement: Given a string, check if the string is palindrome or not.
     * converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters
     *
     * Examples
     * Example 1:
     * Input: Str =  “A man, a plan, a canal: Panama”
     * Output: Palindrome
     * Explanation: String when reversed (amanaplanacanalpanama) is the same as string.
     *
     * Example 2:
     * Input: Str = “TAKE U FORWARD”
     * Output: Not Palindrome
     * Explanation: String when reversed (takeuforward) is not the same as string.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();

        string = normalizeString(string);
        System.out.println(palindromeCheck(string, 0) ? "Palindrome" : "Not Palindrome");
    }

    private static String normalizeString(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                char c = (char) (s.charAt(i)+ 32);
                sb.append(c);
            } else if(s.charAt(i)>='a' && s.charAt(i)<= 'z'){
                sb.append(s.charAt(i));
            } else if(s.charAt(i)>='0' && s.charAt(i)<= '9'){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static boolean palindromeCheck(String s, int i) {
//      /**
//       * Brute; TC:[ O(N) ]; SC (Stack Space):[ O(N) ]
//       ====================================
        int l = s.length();
        if(i >= l/2){
            return Boolean.TRUE;
        }
        if(s.charAt(i) != s.charAt(l-i-1)){
            return Boolean.FALSE;
        }
        return palindromeCheck(s, i+1);
//       ====================================
//       */
    }
}
