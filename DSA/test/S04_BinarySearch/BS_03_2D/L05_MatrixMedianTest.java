package DSA.test.S04_BinarySearch.BS_03_2D;

import static DSA.main.S04_BinarySearch.BS_03_2D.L05_MatrixMedian.matrixMedian;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L05_MatrixMedianTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
    }

    static void testCase1() {
        int[][] arr = {
                {1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}
        };
        int expected = 5;

        int ans = matrixMedian(arr);
        assertEquals("Test 1: ", expected, ans);
    }

    static void testCase2() {
        int[][] arr = {
                {1, 2, 3},
                {3, 3, 3},
                {4, 5, 6}
        };
        int expected = 3;

        int ans = matrixMedian(arr);
        assertEquals("Test 2: ", expected, ans);
    }

    static void testCase3() {
        int[][] arr = {
                {1, 4, 9},
                {2, 5, 6},
                {3, 7, 8}
        };
        int expected = 5;

        int ans = matrixMedian(arr);
        assertEquals("Test 3: ", expected, ans);
    }

    static void testCase4() {
        int[][] arr = {
                {1, 3, 8},
                {2, 3, 4},
                {2, 3, 4}
        };
        int expected = 3;

        int ans = matrixMedian(arr);
        assertEquals("Test 4: ", expected, ans);
    }

}
