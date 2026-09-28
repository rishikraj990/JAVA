package DSA.test.S04_BinarySearch.BS_02_OnAns;

import static DSA.main.S04_BinarySearch.BS_02_OnAns.L09_BookAllocationProblem.bookAllocationProblem;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L09_BookAllocationProblemTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        int[] arr = {12, 34, 67, 90};
        int m = 2;
        int expected = 113;

        int ans = bookAllocationProblem(arr, m);
        assertEquals("Test 1: ", expected, ans);
    }

    static void testCase2() {
        int[] arr = {25, 46, 28, 49, 24};
        int m = 4;
        int expected = 71;

        int ans = bookAllocationProblem(arr, m);
        assertEquals("Test 2: ", expected, ans);
    }

}
