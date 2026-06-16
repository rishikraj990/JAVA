package DSA.S01_Basic.S01_04_BasicMath;

public class L03_PalindromeNumber {

    /** Problem Statement:
     * Given an integer N, return true if it is a palindrome else return false.
     */

    public static void main(String[] args) {
        int n = -121;
        System.out.println(palindrome(n));
    }

    private static boolean palindrome(int n) {

//        /**
//         * Brute; TC:[ O(log10(n) ]; SC:[ O(2) ]
//         ====================================
        if(n < 0){
            return false; // As -121 != 121; -121 can be == 121-
        }
        int dup = n;
        int ans = 0;
        while(dup != 0){
            ans = ans * 10 + dup%10;
            dup = dup/10;
        }

//         ====================================
//         */
        return n == ans;
    }

}
