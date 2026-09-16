package DSA.main.S02_Sorting;

import java.util.Scanner;

public class L02_BubbleSort {
    /**
     * Given an array of integers called nums,sort the array in non-decreasing order using the bubble sort algorithm and return the sorted array.
     * A sorted array in non-decreasing order is an array where each element is greater than or equal to all preceding elements in the array.
     *
     * Examples:
     * Input: nums = [7, 4, 1, 5, 3]
     * Output: [1, 3, 4, 5, 7]
     * Explanation: 1 <= 3 <= 4 <= 5 <= 7.
     * Thus the array is sorted in non-decreasing order.
     *
     * Input: nums = [5, 4, 4, 1, 1]
     * Output: [1, 1, 4, 4, 5]
     * Explanation: 1 <= 1 <= 4 <= 4 <= 5.
     * Thus the array is sorted in non-decreasing order.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int[] res = bubbleSort(nums);
        for (int i=0; i<n; i++){
            System.out.print(res[i] + ", ");
        }
    }

    public static int[] bubbleSort(int[] nums) {
//      /**
//       * Brute; TC:[ O(N^2) ]; SC:[ O(1) ]
//       ====================================
//        for(int i=0; i<nums.length-1; i++){
//            for (int j=0; j<nums.length-i-1; j++){
//                if(nums[j]> nums[j+1]){
//                    int temp = nums[j+1];
//                    nums[j+1] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }
//        return nums;
//       ====================================
//       */

//      /**
//       * Optimal; TC:{Best Case:[ O(N) ], Average & Wost Case:[ O(N^2) ]}; SC:[ O(1) ]
//       ====================================
        for(int i=0; i<nums.length-1; i++){
            boolean isCompSorted = Boolean.TRUE;
            for (int j=0; j<nums.length-i-1; j++){
                if(nums[j]> nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                    isCompSorted = Boolean.FALSE;
                }
            }
            if (isCompSorted){
                break;
            }
        }
        return nums;
//       ====================================
//       */

    }
}
