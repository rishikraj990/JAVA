package DSA.main.S04_BinarySearch.BS_01_1D;

public class L13_FindPeakElement {

    /** Problem Statement: Given an array of length N, peak element is defined as the element
     * greater than both of its neighbors. Formally, if arr[i] is the peak element,
     * arr[i - 1] < arr[i] and arr[i + 1] < arr[i]. Find the index(0-based) of a peak element in the array.
     * If there are multiple peak numbers, return the index of any peak number.
     */

    public static int findPeakElement(int[] arr) {
//        return brute(arr);
        return optimal(arr);
    }

    private static int brute(int[] arr) {
//      /**
//       * Brute; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        int n = arr.length;
        if (n == 1) return n-1;
        if (arr[0] > arr[1]) return 0;
        if (arr[n-1] > arr[n-2]) return n-1;
        for (int i=1; i<n-2; i++){
            if (arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                return i;
            }
        }
        return -1;
//       ====================================
//       */
    }

    private static int optimal(int[] arr) {
//      /**
//       * Optimal; TC:[ O(log2(N)) ]; SC:[ O(1) ]
//       ====================================
        int n = arr.length;
        if (n == 1) return 0;
        if (arr[0] > arr[1]) return 0;
        if (arr[n-1] > arr[n-2]) return n-1;
        int low = 1;
        int high = n-2;
        while (low<=high) {
            int mid = low + ((high-low)/2);
            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) return mid; // when mid is on peak
            if (arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) low = mid+1; // when mid is on increasing slope
            else if (arr[mid] < arr[mid-1] && arr[mid] > arr[mid+1]) high = mid-1; // when mid is on decreasing slope
            else high = mid-1; // when mid is on valley
        }
        return -1;
//       ====================================
//       */
    }

}
