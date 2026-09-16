package DSA.main.S03_Array;

import static DSA.main.Utilities.Utility.printInt;

public class L12_FindNumberAppears1sOtherNumbers2s {

    /** Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one.
     * Find that single one.
     */

    public static void main(String[] args) {
//        int n = readInt();
//        int[] arr = readArray(n);
        int n = 7;
        int[] arr = {1,2,1,2,11,11,4} ;

        printInt(findNumberAppears1sOtherNumbers2s(arr));
    }

    private static int findNumberAppears1sOtherNumbers2s(int[] arr) {

//      /**
//       * Brute; TC:[ O(2N + MaxValue) ]; SC:[ O(MaxValue) ]
//       ====================================
//        int max = 0;
//        for (int i=0; i<arr.length; i++){
//            max = Math.max(max,arr[i]);
//        }
//        int[] temp = createArrayWithDefaultValue(max+1, 0);
//        for (int i=0; i<arr.length; i++){
//            temp[arr[i]] = temp[arr[i]] + 1;
//        }
//        for (int i=0; i<temp.length; i++){
//            if (temp[arr[i]] == 1 ) {
//                return arr[i];
//            }
//        }
//        return -1;
//       ====================================
//       */

//      /**
//       * Better; TC:[ O(N (logN) + (N/2)+1) ] -> logN to store in Map; SC:[ O((N/2)) ]
//       ====================================
//        HashMap<Long, Integer> temp = new HashMap<>();
//        for (int i=0; i<arr.length; i++){
//            temp.put((long) arr[i], temp.containsKey((long) arr[i]) ? temp.get((long) arr[i])+1 : 1);
//        }
//        for(Map.Entry<Long, Integer> keyValue : temp.entrySet()){
//            if( keyValue.getValue() == 1){
//                return Math.toIntExact(keyValue.getKey());
//            }
//        }
//        return -1;
//       ====================================
//       */

//      /**
//       * Optimal; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        int xor = 0;
        for (int i=0; i< arr.length; i++){
            xor = xor^arr[i];
        }
        return xor;
//       ====================================
//       */
    }

}
