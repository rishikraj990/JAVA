package DSA.test.S04_BinarySearch.BS_01_1D;

import static DSA.main.S04_BinarySearch.BS_01_1D.L01_SearchInSortedArray.searchInSortedArray;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L01_SearchInSortedArrayTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int t = 9;
        int expected = 4;

        int ans = searchInSortedArray(arr, t);
        assertEquals("Test 1: ", expected, ans);
    }

    static void testCase2() {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int t = 2;
        int expected = -1;

        int ans = searchInSortedArray(arr, t);
        assertEquals("Test 2: ", expected, ans);
    }

}
