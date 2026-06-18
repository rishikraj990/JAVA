package DSA.S01_Basic.S01_05_BasicRecursion;

import java.util.Scanner;

import static java.util.Collections.swap;

public class L07_ReverseAnArray {

    /**
     * Problem Statement: You are given an array. The task is to reverse the array and print it.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        reverse(arr, 0);

        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int[] arr, int i) {
//      /**
//       * Brute; TC:[ O(N) ]; SC (Stack Space):[ O(N) ]
//       ====================================
        int l = arr.length;
//        if(i >= l/2){
//            return;
//        }
//        swap(arr, i, l-i-1);
//        reverse(arr, i+1);
//       ====================================
//       */

//      /**
//       * Better; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        while (i < l/2){
            swap(arr, i, l-i-1);
            i++;
        }
//       ====================================
//       */
    }

    private static void swap(int[] arr, int i, int l) {
        int temp = arr[i];
        arr[i] = arr[l];
        arr[l] = temp;
    }
}
