package DSA.S01_Basic.S01_04_BasicMath;

public class L02_ReverseNumber {

    /** Problem Statement:
     * Given a signed 32-bit integer x, return x with its digits reversed.
     * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1],
     * then return 0.
     */

    public static void main(String[] args) {
        int n = -123456789;
        System.out.println(reverse(n));
    }

    private static int reverse(int x) {

        /**
        * Brute; TC:[ O(log10(n)+1 ]; SC:[ O(1) ]
        ====================================

        int ans=0;
        while(n > 0){
            ans = ans*10 + n%10;
            n = n/10;
        }
        ====================================
        */

//      * Optimal; TC:[ O(log10(n)+4 ]; SC:[ O(1) ]
//      ====================================
        int ans=0;
        while(x != 0){
// if(!(ans*10 <= Integer.MAX_VALUE && ans*10 < Integer.MIN_VALUE)){
// =>when we multiply by 10 to check if overflowed, number already took the cycle turn hence it will never exceed

            if((ans > Integer.MAX_VALUE/10 || ans < Integer.MIN_VALUE/10)){
// => since we have reduced the max and min value hence it will always remain in int limit
                return 0;
            }
            ans = ans*10 + x%10;
            x = x/10;
        }

//      ====================================
//      */
        return ans;

    }

}
