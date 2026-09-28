package DSA.test.S04_BinarySearch.BS_02_OnAns;

import static DSA.main.S04_BinarySearch.BS_02_OnAns.L01_SqrtRootOfNumb.sqrtRootOfNumb;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L01_SqrtRootOfNumbTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        int n = 36;
        int expected = 6;

        int ans = sqrtRootOfNumb(n);
        assertEquals("Test 1: ", expected, ans);
    }

    static void testCase2() {
        int n = 28;
        int expected = 5;

        int ans = sqrtRootOfNumb(n);
        assertEquals("Test 2: ", expected, ans);
    }

}
