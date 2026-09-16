package DSA.main.S03_Array;

import static DSA.main.Utilities.Utility.printArray;
import static DSA.main.Utilities.Utility.reverse;
import static DSA.main.Utilities.Utility.swap;

public class L22_FindNextPermutation {

    /** Problem Statement: Next Permutation : find next lexicographically greater permutation
     * Given an array Arr[] of integers, rearrange the numbers of the given array into the
     * lexicographically next greater permutation of numbers.
     * If such an arrangement is not possible, it must rearrange to the lowest
     * possible order (i.e., sorted in ascending order).
     */

    public static void main(String[] args) {
//        int n = readInt();
//        int[] arr = readArray(n);
        int n = 7;
        int[] arr = {2, 1, 5, 4, 3, 0, 0} ;

        printArray(nextPermutation(arr));
    }

    private static int[] nextPermutation(int[] arr) {

//      /**
//       * Brute; TC:[ O(N! x N) ]; SC:[ O(1) ]
//       ====================================

        //1. Find all possible permutations of elements present and store them.
        //2. Linear Search the current permutation.
        //3. Return next permutation present right after it.
        //4. If the current permutation is the last, return the first permutation in the list.

//       ====================================
//       */

//      /**
//       * Optimal; TC:[ O(3N) ]; SC:[ O(1) ]
//       ====================================
        int index = -1;
        int n = arr.length;
        for (int i = n-2; i>=0; i--){
            if(arr[i] < arr[i+1]){
                index = i;
                break;
            }
        }
        if (index == -1){
            reverse(arr);
            return arr;
        }
        for (int i=n-1; i>index; i--){
            if (arr[i] > arr[index]){
                swap(arr, i, index);
                break;
            }
        }
        reverse(arr, index+1, arr.length - 1);
        return arr;
//       ====================================
//       */
    }

}
