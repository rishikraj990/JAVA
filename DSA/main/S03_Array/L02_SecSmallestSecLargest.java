package DSA.main.S03_Array;

import static DSA.main.Utilities.Utility.readInt;

public class L02_SecSmallestSecLargest {

    /**
     * Problem Statement: Given an array, find the second smallest and second-largest element in the array.
     * Print ‘-1’ in the event that either of them doesn’t exist.
     */

    public static void main(String[] args) {
        int n = readInt();
//        int[] arr = readArray(n);
        int[] arr = {5, 5, 3, 2, 2, 1, 1};
        System.out.print("Second Smallest element: " + findSecSmallest(arr));
        System.out.print("\nSecond Largest element: " + findSecLargest(arr));
    }

    private static int findSecSmallest(int[] arr) {
//      /**
//       * Brute; TC:[ O(N Log(N) ]; SC:[ O(1) ]
//       ====================================
//        Arrays.sort(arr);
//        for (int i =0; i< arr.length; i++){
//            if(arr[0] < arr[i]){
//                return arr[i];
//            }
//        }
//        return -1;
//       ====================================
//       */

//      /**
//       * Better; TC:[ O(2N) ]; SC:[ O(1) ]
//       ====================================
//        int smallest=arr[0];
//        for(int i=0; i<arr.length; i++){
//            if(smallest > arr[i]){
//                smallest = arr[i];
//            }
//        }
//        int secSmallest = Integer.MAX_VALUE;
//        for(int i=0; i<arr.length; i++){
//            if(secSmallest > arr[i] && smallest < arr[i]){
//                secSmallest = arr[i];
//            }
//        }
//        return secSmallest;
//       ====================================
//       */

//      /**
//       * Optimal; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        int smallest=arr[0];
        int secSmallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(smallest > arr[i]){
                secSmallest = smallest;
                smallest = arr[i];
            } else if (secSmallest > arr[i] && smallest < arr[i]) {
                secSmallest = arr[i];
            }
        }
        return secSmallest;
//       ====================================
//       */
    }

    private static int findSecLargest(int[] arr) {
//      /**
//       * Brute; TC:[ O(N Log(N) ]; SC:[ O(1) ]
//       ====================================
//        Arrays.sort(arr);
//        int n = arr.length;
//        for (int i=n-1; i>=0; i--){
//            if(arr[n-1] > arr[i]){
//                return arr[i];
//            }
//        }
//        return -1;
//       ====================================
//       */

//      /**
//       * Better; TC:[ O(2N) ]; SC:[ O(1) ]
//       ====================================
//        int largest = arr[0];
//        for(int i=0; i<arr.length; i++){
//            if(largest < arr[i]){
//                largest = arr[i];
//            }
//        }
//        int secLargest = Integer.MIN_VALUE;
//        for(int i=0; i<arr.length; i++){
//            if(secLargest < arr[i] && largest > arr[i]){
//                secLargest = arr[i];
//            }
//        }
//        return secLargest;
//       ====================================
//       */

//      /**
//       * Optimal; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        int largest = arr[0];
        int secLargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(largest < arr[i]){
                secLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secLargest) {
                secLargest = arr[i];
            }
        }
        return secLargest;
//       ====================================
//       */
    }

}
