package DSA.main.S03_Array;

import static DSA.main.Utilities.Utility.printInt;

public class L11_MaximumConsecutive1s {

    /** Problem Statement: Given an array that contains only 1 and 0 return the count of maximum
     * consecutive ones in the array.
     */

    public static void main(String[] args) {
//        int n = readInt();
//        int[] arr = readArray(n);
        int n = 6;
        int[] arr = {1, 0, 1, 1, 0, 1} ;

        printInt(maxConsecutive1s(arr));
    }

    private static int maxConsecutive1s(int[] arr) {
//      /**
//       * Optimal; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        int max = 0;
        int con = 0;
        for (int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                con = con +1;
                max = Math.max(max, con);
            } else {
                con = 0;
            }
        }
        return max;
//       ====================================
//       */
    }

}
