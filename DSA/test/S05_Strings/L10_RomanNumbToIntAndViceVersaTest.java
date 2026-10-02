package DSA.test.S05_Strings;

import static DSA.main.S05_Strings.L10_RomanNumbToIntAndViceVersa.romanNumbToIntAndViceVersa;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L10_RomanNumbToIntAndViceVersaTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
    }

    static void testCase1() {
        String str = "III"; //3
        String expected = "III";

        String actual = romanNumbToIntAndViceVersa(str);
        assertEquals("Test 1: ", expected, actual);
    }

    static void testCase2() {
        String str = "XLII"; //42
        String expected = "XLII";

        String actual = romanNumbToIntAndViceVersa(str);
        assertEquals("Test 2: ", expected, actual);
    }

    static void testCase3() {
        String str = "LVIII"; //58
        String expected = "LVIII";

        String actual = romanNumbToIntAndViceVersa(str);
        assertEquals("Test 3: ", expected, actual);
    }

    static void testCase4() {
        String str = "MCMXCIV"; //1994
        String expected = "MCMXCIV";

        String actual = romanNumbToIntAndViceVersa(str);
        assertEquals("Test 4: ", expected, actual);
    }

}
