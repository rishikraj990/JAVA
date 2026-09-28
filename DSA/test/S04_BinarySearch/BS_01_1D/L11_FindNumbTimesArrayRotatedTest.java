package DSA.test.S04_BinarySearch.BS_01_1D;

import static DSA.main.S04_BinarySearch.BS_01_1D.L11_FindNumbTimesArrayRotated.findNumbTimesArrayRotated;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L11_FindNumbTimesArrayRotatedTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int expected = 4;

        int ans = findNumbTimesArrayRotated(arr);
        assertEquals("Test 1: ", expected, ans);
    }

    static void testCase2() {
        int[] arr = {3, 4, 5, 1, 2};
        int expected = 3;

        int ans = findNumbTimesArrayRotated(arr);
        assertEquals("Test 2: ", expected, ans);
    }

}
