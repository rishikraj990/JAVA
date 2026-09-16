package DSA.main.S03_Array;

import static DSA.main.Utilities.Utility.printArray;
import static DSA.main.Utilities.Utility.returnSubArray;

public class L19_MaxSubArraySumArray {

    /** Problem Statement: Given an integer array nums, find the subarray with the largest sum
     * and return the subarray of the elements present in that subarray.
     */

    public static void main(String[] args) {
//        int n = readInt();
//        int[] arr = readArray(n);
        int n = 6;
        int[] arr = {2, 3, 5, -2, 7, -4} ;

        printArray(findMaxSubArraySum(arr));
    }

    private static int[] findMaxSubArraySum(int[] arr) {

//      /**
//       * Brute; TC:[ O(N^2) ]; SC:[ O(1) ]
//       ====================================
//        int max = arr[0];
//        int s=0;
//        int e=0;
//        for (int i=0; i<arr.length; i++){
//            int sum = 0;
//            for (int j=i; j<arr.length; j++){
//                sum += arr[j];
//                if (sum > max){
//                    max = sum;
//                    s = i;
//                    e = j;
//                }
//                max = Math.max(max, sum);
//            }
//        }
//        return returnSubArray(arr, s, e);
//       ====================================
//       */

//      /**
//       * Optimal; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        // Kadane's Algo
        int sum = 0;
        int max = 0;
        int s=0;
        int e=0;
        for (int i=0; i< arr.length; i++){
            sum += arr[i];
            if (sum > max){
                max = sum;
                e = i;
            }
            if(sum<0){
                sum=0;
                s = i;
                e = i-1;
            }
        }
        return returnSubArray(arr, s, e);
//       ====================================
//       */
    }

}
