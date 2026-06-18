package DSA.S01_Basic.S01_05_BasicRecursion;

import java.util.Scanner;

public class L04_PrintNto1UsingRecursion {

    /**
     * Problem Description: Given an integer N, write a program to print numbers from N to 1.
     * (i) FORWARD RECURSION
     * (ii) BACKTRACKING
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        FORWARD RECURSION
//        printNumbers(n, n);

//        BACKTRACKING
        printNumbers(1, n);
    }

    public static void printNumbers(int i, int n) {
//      /** - FORWARD RECURSION
//       * Brute; TC:[ O(N) ]; SC (Stack Space):[ O(N) ]
//       ====================================
//        if(i<1){
//            return;
//        }
//        System.out.print(i + " ");
//        printNumbers(i-1, n);
//       ====================================
//       */

//      /** - BACKTRACKING
//       * Brute; TC:[ O(N) ]; SC (Stack Space):[ O(N) ]
//       ====================================
        if(i>n){
            return;
        }
        printNumbers(i+1, n);
        System.out.print(i + " ");
//       ====================================
//       */
    }

}
