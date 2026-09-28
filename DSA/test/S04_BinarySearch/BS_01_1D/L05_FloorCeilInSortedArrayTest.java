package DSA.test.S04_BinarySearch.BS_01_1D;

import static DSA.main.S04_BinarySearch.BS_01_1D.L05_FloorCeilInSortedArray.floorCeilInSortedArray;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L05_FloorCeilInSortedArrayTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int x = 5;
        int[] expected = {4, 7};

        int[] ans = floorCeilInSortedArray(arr, x);
        assertEquals("Test 1: ", expected, ans);
    }

    static void testCase2() {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int x = 8;
        int[] expected = {8, 8};

        int[] ans = floorCeilInSortedArray(arr, x);
        assertEquals("Test 2: ", expected, ans);
    }

}
