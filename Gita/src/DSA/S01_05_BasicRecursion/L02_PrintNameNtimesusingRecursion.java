package DSA.S01_05_BasicRecursion;

import java.util.Scanner;

public class L02_PrintNameNtimesusingRecursion {

    /**
     * Problem Description: Given an integer N, write a program to print your name N times.
     * Input: N = 3
     * Output: Ashish Ashish Ashish
     * Explanation: Name is printed 3 times.
     *
     * Input: N = 1
     * Output: Ashish
     * Explanation: Name is printed once.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name = sc.next();

        printNameNTimes(n, name);
    }

    private static void printNameNTimes(int n, String name) {
        if (n<1){
            return;
        } else{
            System.out.print(name + " ");
            printNameNTimes(n-1, name);
        }
    }
}
