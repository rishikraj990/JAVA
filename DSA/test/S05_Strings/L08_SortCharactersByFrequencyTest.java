package DSA.test.S05_Strings;

import static DSA.main.S05_Strings.L08_SortCharactersByFrequency.sortCharactersByFrequency;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L08_SortCharactersByFrequencyTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
    }

    static void testCase1() {
        String str = "tree";
        String expected = "eert";

        String actual = sortCharactersByFrequency(str);
        assertEquals("Test 1: ", expected, actual);
    }

    static void testCase2() {
        String str = "cccaaa";
        String expected = "aaaccc";

        String actual = sortCharactersByFrequency(str);
        assertEquals("Test 2: ", expected, actual);
    }

    static void testCase3() {
        String str = "Aabb";
        String expected = "bbAa";

        String actual = sortCharactersByFrequency(str);
        assertEquals("Test 3: ", expected, actual);
    }

}
