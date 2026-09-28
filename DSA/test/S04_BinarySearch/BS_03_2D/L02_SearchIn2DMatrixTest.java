package DSA.test.S04_BinarySearch.BS_03_2D;

import static DSA.main.S04_BinarySearch.BS_03_2D.L02_SearchIn2DMatrix.searchIn2DMatrix;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L02_SearchIn2DMatrixTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int t = 8;
        boolean expected = Boolean.TRUE;

        boolean actual = searchIn2DMatrix(arr, t);
        assertEquals("Test 1: ", expected, actual);
    }

    static void testCase2() {
        int[][] arr = {
                {1, 2, 4},
                {6, 7, 8},
                {9, 10, 34}
        };
        int t = 78;
        boolean expected = Boolean.FALSE;

        boolean actual = searchIn2DMatrix(arr, t);
        assertEquals("Test 2: ", expected, actual);
    }

}
