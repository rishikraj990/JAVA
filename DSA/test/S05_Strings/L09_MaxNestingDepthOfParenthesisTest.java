package DSA.test.S05_Strings;

import static DSA.main.S05_Strings.L09_MaxNestingDepthOfParenthesis.maxNestingDepthOfParenthesis;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L09_MaxNestingDepthOfParenthesisTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
    }

    static void testCase1() {
        String str = "(1+(2*3)+((8)/4))+1";
        int expected = 3;

        int actual = maxNestingDepthOfParenthesis(str);
        assertEquals("Test 1: ", expected, actual);
    }

    static void testCase2() {
        String str = "(1)+((2))+(((3)))";
        int expected = 3;

        int actual = maxNestingDepthOfParenthesis(str);
        assertEquals("Test 2: ", expected, actual);
    }

    static void testCase3() {
        String str = "()(())((()()))";
        int expected = 3;

        int actual = maxNestingDepthOfParenthesis(str);
        assertEquals("Test 3: ", expected, actual);
    }

}
