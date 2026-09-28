package DSA.test.S04_BinarySearch.BS_02_OnAns;

import static DSA.main.S04_BinarySearch.BS_02_OnAns.L13_MedianOf2SortedArrays.medianOf2SortedArrays;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L13_MedianOf2SortedArraysTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        int[] arr1 = {2, 4, 6};
        int[] arr2 = {1, 3, 5};
        double expected = 3.5;

        double ans = medianOf2SortedArrays(arr1, arr2);
        assertEquals("Test 1: ", expected, ans);
    }

    static void testCase2() {
        int[] arr1 = {2, 4, 6};
        int[] arr2 = {1, 3};
        double expected = 3.0;

        double ans = medianOf2SortedArrays(arr1, arr2);
        assertEquals("Test 2: ", expected, ans);
    }

}
