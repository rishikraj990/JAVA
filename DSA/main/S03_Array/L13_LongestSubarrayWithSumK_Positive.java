package DSA.main.S03_Array;

import static DSA.main.Utilities.Utility.printInt;

public class L13_LongestSubarrayWithSumK_Positive {

    /** Problem Statement: Given an array nums of size n and an integer k, find the length of the
     * longest sub-array that sums to k. If no such sub-array exists, return 0.
     */

    public static void main(String[] args) {
//        int n = readInt();
//        int[] arr = readArray(n);
//        int k = readInt();
        int n = 7;
        int[] arr = {10, 5, 2, 7, 1, 9} ;
        int k = 15;

        printInt(longestSubarrayWithSumK_Positive(arr, k));
    }

    private static int longestSubarrayWithSumK_Positive(int[] arr, int k) {

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
//       * Better; TC:[ O(N * log N) ]; SC:[ O(N) ]
//       ====================================
//        int max = 0;
//        Long sum = 0L;
//        HashMap<Long, Integer> hashMap = new HashMap<>();
//        hashMap.put(sum, -1); // to handle if sum == k
//        for (int i=0; i< arr.length; i++){
//            sum = sum + arr[i];
//            hashMap.putIfAbsent(sum, i); // To Prevent from overriding the previous value
//            if (hashMap.containsKey(sum-k)){
//                max = Math.max(max, i-hashMap.get(sum-k));
//            }
//        }
//        return max;
//       ====================================
//       */

//      /**
//       * Optimal; TC:[ O(2N) ]; SC:[ O(1) ]
//       ====================================
        int l = 0;
        int r = 0;
        int sum = 0;
        int max = 0;
        while (r < arr.length){
            if (sum <= k){
                sum += arr[r];
                if (sum == k) {
                    max = Math.max(max, r-l+1);
                }
                r++;
            } else {
                sum -= arr[l];
                l++;
            }
        }
        return max;
//       ====================================
//       */
    }

}
