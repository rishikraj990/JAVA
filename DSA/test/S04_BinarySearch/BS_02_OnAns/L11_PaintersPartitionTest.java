package DSA.test.S04_BinarySearch.BS_02_OnAns;

import static DSA.main.S04_BinarySearch.BS_02_OnAns.L11_PaintersPartition.paintersPartition;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L11_PaintersPartitionTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        int[] arr = {1, 10};
        int a = 2;
        int b = 5;
        int expected = 50;

        int ans = paintersPartition(arr, a, b);
        assertEquals("Test 1: ", expected, ans);
    }

    static void testCase2() {
        int[] arr = {1, 8, 11, 3};
        int a = 10;
        int b = 1;
        int expected = 11;

        int ans = paintersPartition(arr, a, b);
        assertEquals("Test 2: ", expected, ans);
    }

}
