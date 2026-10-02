package DSA.test.S05_Strings;

import static DSA.main.S05_Strings.L01_RemoveOutermostParentheses.removeOutermostParentheses;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L01_RemoveOutermostParenthesesTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        String str = "((()))";
        String expected = "(())";

        String actual = removeOutermostParentheses(str);
        assertEquals("Test 1: ", expected, actual);
    }

    static void testCase2() {
        String str = "()(()())(())";
        String expected = "()()()";

        String actual = removeOutermostParentheses(str);
        assertEquals("Test 2: ", expected, actual);
    }

}
