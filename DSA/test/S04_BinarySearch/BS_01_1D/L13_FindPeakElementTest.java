package DSA.test.S04_BinarySearch.BS_01_1D;

import static DSA.main.S04_BinarySearch.BS_01_1D.L13_FindPeakElement.findPeakElement;
import static DSA.test.Utilities.TestUtils.assertEquals;
import static DSA.test.Utilities.TestUtils.assertEqualsAny;

class L13_FindPeakElementTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
        testCase5();
    }

    static void testCase1() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 5, 1};
        int expected = 7;

        int ans = findPeakElement(arr);
        assertEquals("Test 1: ", expected, ans);
    }

    static void testCase2() {
        int[] arr = {1, 2, 1, 3, 5, 6, 4};
        int expected1 = 1;
        int expected2 = 5;

        int ans = findPeakElement(arr);
        assertEqualsAny("Test 2: ", ans, expected1, expected2);
    }

    static void testCase3() {
        int[] arr = {1, 2, 3, 4, 5};
        int expected = 4;

        int ans = findPeakElement(arr);
        assertEquals("Test 3: ", expected, ans);
    }

    static void testCase4() {
        int[] arr = {5, 4, 3, 2, 1};
        int expected = 0;

        int ans = findPeakElement(arr);
        assertEquals("Test 4: ", expected, ans);
    }

    static void testCase5() {
        int[] arr = {1, 5, 1, 2, 1};
        int expected = 1;

        int ans = findPeakElement(arr);
        assertEquals("Test 5: ", expected, ans);
    }

}
