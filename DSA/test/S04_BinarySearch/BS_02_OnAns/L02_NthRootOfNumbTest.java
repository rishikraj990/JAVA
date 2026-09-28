package DSA.test.S04_BinarySearch.BS_02_OnAns;

import static DSA.main.S04_BinarySearch.BS_02_OnAns.L02_NthRootOfNumb.nthRootOfNumb;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L02_NthRootOfNumbTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        int n = 3;
        int m = 27;
        int expected = 3;

        int ans = nthRootOfNumb(n, m);
        assertEquals("Test 1: ", expected, ans);
    }

    static void testCase2() {
        int n = 4;
        int m = 69;
        int expected = -1;

        int ans = nthRootOfNumb(n, m);
        assertEquals("Test 2: ", expected, ans);
    }

}
