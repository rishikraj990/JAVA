package DSA.S01_Basic.S01_04_BasicMath;

public class L07_GCDorHCFOf2Num {

    /** Problem Statement:
     * Given two integers N1 and N2, find their greatest common divisor.
     */

    public static void main(String[] args) {
        int n1 = 36;
        int n2 = 36;
        System.out.println(findGcdOrHcf(n1, n2));
    }

    private static int findGcdOrHcf(int n1, int n2) {
//      /**
//       * Brute; TC:[ O(min(n1,n2) ]; SC:[ O(2) ]
//       ====================================
//        int min = Math.min(n1, n2);
//        int res = 1;
//        for(int i=1; i<=min; i++){
//            if(n1 % i == 0 && n2 % i == 0){
//                res = i;
//            }
//        }
//        return res;
//       ====================================
//       */

//      /**
//       * Better; TC:[  O( logΦ(min(N1, N2))) ]; SC:[ O(1) ]
//       ====================================
//        while(n1 > 0 && n2 > 0) {
//            if(n1 > n2) {
//                n1 = n1 - n2;  /** Euclidean Algorithm */
//            }
//            else {
//                n2 = n2 - n1;
//            }
//        }
//        if(n1 == 0) {
//            return n2;
//        }
//        return n1;
//       ====================================
//       */

//      /**
//       * Optimal; TC:[ O( logΦ(min(N1, N2))) ]; SC:[ O(1) ]
//       ====================================
        while(n1 > 0 && n2 > 0) {
            if(n1 > n2) {
                n1 = n1 % n2;  /** Modified Euclidean Algorithm */
            }
            else {
                n2 = n2 % n1;
            }
        }
        if(n1 == 0) {
            return n2;
        }
        return n1;
//       ====================================
//       */

    }

}
