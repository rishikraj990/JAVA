package DSA.main.S02_Sorting;

import java.util.Scanner;

public class L03_InsertionSort {
    /**
     * Given an array of integers called nums, sort the array in non-decreasing order using the insertion sort algorithm and return the sorted array.
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
        int[] res = insertionSort(nums);
        for (int i=0; i<n; i++){
            System.out.print(res[i] + ", ");
        }
    }

    public static int[] insertionSort(int[] nums) {
//      /**
//       * Optimal; TC:{Best Case:[ O(N) ], Average & Wost Case:[ O(N^2) ]}; SC:[ O(1) ]
//       ====================================
        for(int i=1; i<nums.length; i++){
            int key = nums[i]; // since shifting elements by 1 right, need to preserve this value for latter place it
            int j = i-1;
            while(j >= 0 && nums[j] > key){  // since the value will be overrider, that is why using the stored key value
                nums[j+1] = nums[j]; // not storing just left shifting all elements-> |a, b| => |_, a, b|
                j--;
            }
            nums[j + 1] = key;
        }
        return nums;
//       ====================================
//       */
    }

}
