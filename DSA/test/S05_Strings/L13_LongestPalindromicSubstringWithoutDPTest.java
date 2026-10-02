package DSA.test.S05_Strings;

import static DSA.main.S05_Strings.L13_LongestPalindromicSubstringWithoutDP.longestPalindromicSubstringWithoutDP;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L13_LongestPalindromicSubstringWithoutDPTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
    }

    static void testCase1() {
        String str = "babad";
        String expected = "bab";

        String actual = longestPalindromicSubstringWithoutDP(str);
        assertEquals("Test 1: ", expected, actual);
    }

    static void testCase2() {
        String str = "cbbd";
        String expected = "bb";

        String actual = longestPalindromicSubstringWithoutDP(str);
        assertEquals("Test 2: ", expected, actual);
    }

    static void testCase3() {
        String str = "a12321b";
        String expected = "12321";

        String actual = longestPalindromicSubstringWithoutDP(str);
        assertEquals("Test 3: ", expected, actual);
    }

}
