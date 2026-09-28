package DSA.main.S04_BinarySearch.BS_02_OnAns;

import static DSA.main.Utilities.Utility.findMaxValueInArray;
import static DSA.main.Utilities.Utility.sunOfAllElementsInArray;

public class L09_BookAllocationProblem {

    /** Problem Statement: Given an array nums of n integers, where nums[i] represents the number of pages in
     * the i-th book, and an integer m representing the number of students,
     * allocate all the books to the students so that each student gets at least one book,
     * each book is allocated to only one student, and the allocation is contiguous.
     * Allocate the books to m students in such a way that the maximum number of pages assigned to a
     * student is minimized. If the allocation of books is not possible, return -1.
     */

    public static int bookAllocationProblem(int[] arr, int m) {
//        return brute(arr, m);
        return optimal(arr, m);
    }

    private static int brute(int[] arr, int m) {
//      /**
//       * Brute; TC:[ O(N+ (Sum(arr)-maxVal+1)*N) ]; SC:[ O(1) ]
//       ====================================
        int low = findMaxValueInArray(arr);
        int high = sunOfAllElementsInArray(arr);
        for (int i=low; i<=high; i++) {
            if (studentRequired(arr, i) == m) return i;
        }
        return low;
//       ====================================
//       */
    }

    private static int studentRequired(int[] arr, int i) {
        int sud = 1;
        int page = 0;
        for (int j=0; j<arr.length; j++) {
            if (page+arr[j] <= i) page+=arr[j];
            else {
                sud++;
                page = arr[j];
            }
        }
        return sud;
    }

    private static int optimal(int[] arr, int m) {
//      /**
//       * Optimal; TC:[ O(N + N*log2(Sum(arr)-maxVal+1)) ]; SC:[ O(1) ]
//       ====================================
        int low = findMaxValueInArray(arr);
        int high = sunOfAllElementsInArray(arr);
        while (low<=high) {
            int mid = low + ((high-low)/2);
            if (studentRequired(arr, mid) > m) low = mid+1;
            else high = mid-1;
        }
        return low;
//       ====================================
//       */
    }

}
