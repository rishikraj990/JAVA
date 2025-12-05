package DSA.S01_05_BasicRecursion;

import java.util.Scanner;

import static java.util.Collections.swap;

public class L07_ReverseAnArray {

    /**
     * Problem Statement: You are given an array. The task is to reverse the array and print it.
     *
     * Examples
     * Input: N = 5, arr[] = {5,4,3,2,1}
     * Output: {1,2,3,4,5}
     * Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.
     *
     * Input: N=6 arr[] = {10,20,30,40}
     * Output: {40,30,20,10}
     * Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        reverse(arr, n);

        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int[] arr, int n) {
        int l = arr.length;
        if(n <= l/2){
            return;
        }
        swapp(arr, l-n);
        reverse(arr, n-1);
    }

    private static void swapp(int[] arr, int i) {
        int n = arr.length;
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
    }
}
