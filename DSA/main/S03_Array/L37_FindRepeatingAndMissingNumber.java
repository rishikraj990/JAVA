package DSA.main.S03_Array;

import static DSA.main.Utilities.Utility.createArrayWithDefaultValue;

public class L37_FindRepeatingAndMissingNumber {

    /** Problem Statement: Given an integer array nums of size n containing values from [1, n] and each value
     * appears exactly once in the array, except for A, which appears twice and B which is missing.
     * Return the values A and B, as an array of size 2, where A appears in the 0-th index and B in the 1st index.
     * Note: You are not allowed to modify the original array.
     */

    public static int[] findRepeatingAndMissingNumber(int[] arr) {
//        return brute(arr);
//        return better(arr);
        return optimal_1(arr);
//        return optimal_2(arr); //Not for interview
    }

    private static int[] brute(int[] arr) {
//      /**
//       * Brute; TC:[ O(N^2) ]; SC:[ O(1) ]
//       ====================================
        int[] ans = new int[2];
        for (int i=1; i<=arr.length; i++){
            int c=0;
            for (int j=1; j<= arr.length; j++){
                if (i == arr[j-1]){
                    c++;
                }
            }
            if(c==2) {
                ans[0] = i;
            } else if (c==0) {
                ans[1] = i;
            }
        }
        return ans;
//       ====================================
//       */
    }

    private static int[] better(int[] arr) {
//      /**
//       * Better; TC:[ O(2N) ]; SC:[ O(N) ]
//       ====================================
        int[] temp = createArrayWithDefaultValue(arr.length+1, 0);
        for (int i =0; i< arr.length; i++){
            temp[arr[i]] = temp[arr[i]]+1;
        }
        int[] ans = new int[2];
        for (int i =1; i< temp.length; i++){
            if(temp[i]==2) {
                ans[0] = i;
            } else if (temp[i]==0) {
                ans[1] = i;
            }
        }
        return ans;
//       ====================================
//       */
    }

    private static int[] optimal_1(int[] arr) {
//      /**
//       * Optimal = 1; TC:[ O(N) ]; SC:[ O(1) ]
//       ====================================
        int n=arr.length;
        int sn = (n *(n+1))/2;
        int s2n = (n * (n+1) * ((2*n)+1))/6;
        int s=0;
        int s2=0;
        for (int i=0; i<n; i++){
            s = s + arr[i];
            s2 = s2 + (arr[i]*arr[i]);
        }
        int d = s-sn;
        int d2 = s2-s2n;
        d2 = d2/d;
        int[] ans = new int[2];
        ans[0] = (d+d2)/2;
        ans[1] = ans[0] - d;
        return ans;
//       ====================================
//       */
    }

    private static int[] optimal_2(int[] arr) {      //Not for interview
//      /**
//       * Optimal = 2; TC:[ O(3N) ]; SC:[ O(1) ]
//       ====================================
        int xr = 0;
        for (int i=0; i<arr.length; i++){
            xr ^= arr[i];
            xr ^= i+1;
        }
        int diffBit = 0;
        while ((xr & 1 << diffBit) != 1) {
            diffBit++;
        }
        int zeroClub = 0;
        int oneClub = 0;
        for (int i=0; i<arr.length; i++){
            if ((arr[i] & 1<<diffBit) == 0) {
                zeroClub ^= arr[i];
            } else {
                oneClub ^= arr[i];
            }

            if ((i+1 & 1<<diffBit) == 0) {
                zeroClub ^= i+1;
            } else {
                oneClub ^= i+1;
            }
        }
        int c=0;
        for (int i=0; i<arr.length; i++){
            if (zeroClub == arr[i]){
                c++;
            }
        }
        return c==2 ? new int[]{zeroClub, oneClub} : new int[]{oneClub, zeroClub};
//       ====================================
//       */
    }

}
