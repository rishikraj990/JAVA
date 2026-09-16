package DSA.main.S03_Array;

import java.util.HashMap;
import java.util.Map;

public class L34_CountSubarraysWithGivenXorK {

    /** Problem Statement: Given an array of integers A and an integer B.
     * Find the total number of subarrays having bitwise XOR of all elements equal to k.
     */

    public static int countSubarraysWithGivenXorK(int[] arr, int k) {
//        return brute(arr, k);
        return optimal(arr, k);
    }

    private static int brute(int[] arr, int k) {
//      /**
//       * Brute; TC:[ O(N^2) ]; SC:[ O(1) ]
//       ====================================
        int c=0;
        for (int i=0; i<arr.length; i++) {
            int xor = 0;
            for (int j=i; j<arr.length; j++) {
                xor ^= arr[j];
                if (xor == k) {
                    c++;
                }
            }
        }
        return c;
//       ====================================
//       */
    }

    private static int optimal(int[] arr, int k) {
//      /**
//       * Optimal; TC:[ O(N logN) ]; SC:[ O(N) ]
//       ====================================
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int c=0;
        int xor = 0;
        for (int i=0; i<arr.length; i++){
            xor ^= arr[i];
            int find = xor ^ k;
            c += map.getOrDefault(find, 0);
            map.put(xor, map.getOrDefault(xor, 0)+1);
        }
        return c;
//       ====================================
//       */
    }

}
