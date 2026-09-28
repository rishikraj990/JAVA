package DSA.test.S04_BinarySearch.BS_01_1D;

import static DSA.main.S04_BinarySearch.BS_01_1D.L06_FirstLastOccurrence.firstLastOccurrence;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L06_FirstLastOccurrenceTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int x = 8;
        int[] expected = {3, 4};

        int[] ans = firstLastOccurrence(arr, x);
        assertEquals("Test 1: ", expected, ans);
    }

    static void testCase2() {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int x = 6;
        int[] expected = {-1, -1};

        int[] ans = firstLastOccurrence(arr, x);
        assertEquals("Test 2: ", expected, ans);
    }

}
