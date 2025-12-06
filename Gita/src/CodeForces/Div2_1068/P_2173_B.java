package CodeForces.Div2_1068;

import java.util.Scanner;

public class P_2173_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i=0; i< t; i++){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int j=0; j<n; j++){
                a[i] = sc.nextInt();
            }
            for (int j=0; j<n; j++){
                b[i] = sc.nextInt();
            }
            System.out.println(maxScore(n, a, b));
        }
    }

    private static int maxScore(int n, int[] a, int[] b) {
        int maxR = 0;
        int minR = 0;
        int maxB = 0;
        int minB = 0;
        if()
    }


}
