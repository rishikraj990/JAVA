package DSA.main.S04_BinarySearch.BS_01_1D;

public class L12_SingleElementInSortedArray {

    /** Problem Statement: Given an array of N integers.
     * Every number in the array except one appears twice. Find the single number in the array.
     */

    public static int singleElementInSortedArray(int[] arr) {
//        return brute(arr);
//        return better(arr);
        return optimal(arr);
    }

    private static int brute(int[] arr) {
//      /**
//       * Brute; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        if (arr.length == 1) {
            return arr[0];
        }
        for (int i=0; i<arr.length; i++) {
            if (i==0) {
                if (arr[i] != arr[i+1]) {
                    return arr[i];
                }
            } else if (i == arr.length-1) {
                if (arr[i] != arr[i-1]) {
                    return arr[i];
                }
            } else {
                if (arr[i] != arr[i+1] && arr[i] != arr[i-1]) {
                    return arr[i];
                }
            }
        }
        return -1;
//       ====================================
//       */
    }

    private static int better(int[] arr) {
//      /**
//       * Better; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        int xor = 0;
        for (int i=0; i<arr.length; i++) {
            xor ^= arr[i];
        }
        return xor;
//       ====================================
//       */
    }

    private static int optimal(int[] arr) {
//      /**
//       * Optimal; TC:[ O(log2(N)) ]; SC:[ O(1) ]
//       ====================================
        if (arr.length == 1) {
            return arr[0];
        }
        if (arr[0] != arr[1]){
            return arr[0];
        }
        if (arr[arr.length-1] != arr[arr.length-2]) {
            return arr[arr.length-1];
        }
        int low = 1;
        int high = arr.length-2;
        while (low<=high) {
            int mid = low + ((high-low)/2);
            if (arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]) {
                return arr[mid];
            }
            if ((mid%2==0 && arr[mid]==arr[mid+1]) || (mid%2==1 && arr[mid]==arr[mid-1])) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return -1;
//       ====================================
//       */
    }

}
