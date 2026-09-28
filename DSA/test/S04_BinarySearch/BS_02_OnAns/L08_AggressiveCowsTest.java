package DSA.test.S04_BinarySearch.BS_02_OnAns;

import static DSA.main.S04_BinarySearch.BS_02_OnAns.L08_AggressiveCows.aggressiveCows;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L08_AggressiveCowsTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        int[] arr = {0, 3, 4, 7, 10, 9};
        int k = 4;
        int expected = 3;

        int ans = aggressiveCows(arr, k);
        assertEquals("Test 1: ", expected, ans);
    }

    static void testCase2() {
        int[] arr = {4, 2, 1, 3, 6};
        int k = 2;
        int expected = 5;

        int ans = aggressiveCows(arr, k);
        assertEquals("Test 2: ", expected, ans);
    }

}
