package DSA.main.S03_Array;

import static DSA.main.Utilities.Utility.printInt;

public class L20_StockBuyAndSell {

    /** Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day.
     * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day
     * in the future to sell that stock. Return the maximum profit you can achieve from this transaction.
     * If you cannot achieve any profit, return 0.
     */

    public static void main(String[] args) {
//        int n = readInt();
//        int[] arr = readArray(n);
        int n = 6;
        int[] arr = {7,1,5,3,6,4} ;

        printInt(findBestBuySell(arr));
    }

    private static int findBestBuySell(int[] arr) {

//      /**
//       * Brute; TC:[ O(N^2) ]; SC:[ O(1) ]
//       ====================================
//        int max = 0;
//        for (int i=0; i<arr.length; i++){
//            for (int j=i; j<arr.length; j++){
//                int profit = arr[j] - arr[i];
//                max = Math.max(max, profit);
//            }
//        }
//        return max;
//       ====================================
//       */

//      /**
//       * Optimal; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        int mini = arr[0];
        int max = 0;
        for (int i=0; i< arr.length; i++){
            int cost = arr[i] - mini;
            max = Math.max(max, cost);
            mini = Math.min(mini, arr[i]);
        }
        return max;
//       ====================================
//       */
    }

}
