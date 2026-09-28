package DSA.test.S04_BinarySearch.BS_01_1D;

import static DSA.main.S04_BinarySearch.BS_01_1D.L09_SearchInRotatedSortedArray_2.searchInRotatedSortedArray_2;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L09_SearchInRotatedSortedArray_2Test {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
    }

    static void testCase1() {
        int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int x = 3;
        boolean expected = Boolean.TRUE;

        boolean ans = searchInRotatedSortedArray_2(arr, x);
        assertEquals("Test 1: ", expected, ans);
    }

    static void testCase2() {
        int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int x = 10;
        boolean expected = Boolean.FALSE;

        boolean ans = searchInRotatedSortedArray_2(arr, x);
        assertEquals("Test 2: ", expected, ans);
    }

    static void testCase3() {
        int[] arr = {3, 3, 3, 3, 1, 2, 3};
        int x = 1;
        boolean expected = Boolean.TRUE;

        boolean ans = searchInRotatedSortedArray_2(arr, x);
        assertEquals("Test 3: ", expected, ans);
    }

}
