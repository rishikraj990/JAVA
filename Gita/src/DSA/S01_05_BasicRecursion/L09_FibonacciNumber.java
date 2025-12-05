package DSA.S01_05_BasicRecursion;

import java.util.Scanner;

public class L09_FibonacciNumber {

    /**
     * Problem Statement: Given an integer N. Calculate the Fibonacci series sum up to the Nth term.
     *
     * Examples
     * Example 1:
     * Input: N = 5
     * Output: 12
     * Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)
     *
     * Example 2:
     * Input: 6
     * Output: 20
     * Explanation: 0 1 1 2 3 5 8 is the fibonacci series upto 6th term.(o based indexing)
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibSum(n));
    }

    private static int fibSum(int n) {
        if(n==0){
            return n;
        }
        return fib(n) + fibSum(n-1);
    }

    public static int fib(int n) {
        if(n <= 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
