package DSA.test.S04_BinarySearch.BS_02_OnAns;

import static DSA.main.S04_BinarySearch.BS_02_OnAns.L10_SplitArrayLargestSum.splitArrayLargestSum;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L10_SplitArrayLargestSumTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        int expected = 6;

        int ans = splitArrayLargestSum(arr, k);
        assertEquals("Test 1: ", expected, ans);
    }

    static void testCase2() {
        int[] arr = {3,5,1};
        int k = 3;
        int expected = 5;

        int ans = splitArrayLargestSum(arr, k);
        assertEquals("Test 2: ", expected, ans);
    }

}
