package DSA.main.S03_Array;

import java.util.HashSet;

import static DSA.main.Utilities.Utility.printInt;

public class L24_LongestConsecutiveSequenceInArray {

    /** Problem Statement: Given an array nums of n integers.
     * Return the length of the longest sequence of consecutive integers.
     * The integers in this sequence can appear in any order.
     */

    public static void main(String[] args) {
//        int n = readInt();
//        int[] arr = readArray(n);
        int n = 12;
        int[] arr = {4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,5,5,-4,6,6,-3} ;

        printInt(longestConsecutiveSequenceInArray(arr));
    }

    private static int longestConsecutiveSequenceInArray(int[] arr) {

//      /**
//       * Brute; TC:[ O(N^3) ]; SC:[ O(1) ]
//       ====================================
//        int max = 0;
//        for (int i=0; i<arr.length; i++){
//            int c = 1;
//            while (linerSearch(arr, arr[i] + c)){
//                c++;
//            }
//            max = Math.max(max, c);
//        }
//        return max;
//       ====================================
//       */

//      /**
//       * Better; TC:[ O(N * N logN) ]; SC:[ O(1) ]
//       ====================================
//        Arrays.sort(arr);
//        int max = 0;
//        int c = 1;
//        for (int i=1; i<arr.length; i++){
//            if (arr[i-1] == arr[i]) {
//                continue;
//            } else if (arr [i-1] == arr[i]-1){
//                c++;
//                max = Math.max(max, c);
//            } else {
//                c = 1;
//            }
//        }
//        return max;
//       ====================================
//       */

//      /**
//       * Optimal; TC:[ O(3N) ]; SC:[ O(N) ]
//       ====================================
        int max = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0; i< arr.length; i++){
            hashSet.add(arr[i]);
        }
        int c = 1;
        for (int elm : hashSet){
            if (hashSet.contains(elm-1)){

            } else {
                int i=1;
                while (hashSet.contains(elm + i)) {
                    i++;
                    c++;
                }
                max = Math.max(max, c);
            }
            c=1;
        }
        return max;
//       ====================================
//       */
    }

}
