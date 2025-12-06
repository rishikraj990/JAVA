package DSA.S01_06_BasicHashing;

import java.util.*;

public class L02_CountingFrequenciesArrayElements {

    /**
     * Problem Statement: Given an array, we have found the number of occurrences of each element in the array.
     *
     * Examples
     * Example 1:
     * Input: arr[] = {10,5,10,15,10,5};
     * Output: 10  3
     * 	            5  2
     *                 15  1
     * Explanation: 10 occurs 3 times in the array
     * 	      5 occurs 2 times in the array
     *               15 occurs 1 time in the array
     *
     * Example2:
     * Input: arr[] = {2,2,3,4,4,2};
     * Output: 2  3
     * 	           3  1
     *                4  2
     * Explanation: 2 occurs 3 times in the array
     * 	     3 occurs 1 time in the array
     *              4 occurs 2 time in the array
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> result = countFrequencies(arr);
        for (List<Integer> integers : result) {
            for (Integer integer : integers) {
                System.out.print(integer + ",");
            }
            System.out.print(" ; ");
        }
    }

    public static List<List<Integer>> countFrequencies(int[] nums) {

        HashMap<Integer, Integer> store = new HashMap<>();
        for (int num : nums) {
            if (store.containsKey(num)) store.put(num, store.get(num) + 1);
            else store.put(num, 1);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : store.entrySet()) {
            List<Integer> tempResult = new ArrayList<>();
            tempResult.add(entry.getKey());
            tempResult.add(entry.getValue());
            result.add(tempResult);
        }
        return result;
    }
}
