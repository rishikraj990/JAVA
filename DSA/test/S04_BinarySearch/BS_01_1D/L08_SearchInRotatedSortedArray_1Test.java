package DSA.test.S04_BinarySearch.BS_01_1D;

import static DSA.main.S04_BinarySearch.BS_01_1D.L08_SearchInRotatedSortedArray_1.searchInRotatedSortedArray_1;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L08_SearchInRotatedSortedArray_1Test {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int x = 0;
        int expected = 4;

        int ans = searchInRotatedSortedArray_1(arr, x);
        assertEquals("Test 1: ", expected, ans);
    }

    static void testCase2() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int x = 3;
        int expected = -1;

        int ans = searchInRotatedSortedArray_1(arr, x);
        assertEquals("Test 2: ", expected, ans);
    }

}
