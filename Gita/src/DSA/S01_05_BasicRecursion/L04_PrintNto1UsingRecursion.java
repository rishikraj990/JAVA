package DSA.S01_05_BasicRecursion;

import java.util.Scanner;

public class L04_PrintNto1UsingRecursion {

    /**
     * Problem Description: Given an integer N, write a program to print numbers from N to 1.
     *
     * Examples
     * Input: N = 4
     * Output: 4, 3, 2, 1
     * Explanation: All the numbers from 4 to 1 are printed.
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
        if(n<1){
            return;
        }
        System.out.println(n);
        printNumbers(n-1);

    }

}
