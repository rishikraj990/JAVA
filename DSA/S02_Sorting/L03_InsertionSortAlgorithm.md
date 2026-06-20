Insertion Sort Algorithm

A sorted array in non-decreasing order is an array where each element is greater than or equal to all preceding elements in the array.

Approach

Algorithm

- In each iteration, select an element from the unsorted part of the array using an outer loop.
- Place this selected element in its correct position within the sorted part of the array.
- Use an inner loop to shift the remaining elements, if necessary, to accommodate the selected element. This involves shifting elements by one position until the selected element can be placed in the correct position.
- Continue this process until the entire array is sorted.

Code

Java

import java.util.*;

class Solution {
public int[] insertionSort(int[] nums) {
int n = nums.length; // Size of the array

        // For every element in the array 
        for (int i = 1; i < n; i++) {
            int key = nums[i]; // Current element as key 
            int j = i - 1;
            
            // Shift elements that are greater than key by one position
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            
            nums[j + 1] = key; // Insert key at correct position
        }
        
        return nums;
    }
}


class Main {
public static void main(String[] args) {
// Create an instance of solution class
Solution solution = new Solution();

        int[] nums = {13, 46, 24, 52, 20, 9};
        
        System.out.println("Before Using Insertion Sort: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Function call for insertion sort
        nums = solution.insertionSort(nums);
        
        System.out.println("After Using Insertion Sort: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

- Complexity Analysis
Time Complexity: O(n^2), where n is the number of elements in the array. This is because, in the worst case, we may have to compare each element with all the previous elements.

- Space Complexity: O(1), as we are sorting the array in place and not using any additional data structures that grow with input size.
