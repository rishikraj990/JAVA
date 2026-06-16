package DSA.S01_Basic.S01_04_BasicMath;

public class L01_CountAllDigits {

    /** Problem Statement:
     * Given an integer N, return the number of digits in N.
     */

    public static void main(String[] args) {
        int n = 35345;
        System.out.println(countDigit(n));
    }

    private static int countDigit(int n) {

//        /**
//         * Optimal; TC:[ O(1) ]; SC:[ O(1) ]
//         ====================================
        return (int) Math.log10(n) + 1;
//TODO::        double result = Math.log(value) / Math.log(base);  // formula to find log with any BASE

//         ====================================
//         */

        /**
//         * Brute; TC:[ O(log10(n)+1) ]; SC:[ O(1) ]
//         ====================================
        int i=0;
        while(n>0){
            i++;
            n = n/10;
        }
        return i;
//         ====================================
//         */

    }

}
