package DSA.main.S03_Array;

import java.util.LinkedList;

import static DSA.main.Utilities.Utility.convertLinedListToArray;
import static DSA.main.Utilities.Utility.printArray;

public class L09_A_UnionOf2SortedArrays {

    /** Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m.
     * Find the union of two sorted arrays.
     * The union of two arrays can be defined as the common and distinct elements in the two arrays.
     * NOTE: Elements in the union should be in ascending order.
     */

    public static void main(String[] args) {
//        int n = readInt();
//        int[] arr1 = readArray(n);
//        int m = readInt();
//        int[] arr2 = readArray(m);
        int n = 8;
        int m = 10;
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {2,3,4,4,5,11,12};
        printArray(unionSortedArrays(arr2, arr1));
    }

    private static int[] unionSortedArrays(int[] arr1, int[] arr2) {
//      /**
//       * Brute; TC:[ O(N1 + N2) +O(N1+N2) ]; SC:[ O(N1+N1) + O(N1+N2) -> to return result ]
//       ====================================
//        HashSet<Integer> outHash = new HashSet<>();
//        for (int i : arr1){
//            outHash.add(i);
//        }
//        for (int i : arr2){
//            outHash.add(i);
//        }
//        return convertHashSetToArray(outHash);
//       ====================================
//       */

//      /**
//       * Optimal; TC:[ O(N1+N2) + O(N1+N2)->To return answer ]; SC:[ O(N1+N2) + O(N1+N2)->To return answer ]
//       ====================================
        int i=0;
        int j=0;
        LinkedList<Integer> outLL = new LinkedList<>();
        while (i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                if(outLL.isEmpty() || arr1[i]!= outLL.getLast()){
                    outLL.add(arr1[i]);
                }
                i++;
            } else {
                if (outLL.isEmpty() ||  arr2[j]!= outLL.getLast()) {
                    outLL.add(arr2[j]);
                }
                j++;
            }
        }
        while (i<arr1.length){
            if(arr1[i]!= outLL.getLast()){
                outLL.add(arr1[i]);
            }
            i++;
        }
        while (j<arr2.length){
            if(arr2[j]!= outLL.getLast()) {
                outLL.add(arr2[j]);
            }
            j++;
        }
        return convertLinedListToArray(outLL);
//       ====================================
//       */
    }

}
