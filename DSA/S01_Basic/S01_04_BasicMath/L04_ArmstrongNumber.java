package DSA.S01_Basic.S01_04_BasicMath;

public class L04_ArmstrongNumber {

    /** Problem Statement:
     * Given an integer N, return true it is an Armstrong number otherwise return false.
     */

    public static void main(String[] args) {
        int n = 1634;
        System.out.println(isArmstrong(n));
    }

    private static boolean isArmstrong(int n) {
//      /**
//      * Optimal; TC:[ { O(log10(n) + O((log10(n)*t )} +1]; SC:[ O(6) ]
//      ====================================
        int t = countNumber(n);
        int dup = n;
        int cal=0;
        while(dup!=0){
            int temp = dup%10;
            cal = cal + getMultiple(temp, t);
            dup = dup/10;
        }
        return n==cal;
//      ====================================
//      */

    }

    private static int countNumber(int n){
        int i = 0;
        while (n!=0){
            i++;
            n = n / 10;
        }
        return i;
    }

    private static int getMultiple(int n, int t){
        int res = n;
        while (t>1){
            res = res * n;
            t--;
        }
        return res;
    }

}
