package DSA.test.S05_Strings;

import static DSA.main.S05_Strings.L11_ImplementAtoi.implementAtoi;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L11_ImplementAtoiTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
        testCase5();
    }

    static void testCase1() {
        String str = " -12345";
        int expected = -12345;

        int actual = implementAtoi(str);
        assertEquals("Test 1: ", expected, actual);
    }

    static void testCase2() {
        String str = "4193 with words";
        int expected = 4193;

        int actual = implementAtoi(str);
        assertEquals("Test 2: ", expected, actual);
    }

    static void testCase3() {
        String str = " +004500abc";
        int expected = 4500;

        int actual = implementAtoi(str);
        assertEquals("Test 3: ", expected, actual);
    }

    static void testCase4() {
        String str = " +005495269596948462165987964500abc";
        int expected = Integer.MAX_VALUE;

        int actual = implementAtoi(str);
        assertEquals("Test 4: ", expected, actual);
    }

    static void testCase5() {
        String str = " -00456497946129845629500abc";
        int expected = Integer.MIN_VALUE;

        int actual = implementAtoi(str);
        assertEquals("Test 5: ", expected, actual);
    }

}
