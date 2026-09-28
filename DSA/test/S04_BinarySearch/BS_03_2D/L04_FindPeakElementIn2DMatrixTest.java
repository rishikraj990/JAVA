package DSA.test.S04_BinarySearch.BS_03_2D;

import static DSA.main.S04_BinarySearch.BS_03_2D.L04_FindPeakElementIn2DMatrix.findPeakElementIn2DMatrix;
import static DSA.test.Utilities.TestUtils.assertEqualsAny;

class L04_FindPeakElementIn2DMatrixTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        int[][] arr = {
                {40, 20, 15},
                {21, 30, 14},
                {7, 16, 32}
        };
        int[] expected1 = {0, 0};
        int[] expected2 = {1, 1};

        int[] actual = findPeakElementIn2DMatrix(arr);
        assertEqualsAny("Test 1: ", actual, expected1, expected2);
    }

    static void testCase2() {
        int[][] arr = {
                {1, 4},
                {3, 2}
        };
        int[] expected1 = {0, 1};
        int[] expected2 = {1, 0};

        int[] actual = findPeakElementIn2DMatrix(arr);
        assertEqualsAny("Test 2: ", actual, expected1, expected2);
    }

}
