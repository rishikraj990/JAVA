package DSA.test.S05_Strings;

import static DSA.main.S05_Strings.L06_Check1StringIsRotationOf2nd.check1StringIsRotationOf2nd;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L06_Check1StringIsRotationOf2ndTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        String str1 = "abcde";
        String str2 = "cdeab";
        Boolean expected = Boolean.TRUE;

        Boolean actual = check1StringIsRotationOf2nd(str1, str2);
        assertEquals("Test 1: ", expected, actual);
    }

    static void testCase2() {
        String str1 = "abcde";
        String str2 = "abced";
        Boolean expected = Boolean.FALSE;

        Boolean actual = check1StringIsRotationOf2nd(str1, str2);
        assertEquals("Test 2: ", expected, actual);
    }

}
