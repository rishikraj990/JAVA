package DSA.test.S04_BinarySearch.BS_02_OnAns;

import static DSA.main.S04_BinarySearch.BS_02_OnAns.L04_MinDaysToMakeMBouquets.minDaysToMakeMBouquets;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L04_MinDaysToMakeMBouquetsTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;
        int expected = 12;

        int ans = minDaysToMakeMBouquets(arr, k, m);
        assertEquals("Test 1: ", expected, ans);
    }

    static void testCase2() {
        int[] arr = {1, 10, 3, 10, 2};
        int k = 2;
        int m = 3;
        int expected = -1;

        int ans = minDaysToMakeMBouquets(arr, k, m);
        assertEquals("Test 2: ", expected, ans);
    }

}
