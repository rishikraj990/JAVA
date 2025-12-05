package DSA.S01_05_BasicRecursion;

import java.util.Scanner;

public class L08_CheckIfStringIsPalindromeOrNot {

    /**
     * Problem Statement: Given a string, check if the string is palindrome or not. A string is said to be palindrome if the reverse of the string is the same as the string.
     *
     * Examples
     * Example 1:
     * Input: Str =  “ABCDCBA”
     * Output: Palindrome
     * Explanation: String when reversed is the same as string.
     *
     * Example 2:
     * Input: Str = “TAKE U FORWARD”
     * Output: Not Palindrome
     * Explanation: String when reversed is not the same as string.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();

        System.out.println(palindromeCheck(string) ? "Palindrome" : "Not Palindrome");
    }

    public static boolean palindromeCheck(String s) {
        int l = s.length();
        if(l<=1){
            return Boolean.TRUE;
        }
        char a = s.charAt(0);
        char b = s.charAt(l-1);
        if (s.charAt(0) != s.charAt(l-1)) {
            return Boolean.FALSE;
        }
        return palindromeCheck(s.substring(1, l - 1));
    }
}
