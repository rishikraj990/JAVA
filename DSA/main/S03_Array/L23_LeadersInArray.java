package DSA.main.S03_Array;

import java.util.LinkedList;

import static DSA.main.Utilities.Utility.printIntLinkedList;
import static DSA.main.Utilities.Utility.reverse;

public class L23_LeadersInArray {

    /** Problem Statement: Leaders in an Array, where everything on the right should be smaller.
     */

    public static void main(String[] args) {
//        int n = readInt();
//        int[] arr = readArray(n);
        int n = 6;
        int[] arr = {10, 22, 12, 3, 0, 6} ;

        printIntLinkedList(findLeaders(arr));
    }

    private static LinkedList<Integer> findLeaders(int[] arr) {

//      /**
//       * Brute; TC:[ O(N^2) ]; SC:[ O(1) ]
//       ====================================
//        LinkedList<Integer> ll = new LinkedList<>();
//        for (int i=0; i<arr.length; i++){
//            boolean isLeader = true;
//            for (int j=i; j<arr.length; j++){
//                if(arr[j] > arr[i]){
//                    isLeader = false;
//                    break;
//                }
//            }
//            if (isLeader) {
//                ll.add(arr[i]);
//            }
//        }
//        return ll;
//       ====================================
//       */

//      /**
//       * Optimal; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        LinkedList<Integer> ll = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        for (int i=arr.length-1; i>=0; i--){
            if(arr[i] > max){
                ll.add(arr[i]);
                max = arr[i];
            }
        }
        reverse(ll);
        return ll;
//       ====================================
//       */
    }

}
