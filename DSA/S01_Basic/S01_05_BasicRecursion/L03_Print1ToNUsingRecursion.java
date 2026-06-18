package DSA.S01_Basic.S01_05_BasicRecursion;

import java.util.Scanner;

public class L03_Print1ToNUsingRecursion {

    /**
     * Problem Description: Given an integer N, write a program to print numbers from 1 to N. Using,
     * (i) FORWARD RECURSION
     * (ii) BACKTRACKING
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        FORWARD RECURSION
//        printNumbers(1, n);

//        BACKTRACKING
        printNumbers(n, n);
    }

    public static void printNumbers(int i, int n) {
//      /** - FORWARD RECURSION
//       * Brute; TC:[ O(N) ]; SC (Stack Space):[ O(N) ]
//       ====================================
//        if(i>n){
//            return;
//        }
//        System.out.print(i + " ");
//        printNumbers(i+1, n);
//       ====================================
//       */

//      /** - BACKTRACKING
//       * Brute; TC:[ O(N) ]; SC (Stack Space):[ O(N) ]
//       ====================================
        if(i<1){
            return;
        }
        printNumbers(i-1, n);
        System.out.print(i + " ");
//       ====================================
//       */
    }
}
