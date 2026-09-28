package DSA.test.S04_BinarySearch.BS_01_1D;

import static DSA.main.S04_BinarySearch.BS_01_1D.L12_SingleElementInSortedArray.singleElementInSortedArray;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L12_SingleElementInSortedArrayTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        int expected = 4;

        int ans = singleElementInSortedArray(arr);
        assertEquals("Test 1: ", expected, ans);
    }

    static void testCase2() {
        int[] arr = {1, 1, 3, 5, 5};
        int expected = 3;

        int ans = singleElementInSortedArray(arr);
        assertEquals("Test 2: ", expected, ans);
    }

}
