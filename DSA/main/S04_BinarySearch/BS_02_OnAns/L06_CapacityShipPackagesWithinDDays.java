package DSA.main.S04_BinarySearch.BS_02_OnAns;

import static DSA.main.Utilities.Utility.findMaxValueInArray;
import static DSA.main.Utilities.Utility.sunOfAllElementsInArray;

public class L06_CapacityShipPackagesWithinDDays {

    /** Problem Statement: A conveyor belt has packages that must be shipped from one port to another within days.
     * The ith package on the conveyor belt has a weight of weights[i].
     * Each day, we load the ship with packages on the conveyor belt (in the order given by weights).
     * We may not load more weight than the maximum weight capacity of the ship.
     * Return the least weight capacity of the ship that will result in all the packages
     * on the conveyor belt being shipped within days.
     */

    public static int capacityShipPackagesWithinDDays(int[] arr, int d) {
//        return brute(arr, d);
        return optimal(arr, d);
    }

    private static int brute(int[] arr, int d) {
//      /**
//       * Brute; TC:[ O(N + (Max-Min+1)*N) ]; SC:[ O(1) ]
//       ====================================
        int min = findMaxValueInArray(arr);
        int max = sunOfAllElementsInArray(arr);
        for (int i=min; i<=max; i++) {
            int days = daysRequired(arr, i);
            if (days <= d) return i;
        }
        return -1;
//       ====================================
//       */
    }

    private static int daysRequired(int[] arr, int i) {
        int day = 1;
        int sum = 0;
        for (int j=0; j<arr.length; j++) {
            sum += arr[j];
            if (sum>i) {
                day++;
                sum = arr[j];
            }
        }
        return day;
    }

    private static int optimal(int[] arr, int d) {
//      /**
//       * Optimal; TC:[ O(N + N*log2(Max-Min+1)) ]; SC:[ O(1) ]
//       ====================================
        int low = findMaxValueInArray(arr);
        int high = sunOfAllElementsInArray(arr);
        while (low<=high) {
            int mid = low + ((high-low)/2);
            if (daysRequired(arr, mid) <= d) high = mid-1;
            else low = mid+1;
        }
        return low;
//       ====================================
//       */
    }

}
