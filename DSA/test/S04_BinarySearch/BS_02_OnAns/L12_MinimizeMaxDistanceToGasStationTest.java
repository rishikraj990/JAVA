package DSA.test.S04_BinarySearch.BS_02_OnAns;

import static DSA.main.S04_BinarySearch.BS_02_OnAns.L12_MinimizeMaxDistanceToGasStation.minimizeMaxDistanceToGasStation;
import static DSA.test.Utilities.TestUtils.assertEquals;

class L12_MinimizeMaxDistanceToGasStationTest {

    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
    }

    static void testCase1() {
        int[] arr = {1, 2, 3, 4, 5, 6 ,7, 8, 9, 10};
        int k = 10;
        double expected = 0.500000;

        double ans = minimizeMaxDistanceToGasStation(arr, k);
        assertEquals("Test 1: ", expected, ans);
    }

    static void testCase2() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 1;
        double expected = 1.000000;

        double ans = minimizeMaxDistanceToGasStation(arr, k);
        assertEquals("Test 2: ", expected, ans);
    }

    static void testCase3() {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        double expected = 0.500000;

        double ans = minimizeMaxDistanceToGasStation(arr, k);
        assertEquals("Test 3: ", expected, ans);
    }

    static void testCase4() {
        int[] arr = {2, 12};
        int k = 4;
        double expected = 2.000000;

        double ans = minimizeMaxDistanceToGasStation(arr, k);
        assertEquals("Test 4: ", expected, ans);
    }

}
