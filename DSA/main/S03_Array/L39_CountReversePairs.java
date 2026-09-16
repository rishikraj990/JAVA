package DSA.main.S03_Array;

public class L39_CountReversePairs {

    /** Problem Statement: Given an array of numbers, you need to return the count of reverse pairs.
     * Reverse Pairs are those pairs where i<j and arr[i]>2*arr[j].
     */

    public static int countReversePairs(int[] arr) {
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
                if (arr[i] > 2 * arr[j]) {
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
//       * Optimal; TC:[ O(N log2(N) + N) ]; SC:[ O(N) -> For Temp array + Actual Array is Distorted ]
//       ====================================
        return countReversePairsWithMergeSort(arr, 0, arr.length-1);
//       ====================================
//       */
    }

    private static int countReversePairsWithMergeSort(int[] arr, int low, int high) {
        int cnt = 0;
        if (low >= high) {
            return cnt;
        }
        int mid = (low + high) / 2;
        cnt += countReversePairsWithMergeSort(arr, low, mid);
        cnt += countReversePairsWithMergeSort(arr, mid+1, high);
        cnt += findCountReversePairs(arr, low, mid, high);
        merge(arr, low, mid, high);
        return cnt;
    }

    private static int findCountReversePairs(int[] arr, int low, int mid, int high) {
        int cnt = 0;
        int right = mid+1;
        for (int i=low; i<=mid; i++){
            while (right <= high && arr[i] > 2*arr[right]) {
                right++;
            }
            cnt += right - (mid + 1);
        }

        return cnt;
    }

    private static void merge(int[] nums, int low, int mid, int high) {
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
    }

}
