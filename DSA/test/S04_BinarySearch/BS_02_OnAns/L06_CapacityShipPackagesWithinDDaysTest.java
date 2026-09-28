package DSA.test.S04_BinarySearch.BS_02_OnAns;

import static DSA.main.S04_BinarySearch.BS_02_OnAns.L06_CapacityShipPackagesWithinDDays.capacityShipPackagesWithinDDays;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L06_CapacityShipPackagesWithinDDaysTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    static void testCase1() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int d = 5;
        int expected = 15;

        int ans = capacityShipPackagesWithinDDays(arr, d);
        assertEquals("Test 1: ", expected, ans);
    }

    static void testCase2() {
        int[] arr = {3, 2, 2, 4, 1, 4};
        int d = 3;
        int expected = 6;

        int ans = capacityShipPackagesWithinDDays(arr, d);
        assertEquals("Test 2: ", expected, ans);
    }

}
