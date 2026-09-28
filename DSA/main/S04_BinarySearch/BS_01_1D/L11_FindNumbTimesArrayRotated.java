package DSA.main.S04_BinarySearch.BS_01_1D;

public class L11_FindNumbTimesArrayRotated {

    /** Problem Statement: Given an integer array arr of size N, sorted in ascending order (with distinct values).
     * Now the array is rotated between 1 to N times which is unknown.
     * Find how many times the array has been rotated.
     */

    public static int findNumbTimesArrayRotated(int[] arr) {
//        return brute(arr);
//        return better(arr);
        return optimal(arr);
    }

    private static int brute(int[] arr) {
//      /**
//       * Brute; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        int index = 0;
        int min = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
//       ====================================
//       */
    }

    private static int better(int[] arr) {
//      /**
//       * Better; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        int index = 0;
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                index = i+1;
                break;
            }
        }
        return index;
//       ====================================
//       */
    }

    private static int optimal(int[] arr) {
//      /**
//       * Optimal; TC:[ O(log2(N)) ]; SC:[ O(1) ]
//       ====================================
        int min = arr[0];
        int index = 0;
        int low = 0;
        int high  = arr.length-1;
        while (low<=high) {
            if (arr[low] <= arr[high]) {
                if (min > arr[low]) {
                    min = arr[low];
                    index = low;
                    break;
                }
            }
            int mid = low + ((high-low)/2);
            if (arr[low] <= arr[mid]) {
                if (min > arr[low]) {
                    min = arr[low];
                    index = low;
                }
                low = mid+1;
            } else {
                if (min > arr[mid]) {
                    min = arr[mid];
                    index = mid;
                }
                high = mid-1;
            }
        }
        return index;
//       ====================================
//       */
    }

}
