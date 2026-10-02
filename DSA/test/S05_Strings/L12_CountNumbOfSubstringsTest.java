package DSA.test.S05_Strings;

import static DSA.main.S05_Strings.L12_CountNumbOfSubstrings.countNumbOfSubstrings;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L12_CountNumbOfSubstringsTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
    }

    static void testCase1() {
        String str = "52";
        int expected = 3;

        int actual = countNumbOfSubstrings(str);
        assertEquals("Test 1: ", expected, actual);
    }

    static void testCase2() {
        String str = "abc";
        int expected = 6;

        int actual = countNumbOfSubstrings(str);
        assertEquals("Test 2: ", expected, actual);
    }

    static void testCase3() {
        String str = "ab3d";
        int expected = 10;

        int actual = countNumbOfSubstrings(str);
        assertEquals("Test 3: ", expected, actual);
    }

}
