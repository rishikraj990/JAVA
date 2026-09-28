package DSA.main.S04_BinarySearch.BS_02_OnAns;

public class L14_KthElementOf2SortedArrays {

    /** Problem Statement: Given two sorted arrays a and b of size m and n respectively.
     * Find the kth element of the final sorted array.
     */

    public static int kthElementOf2SortedArrays(int[] arr1, int[] arr2, int k) {
//        return brute(arr1, arr2, k);
//        return better(arr1, arr2, k);
        return optimal(arr1, arr2, k);
    }

    private static int brute(int[] arr1, int[] arr2, int ind) {
//      /**
//       * Brute; TC:[ O(N1+N2) ]; SC:[ O(N1+N2) ]
//       ====================================
        int a = arr1.length;
        int b = arr2.length;
        int c = a+b;
        int[] arr3 = new int[c];
        int i = 0, j = 0, k = 0;
        while (i < a && j < b) {
            if (arr1[i] <= arr2[j]) arr3[k++] = arr1[i++];
            else arr3[k++] = arr2[j++];
        }
        while (i < a) arr3[k++] = arr1[i++];
        while (j < b) arr3[k++] = arr2[j++];
        return arr3[ind-1];
//       ====================================
//       */
    }

    private static int better(int[] arr1, int[] arr2, int ind) {
//      /**
//       * Better; TC:[ O(N1+N2) ]; SC:[ O(1) ]
//       ====================================
        int a = arr1.length;
        int b = arr2.length;
        int i = 0, j = 0, k = 0;
        while (i < a && j < b) {
            if (arr1[i] <= arr2[j]) {
                if (k == ind-1 ) return arr1[i];
                i++;
            } else {
                if (k == ind-1 ) return arr2[j];
                j++;
            }
            k++;
        }
        while (i < a) {
            if (k == ind-1 ) return arr1[i];
            i++; k++;
        }
        while (j < b) {
            if (k == ind-1 ) return arr2[j];
            j++; k++;
        }
        return 0;
//       ====================================
//       */
    }

    private static int optimal(int[] arr1, int[] arr2, int ind) {
//      /**
//       * Optimal; TC:[ O(log2(Min(arr1, arr2))) ]; SC:[ O(1) ]
//       ====================================
        int n1 = arr1.length;
        int n2 = arr2.length;
        if (n1 > n2) return optimal(arr2, arr1, ind);
        int low = Math.max(0, ind-n2);
        int high = Math.min(ind, n1);
        while (low<=high) {
            int mid1 = low + ((high-low)/2);
            int mid2 = ind - mid1;
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;
            if (mid1 < n1) r1 = arr1[mid1];
            if (mid2 < n2) r2 = arr2[mid2];
            if (mid1 - 1 >= 0) l1 = arr1[mid1-1];
            if (mid2 - 1 >= 0) l2 = arr2[mid2-1];
            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            } else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0;
//       ====================================
//       */
    }

}
