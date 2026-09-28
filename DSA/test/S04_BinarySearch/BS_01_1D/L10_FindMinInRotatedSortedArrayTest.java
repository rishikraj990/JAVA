package DSA.test.S04_BinarySearch.BS_01_1D;

import static DSA.main.S04_BinarySearch.BS_01_1D.L10_FindMinInRotatedSortedArray.findMinInRotatedSortedArray;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L10_FindMinInRotatedSortedArrayTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int expected = 0;

        int ans = findMinInRotatedSortedArray(arr);
        assertEquals("Test 1: ", expected, ans);
    }

    static void testCase2() {
        int[] arr = {3, 4, 5, 1, 2};
        int expected = 1;

        int ans = findMinInRotatedSortedArray(arr);
        assertEquals("Test 2: ", expected, ans);
    }

}
