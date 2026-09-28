package DSA.main.S04_BinarySearch.BS_02_OnAns;

import static DSA.main.Utilities.Utility.findMaxValueInArray;

public class L03_KokoEatingBananas {

    /** Problem Statement: A monkey Koko is given ‘n’ piles of bananas, whereas the 'ith' pile has ‘a[i]’ bananas.
     * An integer ‘h’ is also given, which denotes the time (in hours) for all the bananas to be eaten.
     * Each hour, the monkey chooses a non-empty pile of bananas and eats ‘k’ bananas.
     * If the pile contains less than ‘k’ bananas, then the monkey consumes all the bananas
     * and won’t eat any more bananas in that hour.
     * Find the minimum number of bananas ‘k’ to eat per hour so that the monkey
     * can eat all the bananas within ‘h’ hours.
     */

    public static int kokoEatingBananas(int[] arr, int h) {
//        return brute(arr, h);
        return optimal(arr, h);
    }

    private static int brute(int[] arr, int h) {
//      /**
//       * Brute; TC:[ O(N + MaxVal*N) ]; SC:[ O(1) ]
//       ====================================
        int maxVal = findMaxValueInArray(arr);
        for (int i=1; i<=maxVal; i++) {
            int timeToConsume = timeToConsumeAtRateI(arr, i);
            if (h >= timeToConsume) return i;
        }
        return -1;
//       ====================================
//       */
    }

    private static int timeToConsumeAtRateI(int[] arr, int r) {
        int ans = 0;
        for (int i=0; i<arr.length; i++) {
            ans += (int) Math.ceil( (double) arr[i]/ (double) r);
        }
        return ans;
    }

    private static int optimal(int[] arr, int h) {
//      /**
//       * Optimal; TC:[ O(N + N*log2(MaxVal)) ]; SC:[ O(1) ]
//       ====================================
        int low = 1;
        int high = findMaxValueInArray(arr);
        while (low<=high) {
            int mid = low + ((high-low)/2);
            int timeToConsume = timeToConsumeAtRateI(arr, mid);
            if (timeToConsume <= h) high = mid-1;
            else low = mid+1;
        }
        return low;
//       ====================================
//       */
    }

}
