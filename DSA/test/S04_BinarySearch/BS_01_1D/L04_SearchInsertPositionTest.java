package DSA.test.S04_BinarySearch.BS_01_1D;

import static DSA.main.S04_BinarySearch.BS_01_1D.L04_SearchInsertPosition.searchInsertPosition;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L04_SearchInsertPositionTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        int[] arr = {1, 2, 2, 3};
        int t = 2;
        int expected = 1;

        int ans = searchInsertPosition(arr, t);
        assertEquals("Test 1: ", expected, ans);
    }

    static void testCase2() {
        int[] arr = {3, 5, 8, 15, 19};
        int t = 9;
        int expected = 3;

        int ans = searchInsertPosition(arr, t);
        assertEquals("Test 2: ", expected, ans);
    }

}
