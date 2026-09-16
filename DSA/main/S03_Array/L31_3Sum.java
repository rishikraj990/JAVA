package DSA.main.S03_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class L31_3Sum {

    /** Problem Statement: Find triplets that add up to a zero
     * Given an array of N integers, your task is to find unique triplets that add up to give a sum of zero.
     * In short, you need to return an array of all the unique triplets [arr[a], arr[b], arr[c]]
     * such that i!=j, j!=k, k!=i, and their sum is equal to zero.
     */

    public static List<List<Integer>> threeSum(int[] arr) {
//        return brute(arr);
//        return better(arr);
        return optimal(arr);
    }

    private static List<List<Integer>> brute(int[] arr) {
//      /**
//       * Brute; TC:[ O(N^3) + O(log(No of Unique triplet)) ]; SC:[ O(No of Unique triplet) ]
//       ====================================
        Set<List<Integer>> set = new HashSet<>();
        for (int i=0; i<arr.length-2; i++){
            for (int j=i+1; j<arr.length-1; j++){
                for (int k=j+1; k<arr.length; k++){
                    if (0 == arr[i] + arr[j] + arr[k]){
                        List<Integer> temp = new LinkedList<>(List.of(arr[i], arr[j], arr[k]));
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(set);
//       ====================================
//       */
    }

    private static List<List<Integer>> better(int[] arr) {
//      /**
//       * Better; TC:[ O(N^2) + O(log(No of Unique triplet)) ]; SC:[ O(N) + O(No of Unique triplet) ]
//       ====================================
        Set<List<Integer>> setList = new HashSet<>();
        for (int i=0; i<arr.length-1; i++){
            Set<Integer> set = new HashSet<>();
            for (int j=i+1; j<arr.length; j++){
                int find = -(arr[i]+arr[j]);
                if (set.contains(find)){
                    List<Integer> temp = new ArrayList<>(List.of(arr[i], arr[j],find));
                    Collections.sort(temp);
                    setList.add(temp);
                }
                set.add(arr[j]);
            }
        }
        return new ArrayList<>(setList);
//       ====================================
//       */
    }

    private static List<List<Integer>> optimal(int[] arr) {
//      /**
//       * Optimal; TC:[ O(N^2) +O(NlogN) ]; SC:[ O(1) ]
//       ====================================
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for (int i=0; i<arr.length-2; i++){
            if (i > 0 && arr[i-1] == arr[i]) continue;
            int j = i+1;
            int k = arr.length-1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if(sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    List<Integer> temp = new ArrayList<>(List.of(arr[i], arr[j], arr[k]));
                    ans.add(temp);
                    j++;
                    k--;
                    while (j < k && arr[j-1] == arr[j]) j++;
                    while (j < k && arr[k] == arr[k+1]) k--;
                }
            }
        }
        return ans;
//       ====================================
//       */
    }

}
