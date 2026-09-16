package DSA.main.S02_Sorting;

import java.util.Scanner;

public class L01_SelectionSort {

    /**
     * Given an array of integers nums, sort the array in non-decreasing order using the selection sort algorithm and return the sorted array.
     * A sorted array in non-decreasing order is an array where each element is greater than or equal to all previous elements in the array.
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
        int[] res = selectionSort(nums);
        for (int i=0; i<n; i++){
            System.out.print(res[i] + ", ");
        }
    }

    public static int[] selectionSort(int[] nums) {
//      /**
//       * Algorithm; TC:[ O(N^2) ]; SC:[ O(1) ]
//       ====================================
        for(int i=0; i<nums.length-1; i++){
            int minIndex = i;
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]<nums[minIndex]){
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        return nums;
//       ====================================
//       */
    }
}
