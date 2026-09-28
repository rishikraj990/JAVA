package DSA.test.S04_BinarySearch.BS_02_OnAns;

import static DSA.main.S04_BinarySearch.BS_02_OnAns.L14_KthElementOf2SortedArrays.kthElementOf2SortedArrays;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L14_KthElementOf2SortedArraysTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        int[] arr1 = {2, 3, 6, 7, 9};
        int[] arr2 = {1, 4, 8, 10};
        int k = 5;
        int expected = 6;

        int ans = kthElementOf2SortedArrays(arr1, arr2, k);
        assertEquals("Test 1: ", expected, ans);
    }

    static void testCase2() {
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;
        int expected = 256;

        int ans = kthElementOf2SortedArrays(arr1, arr2, k);
        assertEquals("Test 2: ", expected, ans);
    }

}
