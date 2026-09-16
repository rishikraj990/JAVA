package DSA.main.S03_Array;

import static DSA.main.Utilities.Utility.printInt;

public class L10_FindMissingNumber {

    /** Problem Statement: Given an integer array of size n containing distinct values in the
     * range from 0 to n (inclusive), return the only number missing from the array within this range.
     */

    public static void main(String[] args) {
//        int n = readInt();
//        int[] arr = readArray(n);
        int n = 6;
        int[] arr = {1, 0, 6, 4, 2, 5};

        printInt(findMissingNumber(arr));
    }

    private static int findMissingNumber(int[] arr) {
//      /**
//       * Brute; TC:[ O(N1^2) ]; SC:[ O(1) ]
//       ====================================
//        for (int i=0; i<=arr.length; i++){
//            int flag = 0;
//            for (int j=0; j<arr.length; j++){
//                if(i == arr[j]){
//                    flag = 1;
//                }
//            }
//            if(flag == 0){
//                return i;
//            }
//        }
//        return -1;
//       ====================================
//       */

//      /**
//       * Better; TC:[ O(2N) ]; SC:[ O(N) ]
//       ====================================
//        int[] present = createArrayWithDefaultValue(arr.length+1, 0);
//        for (int i=0; i<arr.length; i++){
//            present[arr[i]] = 1;
//        }
//        for (int i=0; i<=arr.length; i++){
//            if(present[i] == 0){
//                return i;
//            }
//        }
//        return -1;
//       ====================================
//       */

//      /**
//       * Optimal = 1; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
//        int n = arr.length;
//        int sum = (n* (n+1))/2;
//        int cal = 0;
//        for (int i=0; i<n; i++){
//            cal = cal + arr[i];
//        }
//        return sum-cal;
//       ====================================
//       */

//      /**
//       * Optimal = 2; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        int sum = 0;
        int cal = 0;
        for (int i=0; i<arr.length; i++){
            sum = sum ^ i;
            cal = cal ^ arr[i];
        }
        sum = sum ^ arr.length;
        return sum ^ cal;
//       ====================================
//       */
    }

}
