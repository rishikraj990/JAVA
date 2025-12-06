package CodeForces.Div2_1068;

import java.util.Scanner;

public class P_2173_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i=0; i< t; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            System.out.println(maxSleep(n, k, s));
        }
    }

    private static int maxSleep(int n, int k, String s) {
        int max = 0;
        int i=0;
        int j=0;
        while (i<n){
            if (s.charAt(i) == '1'){
               j=k;
               i++;
            } else{
                if (j==0){
                    max++;
                } else{
                    j--;
                }
                i++;
            }
        }
        return max;
    }
}
