package DSA.main.S03_Array;

public class L40_MaximumProductSubarrayInArray {

    /** Problem Statement: Given an array that contains both negative and positive integers,
     * find the maximum product subarray.
     */

    public static int maximumProductSubarrayInArray(int[] arr) {
//        return brute(arr);
        return optimal_1(arr);
//        return optimal_2(arr); //Not for interview (Variant of Kaden's Algo)
    }

    private static int brute(int[] arr) {
//      /**
//       * Brute; TC:[ O(N^2) ]; SC:[ O(1) ]
//       ====================================
        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            int prod = 1;
            for (int j=i; j<arr.length; j++){
                prod = prod*arr[j];
                max = Math.max(max, prod);
            }
        }
        return max;
//       ====================================
//       */
    }

    private static int optimal_1(int[] arr) {
//      /**
//       * Optimal; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        int max = arr[0];
        int prefix = 1;
        int suffix = 1;
        for (int i=0; i<arr.length; i++){
            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;
            prefix *= arr[i];
            suffix *= arr[arr.length-i-1];
            max = Math.max(max, Math.max(prefix, suffix));
        }
        return max;
//       ====================================
//       */
    }

}
