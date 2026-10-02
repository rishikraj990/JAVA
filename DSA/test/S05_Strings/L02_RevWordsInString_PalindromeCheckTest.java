package DSA.test.S05_Strings;

import static DSA.main.S05_Strings.L02_RevWordsInString_PalindromeCheck.revWordsInString_PalindromeCheck;
import static DSA.test.Utilities.TestUtils.assertEquals;
import static DSA.test.Utilities.TestUtils.assertEqualsAny;

class L02_RevWordsInString_PalindromeCheckTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
    }

    static void testCase1() {
        String str = "welcome to the jungle";
        String expected = "jungle the to welcome";

        String actual = revWordsInString_PalindromeCheck(str);
        assertEquals("Test 1: ", expected, actual);
    }

    static void testCase2() {
        String str = "amazing coding skills";
        String expected = "skills coding amazing";

        String actual = revWordsInString_PalindromeCheck(str);
        assertEquals("Test 2: ", expected, actual);
    }

    static void testCase3() {
        String str = "   amazing    coding  skills     ";
        String expected1 = "skills coding amazing"; // For Optimal
        String expected2 = "     skills  coding    amazing   "; //  For Brute

        String actual = revWordsInString_PalindromeCheck(str);
        assertEqualsAny("Test 3: ", actual, expected1, expected2);
    }

}
