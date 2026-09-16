package DSA.main.S02_Sorting;

import java.util.Scanner;

public class L04_MergeSort {

    /**
     * Problem Statement: Given an array of size n, sort the array using Merge Sort.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        mergeSort(nums, 0, n-1);
        for (int i=0; i<n; i++){
            System.out.print(nums[i] + ", ");
        }
    }

    public static void mergeSort(int[] nums, int low, int high) {
//      /**
//       * Algorithm; TC:[ O(N log2(N) ]; SC:[ O(N) ]
//       ====================================
        if(low >= high){
            return;
        }
        int mid = (low + high)/2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid+1, high);
        merge(nums, low, mid, high);
//       ====================================
//       */
    }

    public static void merge(int[] nums, int low, int mid, int high) {
        int size = (high-low) + 1;
        int[] temp = new int[size];
        int tempInd = 0;
        int i = low;
        int j = mid+1;
        while (i<=mid && j<=high){
            if(nums[i]<=nums[j]){
                temp[tempInd] = nums[i];
                tempInd++;
                i++;
            } else {
                temp[tempInd] = nums[j];
                tempInd++;
                j++;
            }
        }
        while (i<=mid){
            temp[tempInd] = nums[i];
            tempInd++;
            i++;
        }
        while (j<=high){
            temp[tempInd] = nums[j];
            tempInd++;
            j++;
        }

        for(int x=low; x<=high; x++){
            nums[x] = temp[x-low];
        }
    }

}
