package DSA.test.S05_Strings;

import static DSA.main.S05_Strings.L04_LongestCommonPrefix.longestCommonPrefix;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L04_LongestCommonPrefixTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        String[] strArr = {"flower","flow","flight"};
        String expected = "fl";

        String actual = longestCommonPrefix(strArr);
        assertEquals("Test 1: ", expected, actual);
    }

    static void testCase2() {
        String[] strArr = {"dog","racecar","car"};
        String expected = "";

        String actual = longestCommonPrefix(strArr);
        assertEquals("Test 2: ", expected, actual);
    }

}
