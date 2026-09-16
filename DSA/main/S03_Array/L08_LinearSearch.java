package DSA.main.S03_Array;

public class L08_LinearSearch {

    /** Problem Statement: Given an array, and an element num the task is to find if num is present
     * in the given array or not. If present print the index of the element or print -1.
     */

    public static void main(String[] args) {
//        int n = readInt();
//        int[] arr = readArray(n);
        int n = 8;
        int[] arr = {1, 0, 2, 3, 0, 4, 0, 1};
        System.out.print("Index: " + linerSearch(arr, 4));
    }

    private static int linerSearch(int[] arr, int k) {
//      /**
//       * Brute; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        for (int i=0; i < arr.length; i++){
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
//       ====================================
//       */
    }

}
