package DSA.S01_Basic.S01_05_BasicRecursion;

import java.util.Scanner;

public class L09_FibonacciNumber {

    /**
     * Problem Statement: Given an integer N. Find Fibonacci Number.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fib(n));
    }

    public static int fib(int n) {
//      /**
//       * Brute; TC:[ O(2^n) ]; SC (Stack Space):[ O(N) ] {SC: At maximum there could be N function calls waiting
//                               in the recursion stack since we need to calculate the Nth Fibonacci number for
//                               which we also need to calculate (N-1) Fibonacci numbers before it }.
//       ====================================
        if(n <= 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
//       ====================================
//       */
    }
}
