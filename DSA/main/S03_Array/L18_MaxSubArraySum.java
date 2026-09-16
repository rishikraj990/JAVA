package DSA.main.S03_Array;

import static DSA.main.Utilities.Utility.printInt;

public class L18_MaxSubArraySum {

    /** Problem Statement: Kadane's Algorithm : Maximum Subarray Sum in an Array
     * Given an integer array nums, find the subarray with the largest sum
     * and return the sum of the elements present in that subarray.
     * A subarray is a contiguous non-empty sequence of elements within an array.
     */

    public static void main(String[] args) {
//        int n = readInt();
//        int[] arr = readArray(n);
        int n = 6;
        int[] arr = {2, 3, 5, -2, 7, -4} ;

        printInt(findMaxSubArraySum(arr));
    }

    private static int findMaxSubArraySum(int[] arr) {

//      /**
//       * Brute; TC:[ O(N^2) ]; SC:[ O(1) ]
//       ====================================
//        int max = arr[0];
//        for (int i=0; i<arr.length; i++){
//            int sum = 0;
//            for (int j=i; j<arr.length; j++){
//                sum += arr[j];
//                max = Math.max(max, sum);
//            }
//        }
//        return max;
//       ====================================
//       */

//      /**
//       * Optimal; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        // Kadane's Algo
        int sum = 0;
        int max = 0;
        for (int i=0; i< arr.length; i++){
            sum += arr[i];
            max = Math.max(max, sum);
            if(sum<0){
                sum=0;
            }
        }
        return max;
//       ====================================
//       */
    }

}
