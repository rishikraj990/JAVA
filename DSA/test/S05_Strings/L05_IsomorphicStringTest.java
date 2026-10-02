package DSA.test.S05_Strings;

import static DSA.main.S05_Strings.L05_IsomorphicString.isomorphicString;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L05_IsomorphicStringTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
    }

    static void testCase1() {
        String str = "egg";
        String ttr = "add";
        Boolean expected = Boolean.TRUE;

        boolean actual = isomorphicString(str, ttr);
        assertEquals("Test 1: ", expected, actual);
    }

    static void testCase2() {
        String str = "f11";
        String ttr = "b23";
        Boolean expected = Boolean.FALSE;

        boolean actual = isomorphicString(str, ttr);
        assertEquals("Test 2: ", expected, actual);
    }

    static void testCase3() {
        String str = "paper";
        String ttr = "title";
        Boolean expected = Boolean.TRUE;

        boolean actual = isomorphicString(str, ttr);
        assertEquals("Test 3: ", expected, actual);
    }

    static void testCase4() {
        String str = "paper";
        String ttr = "tiele";
        Boolean expected = Boolean.FALSE;

        boolean actual = isomorphicString(str, ttr);
        assertEquals("Test 4: ", expected, actual);
    }

}
