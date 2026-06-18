package DSA.S01_Basic.S01_05_BasicRecursion;

import java.util.Scanner;

public class L06_FactorialOfNNumbers {

    /**
     * Problem Statement: Given a number X,  print its factorial.
     * To obtain the factorial of a number, it has to be multiplied by all the whole numbers preceding it.
     * More precisely X! = X*(X-1)*(X-2) … 1.
     * Note: X  is always a positive number.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(nNumbersFact(n));
    }

    private static int nNumbersFact(int n) {
//      /** - FUNCTIONAL RECURSION
//       * Brute; TC:[ O(N) ]; SC (Stack Space):[ O(N) ]
//       ====================================
        if(n==1){
            return 1;
        }
        return n * nNumbersFact(n-1);
//       ====================================
//       */
    }
}
