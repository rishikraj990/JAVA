package DSA.main.S03_Array;

import static DSA.main.Utilities.Utility.printInt;

public class L17_MajorityElement_I_More_N2 {

    /** Problem Statement: Given an integer array nums of size n, return the majority element of the array.
     * The majority element of an array is an element that appears more than n/2 times in the array.
     * The array is guaranteed to have a majority element.
     */

    public static void main(String[] args) {
//        int n = readInt();
//        int[] arr = readArray(n);
        int n = 9;
        int[] arr = {7, 0, 0, 1, 7, 7, 2, 7, 7} ;

        printInt(findMajorityElementMoreThankN_2(arr));
    }

    private static int findMajorityElementMoreThankN_2(int[] arr) {

//      /**
//       * Brute; TC:[ O(N^2) ]; SC:[ O(1) ]
//       ====================================
//        for (int i=0; i<arr.length; i++){
//            int t = 0;
//            for (int j=0; j<arr.length; j++){
//                if(arr[j] == arr[i]){
//                    t++;
//                }
//            }
//            if(t > arr.length/2){
//                return arr[i];
//            }
//        }
//        return -1;
//       ====================================
//       */

//      /**
//       * Better; TC:[ O(N*logN) + O(N) ]; SC:[ O(N) ]
//       ====================================
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        for (int i=0; i<arr.length; i++){
//            hashMap.put(arr[i], hashMap.containsKey(arr[i]) ? hashMap.get(arr[i])+1 : 1 );
//        }
//        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet() ){
//            if (entry.getValue() > arr.length/2){
//                return entry.getKey();
//            }
//        }
//        return -1;
//       ====================================
//       */

//      /**
//       * Optimal; TC:[ O(2N) ]; SC:[ O(1) ]
//       ====================================
        // Moore's Voting Algo
        int ele = 0;
        int c = 0;
        for (int i=0; i< arr.length; i++){
            if (c==0) {
                ele = arr[i];
                c = 1;
            } else if (arr[i] == ele) {
                c++;
            } else {
                c--;
            }
        }
        int check = 0;
        for (int i=0; i< arr.length; i++){
            if (arr[i] == ele) {
                check++;
            }
        }
        return check > arr.length/2 ? ele : -1;
//       ====================================
//       */
    }

}
