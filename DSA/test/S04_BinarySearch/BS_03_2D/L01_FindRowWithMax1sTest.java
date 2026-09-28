package DSA.test.S04_BinarySearch.BS_03_2D;

import static DSA.main.S04_BinarySearch.BS_03_2D.L01_FindRowWithMax1s.findRowWithMax1s;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L01_FindRowWithMax1sTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        int[][] arr = {
                {0, 0, 1, 1},
                {0, 1, 1, 1},
                {0, 0, 0, 1}
        };
        int expected = 1;

        int actual = findRowWithMax1s(arr);
        assertEquals("Test 1: ", expected, actual);
    }

    static void testCase2() {
        int[][] arr = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        int expected = -1;

        int actual = findRowWithMax1s(arr);
        assertEquals("Test 2: ", expected, actual);
    }

}
