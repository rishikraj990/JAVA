package DSA.main.S04_BinarySearch.BS_02_OnAns;

public class L13_MedianOf2SortedArrays {

    /** Problem Statement: Given two sorted arrays arr1 and arr2 of size m and n respectively,
     * return the median of the two sorted arrays.
     * The median is defined as the middle value of a sorted list of numbers.
     * In case the length of the list is even, the median is the average of the two middle elements.
     */

    public static double medianOf2SortedArrays(int[] arr1, int[] arr2) {
//        return brute(arr1, arr2);
//        return better(arr1, arr2);
        return optimal(arr1, arr2);
    }

    private static double brute(int[] arr1, int[] arr2) {
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
        if (c % 2 == 1) return arr3[c/2];
        else return (double) (arr3[c / 2] + arr3[(c / 2) - 1]) /2;
//       ====================================
//       */
    }

    private static double better(int[] arr1, int[] arr2) {
//      /**
//       * Better; TC:[ O(N1+N2) ]; SC:[ O(1) ]
//       ====================================
        int a = arr1.length;
        int b = arr2.length;
        int c = a+b;
        int index1 = c/2;
        int index2 = c/2 - 1;
        double indexEle1 = -1;
        double indexEle2 = -1;
        int i = 0, j = 0, k = 0;
        while (i < a && j < b) {
            if (arr1[i] <= arr2[j]) {
                if (k == index2 ) indexEle2 = arr1[i];
                else if (k == index1) indexEle1 = arr1[i];
                i++;
            }
            else {
                if (k == index2 ) indexEle2 = arr2[j];
                else if (k == index1) indexEle1 = arr2[j];
                j++;
            }
            k++;
        }
        while (i < a) {
            if (k == index2 ) indexEle2 = arr1[i];
            else if (k == index1) indexEle1 = arr1[i];
            i++;
            k++;
        }
        while (j < b) {
            if (k == index2 ) indexEle2 = arr2[j];
            else if (k == index1) indexEle1 = arr2[j];
            j++;
            k++;
        }
        if (c % 2 == 1) return indexEle1;
        else return (indexEle1 + indexEle2) /2;
//       ====================================
//       */
    }

    private static double optimal(int[] arr1, int[] arr2) {
//      /**
//       * Optimal; TC:[ O(log2(Min(arr1, arr2))) ]; SC:[ O(1) ]
//       ====================================
        int n1 = arr1.length;
        int n2 = arr2.length;
        if (n1 > n2) return optimal(arr2, arr1);
        int low = 0;
        int high = n1;
        int left = (n1 + n2 + 1) / 2;
        int n = n1 + n2;
        while (low<=high) {
            int mid1 = low + ((high-low)/2);
            int mid2 = left - mid1;
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;
            if (mid1 < n1) r1 = arr1[mid1];
            if (mid2 < n2) r2 = arr2[mid2];
            if (mid1 - 1 >= 0) l1 = arr1[mid1-1];
            if (mid2 - 1 >= 0) l2 = arr2[mid2-1];
            if (l1 <= r2 && l2 <= r1) {
                if (n % 2 == 1) return Math.max(l1, l2);
                return (double)(Math.max(l1, l2) + Math.min(r1, r2)) / 2;
            } else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0;
//       ====================================
//       */
    }

}
