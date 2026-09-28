package DSA.test.S04_BinarySearch.BS_03_2D;

import static DSA.main.S04_BinarySearch.BS_03_2D.L03_SearchIn2DMatrix_II.searchIn2DMatrix_II;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L03_SearchIn2DMatrix_IITest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        int[][] arr = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int t = 5;
        boolean expected = Boolean.TRUE;

        boolean actual = searchIn2DMatrix_II(arr, t);
        assertEquals("Test 1: ", expected, actual);
    }

    static void testCase2() {
        int[][] arr = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int t = 20;
        boolean expected = Boolean.FALSE;

        boolean actual = searchIn2DMatrix_II(arr, t);
        assertEquals("Test 2: ", expected, actual);
    }

}
