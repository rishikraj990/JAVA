package DSA.test.S05_Strings;

import static DSA.main.S05_Strings.L07_Check2StringsAreAnagram.check2StringsAreAnagram;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L07_Check2StringsAreAnagramTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        String str1 = "anagram";
        String str2 = "nagaram";
        Boolean expected = Boolean.TRUE;

        Boolean actual = check2StringsAreAnagram(str1, str2);
        assertEquals("Test 1: ", expected, actual);
    }

    static void testCase2() {
        String str1 = "rat";
        String str2 = "car";
        Boolean expected = Boolean.FALSE;

        Boolean actual = check2StringsAreAnagram(str1, str2);
        assertEquals("Test 2: ", expected, actual);
    }

}
