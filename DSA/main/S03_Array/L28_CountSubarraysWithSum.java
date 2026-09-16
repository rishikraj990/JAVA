package DSA.main.S03_Array;

import java.util.HashMap;

public class L28_CountSubarraysWithSum {

    /** Problem Statement: Given an array of integers and an integer k, return the total number of subarrays
     * whose sum equals k. A subarray is a contiguous non-empty sequence of elements within an array.
     */

    public static int countSubarraysWithSum(int[] arr, int k) {
//        return brute(arr, k);
        return optimal(arr, k);
    }

    private static int brute(int[] arr, int k) {
//      /**
//       * Brute; TC:[ O(N^2) ]; SC:[ O(1) ]
//       ====================================
        int c = 0;
        for (int i=0; i<arr.length; i++){
            int sum = 0;
            for (int j=i; j<arr.length; j++){
                sum += arr[j];
                if(sum == k){
                    c++;
                }
            }
        }
        return c;
//       ====================================
//       */
    }

    private static int optimal(int[] arr, int k) {
//      /**
//       * Optimal; TC:[ O(N * logN) ]; SC:[ O(N) ]
//       ====================================
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int c = 0;
        hashMap.put(0, 1);
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i];
            if (hashMap.containsKey(sum-k)){
                c += hashMap.get(sum-k);
            }
            hashMap.put(sum, hashMap.containsKey(sum) ? hashMap.get(sum) + 1 : 1);
        }
        return c;
//       ====================================
//       */
    }

}
