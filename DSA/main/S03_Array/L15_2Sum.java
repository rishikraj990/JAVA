package DSA.main.S03_Array;

import java.util.Arrays;
import java.util.HashMap;

public class L15_2Sum {

    /** Problem Statement:
     * 1st variant: Return YES if there exist two numbers such that their sum is equal to the target.
     * Otherwise, return NO.
     *
     * 2nd variant: Return indices of the two numbers such that their sum is equal to the target.
     * Otherwise, we will return {-1, -1}.
     */

    public static void main(String[] args) {
//        int n = readInt();
//        int[] arr = readArray(n);
//        int k = readInt();
        int n = 5;
        int[] arr = {2,6,5,8,11} ;
        int t = 14;

        twoSum(arr, t);
    }

    private static void twoSum(int[] arr, int t) {

//      /**
//       * Brute; TC:[ O(N^2) ]; SC:[ O(1) ]
//       ====================================
//        for (int i=0; i<arr.length-1; i++){
//            for (int j=i+1; j<arr.length; j++){
//                if(arr[i] + arr[j] == t){
//                    System.out.println("i: " + i + " j: " + j + " YES");
//                    return;
//                }
//            }
//        }
//        System.out.println("NO");
//       ====================================
//       */

//      /**
//       * Better; TC:[ O(N * N(logN)) ]; SC:[ O(N) ]
//       ====================================
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        for (int i=0; i<arr.length; i++){
//            if(hashMap.containsKey(t-arr[i])){
//                System.out.println("i: " + hashMap.get(t - arr[i]) + " j: " + i + " YES");
//                return;
//            }
//            hashMap.putIfAbsent(arr[i], i);
//        }
//        System.out.println("NO");
//       ====================================
//       */

//      /**
//       * Optimal; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        Arrays.sort(arr);
        int l=0;
        int r=arr.length-1;
        while (l < r) {
            if (arr[l] + arr[r] == t){
                System.out.println("YES");
                return;
            } else if (arr[l] + arr[r] > t) {
                r--;
            } else {
                l++;
            }
        }
        System.out.println("NO");
//       ====================================
//       */
    }

}
