package DSA.main.S02_Sorting;

import java.util.Scanner;

public class L06_RecursiveInsertionSort {

    /**
     * Given an array of N integers, write a program to implement the Recursive Insertion Sort algorithm.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + ", ");
        }
    }

    public static void insertionSort(int[] arr) {
        if(arr.length <= 1){
            return;
        }
        recursiveInsertionSort(arr, 1);
    }

    private static void recursiveInsertionSort(int[] arr, int n) {
//      /**
//       * Optimal; TC:{Best Case:[ O(N) ], Average & Wost Case:[ O(N^2) ]}; SC (Stack Space):[ O(N) ]
//       ====================================
        if(n>arr.length-1){
            return;
        }
        int i = n;
        while (i>0 && arr[i]<arr[i-1]){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
            i--;
        }
        recursiveInsertionSort(arr, n+1);
//       ====================================
//       */
    }

}
