package DSA.main.S03_Array;

import java.util.HashMap;

import static DSA.main.Utilities.Utility.printInt;

public class L14_LongestSubarrayWithSumK_Pos_Zero_Neg {

    /** Problem Statement: Given an array nums of size n and an integer k containing both positive, negative
     * and Zero integers, find the length of the longest sub-array that sums to k.
     * If no such sub-array exists, return 0.
     */

    public static void main(String[] args) {
//        int n = readInt();
//        int[] arr = readArray(n);
//        int k = readInt();
        int n = 7;
        int[] arr = {9, -3, 3, -1, 6, -5} ;
        int k = 0;

        printInt(longestSubarrayWithSumK_Pos_Zero_Neg(arr, k));
    }

    private static int longestSubarrayWithSumK_Pos_Zero_Neg(int[] arr, int k) {

//      /**
//       * Brute; TC:[ O(N^2) ]; SC:[ O(1) ]
//       ====================================
//        int max = 0;
//        for(int i=0; i<arr.length-1; i++){
//            int sum = 0;
//            for (int j=i+1; j<arr.length; j++){
//                sum = sum + arr[j];
//                if(sum == k){
//                    max = Math.max(max, j-i);
//                }
//            }
//        }
//        return max;
//       ====================================
//       */

//      /**
//       * Optimal; TC:[ O(N * log N) ]; SC:[ O(N) ]
//       ====================================
        int max = 0;
        Long sum = 0L;
        HashMap<Long, Integer> hashMap = new HashMap<>();
        hashMap.put(sum, -1); // to handle if sum == k
        for (int i=0; i< arr.length; i++){
            sum = sum + arr[i];
            hashMap.putIfAbsent(sum, i); // To Prevent from overriding the previous value
            if (hashMap.containsKey(sum-k)){
                max = Math.max(max, i-hashMap.get(sum-k));
            }
        }
        return max;
//       ====================================
//       */
    }

}
