package DSA.test.S04_BinarySearch.BS_02_OnAns;

import static DSA.main.S04_BinarySearch.BS_02_OnAns.L07_KthMissingPositiveNumb.kthMissingPositiveNumb;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L07_KthMissingPositiveNumbTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
    }

    static void testCase1() {
        int[] arr = {3, 5, 7, 10};
        int k = 6;
        int expected = 9;

        int ans = kthMissingPositiveNumb(arr, k);
        assertEquals("Test 1: ", expected, ans);
    }

    static void testCase2() {
        int[] arr = {1, 4, 6, 8, 9};
        int k = 3;
        int expected = 5;

        int ans = kthMissingPositiveNumb(arr, k);
        assertEquals("Test 2: ", expected, ans);
    }

    static void testCase3() {
        int[] arr = {2, 3, 4, 7, 9, 11};
        int k = 5;
        int expected = 10;

        int ans = kthMissingPositiveNumb(arr, k);
        assertEquals("Test 3: ", expected, ans);
    }

    static void testCase4() {
        int[] arr = {4, 7, 9};
        int k = 3;
        int expected = 3;

        int ans = kthMissingPositiveNumb(arr, k);
        assertEquals("Test 4: ", expected, ans);
    }


}
