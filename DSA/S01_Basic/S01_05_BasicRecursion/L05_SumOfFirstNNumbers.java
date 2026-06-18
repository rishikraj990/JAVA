package DSA.S01_Basic.S01_05_BasicRecursion;

import java.util.Scanner;

public class L05_SumOfFirstNNumbers {

    /**
     * Problem Statement: Given a number ‘N’, find out the sum of the first N natural numbers .
     * (i) PARAMETERISED RECURSION
     * (ii) FUNCTIONAL RECURSION
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        Brute
//        System.out.print(nNumbersSum(n));

//        FORWARD RECURSION
//        nNumbersSum(n, 0);

//        FUNCTIONAL RECURSION
//        System.out.print(nNumbersSum(n));

//        Optimal
        System.out.print(nNumbersSum(n));
    }

    private static void nNumbersSum(int n, int sum) {
//      /** - PARAMETERISED RECURSION
//       * Brute; TC:[ O(N) ]; SC (Stack Space):[ O(N) ]
//       ====================================
        if(n<0){
            System.out.print(sum);
            return;
        }
        nNumbersSum(n-1, sum+n);
//       ====================================
//       */
    }

    private static int nNumbersSum(int n) {
//      /**
//       * Brute; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
//        int sum =0;
//        for (int i = 1; i<=n; i++){
//            sum+=i;
//        }
//        return sum;
//       ====================================
//       */

//      /** - FUNCTIONAL RECURSION
//       * Brute; TC:[ O(N) ]; SC (Stack Space):[ O(N) ]
//       ====================================
//        if(n==0){
//            return 0;
//        }
//        return n + nNumbersSum(n-1);
//       ====================================
//       */

//      /**
//       * Optimal; TC:[ O(1) ]; SC:[ O(1) ]
//       ====================================
        return (n * (n+1))/2;
//       ====================================
//       */
    }
}
