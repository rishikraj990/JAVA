package DSA.main.S04_BinarySearch.BS_02_OnAns;

import java.util.PriorityQueue;

import static DSA.main.Utilities.Utility.createArrayWithDefaultValue;

public class L12_MinimizeMaxDistanceToGasStation {

    /** Problem Statement: Given a sorted array arr of size n, containing integer positions of n gas stations
     * on the X-axis, and an integer k, place k new gas stations on the X-axis.
     * The new gas stations can be placed anywhere on the non-negative side
     * of the X-axis, including non-integer positions.
     * Let dist be the maximum distance between adjacent gas stations after adding the k new gas stations.
     * Find the minimum value of dist. Your answer will be accepted if it is within 1e-6 of the true value.
     */

    public static double minimizeMaxDistanceToGasStation(int[] arr, int k) {
        double module = 1e-6;
//        return brute(arr, k, module);
//        return better(arr, k, module);
        return optimal(arr, k, module);
    }

    private static double brute(int[] arr, int k, double module) {
//      /**
//       * Brute; TC:[ O(K*(N-1)) + O(N-1) ]; SC:[ O(N-1) ]
//       ====================================
        int[] howManyInBetween = createArrayWithDefaultValue(arr.length-1, 0);
        for (int i=1; i<=k; i++) {
            double maxSector = -1;
            int maxInd = -1;
            for (int j=0; j<arr.length-1; j++){
                double diff = arr[j+1]-arr[j];
                double sectorLength = diff/(howManyInBetween[j]+1);
                if (sectorLength > maxSector) {
                    maxSector = sectorLength;
                    maxInd = j;
                }
            }
            howManyInBetween[maxInd]++;
        }
        double maxAns = -1;
        for (int i=0; i<arr.length-1; i++) {
            double diff = arr[i+1]-arr[i];
            double sectorLength = diff/(howManyInBetween[i]+1);
            maxAns = Math.max(maxAns, sectorLength);
        }
        return Math.round(maxAns / module) * module;
//       ====================================
//       */
    }

    static class Pair {
        double distance;
        int index;
        Pair(double distance, int index) {
            this.distance = distance;
            this.index = index;
        }
    }

    private static double better(int[] arr, int k, double module) {
//      /**
//       * Better; TC:[ O(N-1*log2(N-1)) + O(K*log2(K)) ]; SC:[ O(2*(N-1)) ]
//       ====================================
        int[] howManyInBetween = createArrayWithDefaultValue(arr.length-1, 0);
        PriorityQueue<Pair> maxHeapPQ = new PriorityQueue<>((a, b) -> Double.compare(b.distance, a.distance));
        for (int i=0; i<arr.length-1; i++) {
            maxHeapPQ.add(new Pair(arr[i+1] - arr[i], i));
        }
        for (int i=1; i<=k; i++) {
            Pair pair = maxHeapPQ.poll();
            int secIndex = pair.index;
            howManyInBetween[secIndex]++;
            double diff = arr[secIndex + 1] - arr[secIndex];
            double sectorLength = diff/(howManyInBetween[secIndex]+1);
            maxHeapPQ.add(new Pair(sectorLength, secIndex));
        }
        double ans = maxHeapPQ.peek().distance;
        return Math.round(ans / module) * module;
//       ====================================
//       */
    }

    private static double optimal(int[] arr, int k, double module) {
//      /**
//       * Optimal; TC:[ O((N-1) + N-1*(log2(MaxDist))) ]; SC:[ O(1) ]
//       ====================================
        double low = 0;
        double high = 0;
        for (int i=0; i<arr.length-1; i++) {
            high = Math.max(high, (double) arr[i+1]-arr[i]);
        }
        while (high-low > module) {
            double mid = low + ((high-low)/2);
            int cnt = noOfGasStationRequired(arr, mid);
            if (cnt > k) low = mid;
            else high = mid;
        }
        return Math.floor(high / module) * module;
//       ====================================
//       */
    }

    private static int noOfGasStationRequired(int[] arr, double mid) {
        int cnt = 0;
        for (int i=0; i<arr.length-1; i++) {
            int numbInBetween = (int) ((arr[i+1]-arr[i]) / mid);
            if (((arr[i+1]-arr[i]) / mid) == numbInBetween * mid) numbInBetween--;
            cnt += numbInBetween;
        }
        return cnt;
    }

}
