package DSA.S01_Basic.S01_04_BasicMath;

public class L05_PrintAllDivisors {

    /** Problem Statement:
     * Given an integer N, return all divisors of N.
     */

    public static void main(String[] args) {
        int n = 36;
        findDivisors(n);
    }

    private static void findDivisors(int n) {
//      /**
//      * Brute; TC:[ O(n)+1 ]; SC:[ O(1) ]
//      ====================================
//        for(int i=1; i<n; i++){
//            if(n % i == 0){
//                System.out.print(i + " ");
//            }
//        }
//      ====================================
//      */

//      /**
//       * Better; TC:[  O(sqrt(n) + O(f(sqrt(n))) ]; SC:[ O(1) ]
//       ====================================
//        for (int i=1; i<=Math.sqrt(n); i++){
//            if(n % i == 0){
//                System.out.print(i + " ");
//                if(n/i != i){
//                    System.out.print(n/i + " ");
//                }
//            }
//        }
//       ====================================
//       */

//      /**
//      * Optimal; TC:[ O(sqrt(n)) ]; SC:[ O(1) ]
//      ====================================
        for (int i=1; i*i <= n; i++){ // Here instead of using sqrt function which will take time,
            if(n % i == 0){
                System.out.print(i + " ");
                if(n/i != i){
                    System.out.print(n/i + " ");
                }
            }
        }
//      ====================================
//      */

    }

}
