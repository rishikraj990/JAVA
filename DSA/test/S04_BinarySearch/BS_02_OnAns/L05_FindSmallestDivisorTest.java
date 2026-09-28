package DSA.test.S04_BinarySearch.BS_02_OnAns;

import static DSA.main.S04_BinarySearch.BS_02_OnAns.L05_FindSmallestDivisor.findSmallestDivisor;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L05_FindSmallestDivisorTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        int[] arr = {1, 2, 3, 4, 5};
        int thresh = 8;
        int expected = 3;

        int ans = findSmallestDivisor(arr, thresh);
        assertEquals("Test 1: ", expected, ans);
    }

    static void testCase2() {
        int[] arr = {8,4,2,3};
        int thresh = 10;
        int expected = 2;

        int ans = findSmallestDivisor(arr, thresh);
        assertEquals("Test 2: ", expected, ans);
    }

}
