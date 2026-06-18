package DSA.S01_Basic.S01_06_BasicHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class L03_FindHigt_lowtFreqElm {
    /**
     * Problem Statement: Problem Statement: Given an array of size N. Find the highest and lowest frequency element.
     *
     * Example 1:
     * Input: array[] = {10,5,10,15,10,5};
     * Output: 10 15
     * Explanation: The frequency of 10 is 3, i.e. the highest and the frequency of 15 is 1 i.e. the lowest.
     *
     * Example 2:
     * Input: array[] = {2,2,3,4,4,2};
     * Output: 2 3
     * Explanation: The frequency of 2 is 3, i.e. the highest and the frequency of 3 is 1 i.e. the lowest.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> store = preStoreHash(arr);
        System.out.println(mostFrequentElement(store));
        System.out.println(leastFrequentElement(store));
    }
//      /**
//       * Optimal; TC:[ O(3N) ]; SC:[ O(N) ]
//       ====================================
    public static int mostFrequentElement(HashMap<Integer, Integer> store) {
        int max = Integer.MIN_VALUE;
        int res = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> keyValue : store.entrySet()){
            if(max < keyValue.getValue()){
                res = keyValue.getKey();
                max = keyValue.getValue();
            }
        }
        return res;
    }

    public static int leastFrequentElement(HashMap<Integer, Integer> store) {
        int min = Integer.MAX_VALUE;
        int res = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> keyValue : store.entrySet()){
            if(min > keyValue.getValue()){
                res = keyValue.getKey();
                min = keyValue.getValue();
            }
        }
        return res;
    }

    private static HashMap<Integer, Integer> preStoreHash(int[] nums) {
        HashMap<Integer, Integer> store = new HashMap<>();
        for (int num : nums) {
            if (store.containsKey(num)) store.put(num, store.get(num) + 1);
            else store.put(num, 1);
        }
        return store;
    }
//       ====================================
//       */
}
