package DSA.main.S03_Array;

import java.util.Arrays;

import static DSA.main.Utilities.Utility.swap;

public class L36_Merge2SortedArraysWithoutExtraSpace {

    /** Problem Statement: Given two sorted integer arrays nums1 and nums2, merge both the arrays
     * into a single array sorted in non-decreasing order.
     * The final sorted array should be stored inside the array nums1 and it should be done in-place.
     * Array nums1 has a length of m + n, where the first m elements denote the elements of nums1
     * and rest are 0s whereas nums2 has a length of n.
     */

    public static void merge2SortedArraysWithoutExtraSpace(int[] arr1, int[] arr2) {
//        brute(arr1, arr2);
//        optimal_1(arr1, arr2);
        optimal_2(arr1, arr2);
    }

    private static void brute(int[] arr1, int[] arr2) {
//      /**
//       * Brute; TC:[ O(2(N+M)) ]; SC:[ O(N+M) ]
//       ====================================
        int i = 0;
        int j = 0;
        int[] temp = new int[arr1.length + arr2.length];
        int tempI = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                temp[tempI++] = arr1[i++];
            } else {
                temp[tempI++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            temp[tempI++] = arr1[i++];
        }
        while (j < arr2.length) {
            temp[tempI++] = arr2[j++];
        }
        for (int x=0; x < arr1.length+arr2.length; x++){
            if (x < arr1.length) {
                arr1[x] = temp[x];
            } else {
                arr2[x- arr1.length] = temp[x];
            }
        }
//       ====================================
//       */
    }

    private static void optimal_1(int[] arr1, int[] arr2) {
//      /**
//       * Optimal = 1; TC:[ O(Min(N,M)) + O(NlogN) + O(MlogM) ]; SC:[ O(1) ]
//       ====================================
        int i = arr1.length-1;
        int j = 0;
        while (i >=0 && j < arr2.length && arr1[i] > arr2[j]) {
            int temp = arr2[j];
            arr2[j] = arr1[i];
            arr1[i] = temp;
            i--;
            j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
//       ====================================
//       */
    }

    private static void optimal_2(int[] arr1, int[] arr2) {
//      /**
//       * Optimal = 2; TC:[ O(log(N+M) +O(N+M) ]; SC:[ O(1) ]
//       ====================================
        // Gap Method, From Shell sorting
        int l1 = arr1.length;
        int l2 = arr2.length;
        int gap = ((l1+l2) / 2) + ((l1+l2)  % 2);
        while (gap > 0){
            int l = 0;
            int r = l + gap;
            while (r < l1 + l2){
                // l < arr1 && r < arr1
                if (l < l1 && r < l1) {
                    if(arr1[l] > arr1[r]){
                        swap(arr1, l, arr1, r);
                    }
                }
                // l < arr1 && r < arr2
                else if (l < l1 && r >= l1) {
                    if(arr1[l] > arr2[r-l1]){
                        swap(arr1, l, arr2, r-l1);
                    }
                }
                // l < arr2 && r < arr2
                else {
                    if(arr2[l-l1] > arr2[r-l1]){
                        swap(arr2, l-l1, arr2, r-l1);
                    }
                }
                l++;
                r++;
            }
            if (gap == 1) {
                break;
            }
            gap = ((gap) / 2) + ((gap)  % 2);
        }
//       ====================================
//       */
    }

}
