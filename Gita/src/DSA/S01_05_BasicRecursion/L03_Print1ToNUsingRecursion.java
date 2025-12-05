package DSA.S01_05_BasicRecursion;

import java.util.Scanner;

public class L03_Print1ToNUsingRecursion {

    /**
     * Problem Description: Given an integer N, write a program to print numbers from 1 to N.
     *
     * Examples
     * Input: N = 4
     * Output: 1, 2, 3, 4
     * Explanation: All the numbers from 1 to 4 are printed.
     *
     * Input: N = 1
     * Output: 1
     * Explanation: This is the base case.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printNumbers(n);
    }

    public static void printNumbers(int n) {
        if(n==0){
            return;
        }
        printNumbers(n-1);
        System.out.println(n);
    }
}
