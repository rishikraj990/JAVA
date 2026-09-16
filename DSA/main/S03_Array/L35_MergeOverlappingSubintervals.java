package DSA.main.S03_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static DSA.main.Utilities.Utility.convertListToArray;

public class L35_MergeOverlappingSubintervals {

    /** Problem Statement: Given an array of intervals where intervals[i] = [starti, endi],
     * merge all overlapping intervals and return an array of the non-overlapping intervals
     * that cover all the intervals in the input.
     */

    public static int[][] mergeOverlappingSubintervals(int[][] arr) {
//        return brute(arr);
        return optimal(arr);
    }

    private static int[][] brute(int[][] arr) {
//      /**
//       * Brute; TC:[ O(logN) + O(N^2) ]; SC:[ O(N) ]
//       ====================================
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        List<List<Integer>> list = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            int start = arr[i][0];
            int end = arr[i][1];
            if (!list.isEmpty() && (list.get(list.size()-1).get(1) >= start)) continue;
            List<Integer> temp = new ArrayList<>(List.of(start, end));
            for (int j=i+1; j<arr.length; j++) {
                start = arr[j][0];
                end = arr[j][1];
                if (start <= temp.get(1)) {
                    temp.set(1, Math.max(temp.get(1), end));
                } else  {
                    break;
                }
            }
            list.add(temp);
        }
        return convertListToArray(list);
//       ====================================
//       */
    }

    private static int[][] optimal(int[][] arr) {
//      /**
//       * Optimal; TC:[ O(logN) + O(N) ]; SC:[ O(1) ]
//       ====================================
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> list = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            if (list.isEmpty() || arr[i][0] > list.get(list.size()-1).get(1)) {
                list.add(new ArrayList<>(List.of(arr[i][0], arr[i][1])));
            } else {
                list.get(list.size()-1).set(1, Math.max(list.get(list.size()-1).get(1), arr[i][1]));
            }
        }
        return convertListToArray(list);
//       ====================================
//       */
    }


}
