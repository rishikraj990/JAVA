package DSA.main.S03_Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class L30_MajorityElement_II {

    /** Problem Statement: Majority Elements(>N/3 times) | Find the elements that appears more than N/3 times in the array
     * Given an integer array nums of size n. Return all elements which appear more than n/3 times in the array.
     * The output can be returned in any order.
     */

    public static List<Integer> majorityElement_II(int[] arr) {
//        return brute(arr);
//        return better(arr);
        return optimal(arr);
    }

    private static List<Integer> brute(int[] arr) {
//      /**
//       * Brute; TC:[ O(N*N) ]; SC:[ O(2) ]
//       ====================================
        List<Integer> al = new ArrayList<>();
        for (int i=0; i<arr.length; i++){
            int c = 0;
            if (al.isEmpty() || al.get(0) != arr[i]){
                for (int j=0; j<arr.length; j++){
                    if (arr[i] == arr[j]){
                        c++;
                    }
                }
                if (c > arr.length/3){
                    al.add(arr[i]);
                }
            }
            if (al.size() == 2){
                return al;
            }
        }
        return al;
//       ====================================
//       */
    }

    private static List<Integer> better(int[] arr) {
//      /**
//       * Better; TC:[ O(N x logN) ]; SC:[ O(N) ]
//       ====================================
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> al = new ArrayList<>();
        int maj = (arr.length/3) + 1;
        for (int i=0; i<arr.length; i++){
            if (hashMap.containsKey(arr[i])){
                int val = hashMap.get(arr[i]) + 1;
                hashMap.put(arr[i], val);
                if(val == maj){
                    al.add(arr[i]);
                }
            } else {
                hashMap.put(arr[i], 1);
            }
        }
        return al;
//       ====================================
//       */
    }

    private static List<Integer> optimal(int[] arr) {
//      /**
//       * Optimal; TC:[ O(2N) ]; SC:[ O(1) ]
//       ====================================
        // Extended Moore's Voting Algo
        int count1 = 0;
        int count2 = 0;
        int ele1 = 0;
        int ele2 = 0;
        for (int i=0; i<arr.length; i++){
            if(count1 == 0 && arr[i] != ele2) {
                count1 = 1;
                ele1 = arr[i];
            } else if (count2 == 0 && arr[i] != ele1) {
                count2 = 1;
                ele2 = arr[i];
            } else if (ele1 == arr[i]) {
                count1++;
            } else if (ele2 == arr[i]) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int i=0; i<arr.length; i++) {
            if (ele1 == arr[i]) {
                count1++;
            }
            if (ele2 == arr[i]) {
                count2++;
            }
        }
        List<Integer> al = new ArrayList<>();
        int maj = (arr.length / 3 ) + 1;
        if(count1 >= maj){
            al.add(ele1);
        }
        if (count2 >= maj && ele2 != ele1) {
            al.add(ele2);
        }
        Collections.sort(al);
        return al;
//       ====================================
//       */
    }

}
