package DSA.S01_05_BasicRecursion;

import java.util.Scanner;

public class L06_FactorialOfNNumbers {

    /**
     * Problem Statement: Given a number X,  print its factorial.
     *
     * To obtain the factorial of a number, it has to be multiplied by all the whole numbers preceding it. More precisely X! = X*(X-1)*(X-2) … 1.
     *
     * Note: X  is always a positive number.
     *
     * Examples
     * Example 1:
     * Input: X = 5
     * Output: 120
     * Explanation: 5! = 5*4*3*2*1
     *
     * Example 2:
     * Input: X = 3
     * Output: 6
     * Explanation: 3!=3*2*1
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(NnumbersFact(n));
    }

    private static int NnumbersFact(int n) {
        if(n==1){
            return 1;
        }
        return n * NnumbersFact(n-1);

    }
}
