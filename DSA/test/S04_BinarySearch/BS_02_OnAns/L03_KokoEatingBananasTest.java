package DSA.test.S04_BinarySearch.BS_02_OnAns;

import static DSA.main.S04_BinarySearch.BS_02_OnAns.L03_KokoEatingBananas.kokoEatingBananas;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L03_KokoEatingBananasTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        int[] arr = {7, 15, 6, 3};
        int h = 8;
        int expected = 5;

        int ans = kokoEatingBananas(arr, h);
        assertEquals("Test 1: ", expected, ans);
    }

    static void testCase2() {
        int[] arr = {25, 12, 8, 14, 19};
        int h = 5;
        int expected = 25;

        int ans = kokoEatingBananas(arr, h);
        assertEquals("Test 2: ", expected, ans);
    }

}
