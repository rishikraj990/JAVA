package DSA.main.S03_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L32_4Sum {

    /** Problem Statement: Find Quads that add up to a target value.
     * Given an array of N integers, your task is to find unique quads that add up to give a target value.
     * In short, you need to return an array of all the unique quadruplets
     * [arr[a], arr[b], arr[c], arr[d]] such that their sum is equal to a given target.
     * Note: a, b, c and d are also distinct and lies between 0 to n-1 (both inclusive).
     */

    public static List<List<Integer>> fourSum(int[] arr, int t) {
//        return brute(arr, t);
//        return better(arr, t);
        return optimal(arr, t);
    }

    private static List<List<Integer>> brute(int[] arr, int t) {
//      /**
//       * Brute; TC:[ O(N^4) + O(log(No of Unique quad) ]; SC:[ O(No of Unique quad) ]
//       ====================================
        Set<List<Integer>> set = new HashSet<>();
        for (int i=0; i<arr.length-3; i++){
            for (int j=i+1; j<arr.length-2; j++){
                for (int k = j+1; k<arr.length-1; k++){
                    for (int l=k+1; l<arr.length; l++){
                        int sum = arr[i] + arr[j] + arr[k] + arr[l];
                        if (t == sum){
                            List<Integer> temp = new ArrayList<>(List.of(arr[i], arr[j], arr[k], arr[l]));
                            Collections.sort(temp);
                            set.add(temp);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(set);
//       ====================================
//       */
    }

    private static List<List<Integer>> better(int[] arr, int t) {
//      /**
//       * Better; TC:[ O(N^3) + O(log(No of Unique quad)) ]; SC:[ O(N) + O(No of Unique quad) ]
//       ====================================
        Set<List<Integer>> setList = new HashSet<>();
        for (int i=0; i<arr.length-2; i++){
            for (int j=i+1; j<arr.length-1; j++){
                Set<Integer> set = new HashSet<>();
                for (int k = j+1; k<arr.length; k++){
                    int find = t - (arr[i] + arr[j] + arr[k]);
                    if (set.contains(find)) {
                        List<Integer> temp = new ArrayList<>(List.of(arr[i], arr[j], arr[k], find));
                        Collections.sort(temp);
                        setList.add(temp);
                    }
                    set.add(arr[k]);
                }
            }
        }
        return new ArrayList<>(setList);
//       ====================================
//       */
    }

    private static List<List<Integer>> optimal(int[] arr, int t) {
//      /**
//       * Optimal; TC:[ O(N^3) +O(NlogN) ]; SC:[ O(1) ]
//       ====================================
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        for (int i=0; i<arr.length-2; i++){
            if (i != 0 && arr[i-1]==arr[i]) continue;
            for (int j=i+1; j<arr.length-1; j++){
                if (j != i+1 && arr[j-1]==arr[j]) continue;
                int k = j+1;
                int l = arr.length-1;
                while (k < l) {
                    long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];
                    if (sum > t) {
                        l--;
                    } else if (sum < t) {
                        k++;
                    } else {
                        List<Integer> temp = new ArrayList<>(List.of(arr[i], arr[j], arr[k], arr[l]));
                        list.add(temp);
                        k++;
                        l--;
                        while (k < l && arr[k-1]==arr[k]) k++;
                        while (k < l && arr[l]==arr[l+1]) l--;
                    }
                }
            }
        }
        return list;
//       ====================================
//       */
    }

}
