package DSA.test.S05_Strings;

import static DSA.main.S05_Strings.L03_LargestOddNumbInString.largestOddNumbInString;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L03_LargestOddNumbInStringTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
    }

    static void testCase1() {
        String str = "52";
        String expected = "5";

        String actual = largestOddNumbInString(str);
        assertEquals("Test 1: ", expected, actual);
    }

    static void testCase2() {
        String str = "4206";
        String expected = "";

        String actual = largestOddNumbInString(str);
        assertEquals("Test 2: ", expected, actual);
    }

    static void testCase3() {
        String str = "35427";
        String expected = "35427";

        String actual = largestOddNumbInString(str);
        assertEquals("Test 3: ", expected, actual);
    }

}
