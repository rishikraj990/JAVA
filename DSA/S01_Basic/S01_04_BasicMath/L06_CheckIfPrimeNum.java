package DSA.S01_Basic.S01_04_BasicMath;

public class L06_CheckIfPrimeNum {

    /** Problem Statement:
     * Given an integer N, check whether it is prime or not.
     */

    public static void main(String[] args) {
        int n = 199;
        System.out.println(isPrime(n));
    }

    private static boolean isPrime(int n) {

        if (n <= 1){
            return Boolean.FALSE;
        }
        int cnt=0;

//      /**
//       * Brute; TC:[ O(n) ]; SC:[ O(2) ]
//       ====================================
//        for (int i = 1; i<=n; i++){
//            if(n%i == 0){
//                cnt++;
//            }
//        }
//        if (cnt == 2){
//            return Boolean.TRUE;
//        }
//        return Boolean.FALSE;
//       ====================================
//       */

//      /**
//       * Better; TC:[ O(sqrt(n) + O(f(sqrt(n))) ]; SC:[ O(2) ]
//       ====================================
//        for (int i = 1; i<=Math.sqrt(n); i++){
//            if(n%i == 0){
//                cnt++;
//                if (n/i != i){
//                    cnt++;
//                }
//            }
//        }
//        if (cnt == 2){
//            return Boolean.TRUE;
//        }
//        return Boolean.FALSE;
//       ====================================
//       */

//      /**
//       * Optimal; TC:[ O(sqrt(n) ]; SC:[ O(2) ]
//       ====================================
        for (int i = 1; i*i<=n; i++){
            if(n%i == 0){
                cnt++;
                if (n/i != i){
                    cnt++;
                }
            }
            if(cnt>2){
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
        //       ====================================
//       */

    }

}
