package DSA.S02_Sorting;

import java.util.Scanner;

public class L07_QuickSortAlgorithm_Asc {

    /**
     * Problem Statement: Given an array of n integers, sort in ASC the array using the Quicksort method.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n-1);
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + ", ");
        }
    }

    private static void quickSort(int[] arr, int l, int h) {
//      /**
//       * Algorithm; TC:[ O(N log2(N) ]; SC:[ O(1) ]
//       ====================================
        if(l>=h){
            return;
        }
        int pivotElem = arr[l];
        int i = l;
        int j = h;
        while (i<j){
            while (i<=h-1 && pivotElem >= arr[i]){
                i++;
            }
            while (j>=l+1 && pivotElem < arr[j]){
                j--;
            }
            if(i<j){
                swap(arr, i, j);
            }
        }
        swap(arr, l, j);
        quickSort(arr, l, j-1);
        quickSort(arr, j+1, h);
//       ====================================
//       */
    }

    private static void swap (int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
