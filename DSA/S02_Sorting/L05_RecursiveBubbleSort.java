package DSA.S02_Sorting;

import java.util.Scanner;

public class L05_RecursiveBubbleSort {

    /**
     * Given an array of N integers, write a program to implement the Recursive Bubble Sort algorithm.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        recursiveBubbleSort(arr);
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + ", ");
        }
    }

    public static void recursiveBubbleSort(int[] arr) {
//      /**
//       * Optimal; TC:{Best Case:[ O(N) ], Average & Wost Case:[ O(N^2) ]}; SC (Stack Space):[ O(N) ]
//       ====================================
        boolean isCompSorted = Boolean.TRUE;
        for (int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
                isCompSorted = Boolean.FALSE;
            }
        }
        if (isCompSorted){
            return;
        }
        recursiveBubbleSort(arr);
//       ====================================
//       */
    }

}
