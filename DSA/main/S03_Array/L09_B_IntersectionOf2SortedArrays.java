package DSA.main.S03_Array;

import java.util.LinkedList;

import static DSA.main.Utilities.Utility.convertLinedListToArray;
import static DSA.main.Utilities.Utility.printArray;

public class L09_B_IntersectionOf2SortedArrays {

    /** Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m.
     * Find the intersection of two sorted arrays.
     * The intersection of two arrays can be defined as there is a corresponding elements in the two arrays.
     * NOTE: Elements in the intersection should be in ascending order and can be duplicate.
     */

    public static void main(String[] args) {
//        int n = readInt();
//        int[] arr1 = readArray(n);
//        int m = readInt();
//        int[] arr2 = readArray(m);
        int n = 8;
        int m = 10;
        int[] arr1 = {1,2,3,4,5,5,6,7,8,9,10};
        int[] arr2 = {2,3,4,4,5,5,11,12};
        printArray(intersectionSortedArrays(arr2, arr1));
    }

    private static int[] intersectionSortedArrays(int[] arr1, int[] arr2) {
//      /**
//       * Brute; TC:[ O(N1 * N2) + O(N1+N2) ]; SC:[ O(N1+N1) + O(N1+N2) -> to return result ]
//       ====================================
//        int [] visited = new int[arr2.length];
//        Arrays.fill(visited, 0);
//
//        LinkedList<Integer> outLL = new LinkedList<>();
//        for (int i=0; i< arr1.length; i++){
//            for (int j=0; j<arr2.length; j++){
//                if(arr1[i] == arr2[j] && visited[j] == 0){
//                    outLL.add(arr1[i]);
//                    visited[j] = 1;
//                }
//                if(arr2[j]> arr1[i]){
//                    break;
//                }
//            }
//        }
//        return convertLinedListToArray(outLL);
//       ====================================
//       */

//      /**
//       * Optimal; TC:[ O(N1 | N2)->which ever is smallest ]; SC:[ O(N1 | N2) ->which ever is smallest & To return answer ]
//       ====================================
        int i=0;
        int j=0;
        LinkedList<Integer> outLL = new LinkedList<>();
        while (i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            } else if(arr2[j] < arr1[i]) {
                j++;
            } else {
                outLL.add(arr1[i]);
                i++;
                j++;
            }
        }
        return convertLinedListToArray(outLL);
//       ====================================
//       */
    }

}
