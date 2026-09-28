package DSA.main.S04_BinarySearch.BS_01_1D;

import static DSA.main.S04_BinarySearch.BS_01_1D.L06_FirstLastOccurrence.firstLastOccurrence;

public class L07_CountOccurrencesInSortedArray {

    /** Problem Statement: You are given a sorted array containing N integers and a number X,
     * you have to find the occurrences of X in the given array.
     */

    public static int countOccurrencesInSortedArray(int[] arr, int t) {
//        return brute(arr, t);
        return optimal(arr, t);
    }

    private static int brute(int[] arr, int t) {
//      /**
//       * Brute; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        int first = -1;
        int last = -1;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == t) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        return first == -1 ?  0 : last-first+1;
//       ====================================
//       */
    }

    private static int optimal(int[] arr, int t) {
//      /**
//       * Optimal; TC:[ O(2log2(N)) ]; SC:[ O(1) ]
//       ====================================
        int [] firLasOcc = firstLastOccurrence(arr, t);
        return firLasOcc[0] == -1 ? 0 : firLasOcc[1]-firLasOcc[0]+1;
//       ====================================
//       */
    }

}
