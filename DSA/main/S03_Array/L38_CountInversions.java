package DSA.main.S03_Array;

public class L38_CountInversions {

    /** Problem Statement: Given an array of N integers, count the inversion of the array.
     * Inversion of an array: for all i & j < size of array, if i < j
     * then you have to find pair (A[i],A[j]) such that A[j] < A[i].
     */

    public static int countInversions(int[] arr) {
//        return brute(arr);
        return optimal(arr);
    }

    private static int brute(int[] arr) {
//      /**
//       * Brute; TC:[ O(N^2) ]; SC:[ O(1) ]
//       ====================================
        int cnt = 0;
        for (int i=0; i<arr.length-1; i++) {
            for (int j = i+1; j<arr.length; j++) {
                if (arr[i] > arr[j]) {
                    cnt++;
                }
            }
        }
        return cnt;
//       ====================================
//       */
    }

    private static int optimal(int[] arr) {
//      /**
//       * Optimal; TC:[ O(N log2(N)) ]; SC:[ O(N) -> For Temp array + Actual Array is Distorted ]
//       ====================================
        return countInversionWithMergeSort(arr, 0, arr.length-1);
//       ====================================
//       */
    }

    private static int countInversionWithMergeSort(int[] arr, int low, int high) {
        int cnt = 0;
        if (low >= high) {
            return cnt;
        }
        int mid = (low + high) / 2;
        cnt += countInversionWithMergeSort(arr, low, mid);
        cnt += countInversionWithMergeSort(arr, mid+1, high);
        cnt += merge(arr, low, mid, high);
        return cnt;
    }

    private static int merge(int[] nums, int low, int mid, int high) {
        int cnt = 0;
        int size = (high-low) + 1;
        int[] temp = new int[size];
        int tempInd = 0;
        int i = low;
        int j = mid+1;
        while (i<=mid && j<=high){
            if(nums[i]<=nums[j]){
                temp[tempInd] = nums[i];
                tempInd++;
                i++;
            } else {
                cnt += mid - i + 1;
                temp[tempInd] = nums[j];
                tempInd++;
                j++;
            }
        }
        while (i<=mid){
            temp[tempInd] = nums[i];
            tempInd++;
            i++;
        }
        while (j<=high){
            temp[tempInd] = nums[j];
            tempInd++;
            j++;
        }

        for(int x=low; x<=high; x++){
            nums[x] = temp[x-low];
        }
        return cnt;
    }

}
