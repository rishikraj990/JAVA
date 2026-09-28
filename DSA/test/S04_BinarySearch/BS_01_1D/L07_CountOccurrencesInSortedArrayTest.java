package DSA.test.S04_BinarySearch.BS_01_1D;

import static DSA.main.S04_BinarySearch.BS_01_1D.L07_CountOccurrencesInSortedArray.countOccurrencesInSortedArray;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L07_CountOccurrencesInSortedArrayTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int x = 8;
        int expected = 2;

        int ans = countOccurrencesInSortedArray(arr, x);
        assertEquals("Test 1: ", expected, ans);
    }

    static void testCase2() {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int x = 6;
        int expected = 0;

        int ans = countOccurrencesInSortedArray(arr, x);
        assertEquals("Test 2: ", expected, ans);
    }

}
