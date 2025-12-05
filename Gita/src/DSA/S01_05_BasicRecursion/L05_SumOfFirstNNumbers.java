package DSA.S01_05_BasicRecursion;

import java.util.Scanner;

public class L05_SumOfFirstNNumbers {

    /**
     * Problem Statement: Given a number ‘N’, find out the sum of the first N natural numbers .
     *
     * Examples
     * Input: N=5
     * Output: 15
     * Explanation: 1+2+3+4+5=15
     *
     * Input: N=6
     * Output: 21
     * Explanation: 1+2+3+4+5+6=15
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(NnumbersSum(n));
    }

    public static int NnumbersSum(int N) {
        if(N==0){
            return 0;
        }
        return N + NnumbersSum(N-1);
    }
}
