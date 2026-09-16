package DSA.main.S03_Array;


public class L03_CheckArrayIsSorted_II {

    /**
     * Problem Statement: Given an array of size n, write a program to check if the given array is
     * sorted in (ascending / Increasing / Non-decreasing) order or not.
     * If the array is sorted then return True, Else return False.
     */

    public static void main(String[] args) {
//        int n = readInt();
//        int[] arr = readArray(n);
        int[] arr = {1, 1, 1, 2, 2, 3, 3};
        System.out.print("Is the array sorted?: " + checkSorted(arr));
    }

    private static boolean checkSorted(int[] arr) {
//      /**
//       * Optimal; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        for(int i=1; i<arr.length; i++){
            if(!(arr[i-1] <= arr[i])){
                return false;
            }
        }
        return true;
//       ====================================
//       */
    }
}
