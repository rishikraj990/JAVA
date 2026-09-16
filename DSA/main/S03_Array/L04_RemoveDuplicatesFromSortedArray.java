package DSA.main.S03_Array;

import static DSA.main.Utilities.Utility.printArray;

public class L04_RemoveDuplicatesFromSortedArray {

    /**
     * Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place
     * such that each unique element appears only once. The relative order of the elements should be kept the same.
     * If there are k elements after removing the duplicates, then the first k elements of the array should
     * hold the final result. It does not matter what you leave beyond the first k elements.
     */

    public static void main(String[] args) {
//        int n = readInt();
//        int[] arr = readArray(n);
        int n = 7;
        int[] arr = {1, 1, 1, 2, 2, 3, 3};
        System.out.print("Is the array sorted?: " + removeDupInPlace(arr));
        System.out.println();
        printArray(arr);
    }

    private static int removeDupInPlace(int[] arr) {
//      /**
//       * Brute; TC:[ O(N)]; SC:[ O(N) ]
//       ====================================
//        HashSet<Integer> hashSet = new HashSet<>();
//        for (int i=0; i<arr.length; i++){
//            hashSet.add(arr[i]);
//        }
//        int i=0;
//        for (int setElement : hashSet){
//            arr[i] = setElement;
//            i++;
//        }
//        return i;
//       ====================================
//       */

//      /**
//       * Optimal; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        if(arr.length <=1){
            return arr.length;
        }
        int index = 1;
        for (int i=1; i<arr.length; i++){
            if(arr[i-1] != arr[i]){
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
//       ====================================
//       */
    }
}
