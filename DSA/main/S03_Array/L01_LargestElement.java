package DSA.main.S03_Array;

import static DSA.main.Utilities.Utility.readArray;
import static DSA.main.Utilities.Utility.readInt;

public class L01_LargestElement {

    /**
     * Problem Statement: Given an array, we have to find the largest element in the array.
     */

    public static void main(String[] args) {
        int n = readInt();
        int[] arr = readArray(n);
        System.out.print("Largest element: " + findLargest(arr));
    }

    private static int findLargest(int[] arr) {
//      /**
//       * Brute; TC:[ O(N Log(N)) ]; SC:[ O(1) ]
//       ====================================
//        Arrays.sort(arr);
//        return arr[arr.length-1];
//       ====================================
//       */

//      /**
//       * Optimal; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
//       ====================================
//       */
    }

}
