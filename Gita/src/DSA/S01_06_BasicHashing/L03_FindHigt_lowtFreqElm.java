package DSA.S01_06_BasicHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class L03_FindHigt_lowtFreqElm {
    /**
     * Problem Statement: Problem Statement: Given an array of size N. Find the highest and lowest frequency element.
     *
     * Examples
     * Example 1:
     * Input: array[] = {10,5,10,15,10,5};
     * Output: 10 15
     * Explanation: The frequency of 10 is 3, i.e. the highest and the frequency of 15 is 1 i.e. the lowest.
     *
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
        System.out.println(mostFrequentElement(arr));
        System.out.println(leastFrequentElement(arr));
    }
    public static int mostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> store = preStoreHash(nums);
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> keyValue : store.entrySet()){
            max = max < keyValue.getKey() ? keyValue.getKey() : max;
        }
        return max;
    }

    public static int leastFrequentElement(int[] nums) {
        HashMap<Integer, Integer> store = preStoreHash(nums);
        int min = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> keyValue : store.entrySet()){
            min = min > keyValue.getKey() ? keyValue.getKey() : min;
        }
        return min;
    }

    private static HashMap<Integer, Integer> preStoreHash(int[] nums) {
        HashMap<Integer, Integer> store = new HashMap<>();
        for (int num : nums) {
            if (store.containsKey(num)) store.put(num, store.get(num) + 1);
            else store.put(num, 1);
        }
        return store;
    }

}
