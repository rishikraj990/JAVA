package DSA.test.S05_Strings;

import static DSA.main.S05_Strings.L14_SumOfBeautyOfAllSubstring.sumOfBeautyOfAllSubstring;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L14_SumOfBeautyOfAllSubstringTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
    }

    static void testCase1() {
        String str = "xyx";
        int expected = 1;

        int actual = sumOfBeautyOfAllSubstring(str);
        assertEquals("Test 1: ", expected, actual);
    }

    static void testCase2() {
        String str = "aabcbaa";
        int expected = 17;

        int actual = sumOfBeautyOfAllSubstring(str);
        assertEquals("Test 2: ", expected, actual);
    }

    static void testCase3() {
        String str = "zzzz";
        int expected = 0;

        int actual = sumOfBeautyOfAllSubstring(str);
        assertEquals("Test 3: ", expected, actual);
    }

}
