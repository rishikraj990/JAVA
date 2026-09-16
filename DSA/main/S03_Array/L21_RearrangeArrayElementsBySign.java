package DSA.main.S03_Array;

import static DSA.main.Utilities.Utility.printArray;

public class L21_RearrangeArrayElementsBySign {

    /** Problem Statement: There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements.
     * Without altering the relative order of positive and negative elements,
     * you must return an array of alternately positive and negative values.
     */

    public static void main(String[] args) {
//        int n = readInt();
//        int[] arr = readArray(n);
        int n = 6;
        int[] arr = {1,2,-4,-5, -6, -8, 3, 4, 5, 6,7} ;

        printArray(rearrangeBySign(arr));
    }

    private static int[] rearrangeBySign(int[] arr) {

//      /**
//       * Brute; TC:[ O(N + N/2) ]; SC:[ O(N) ]    // Brute   when + ans - are   same    number
//       * Optimal; TC:[ O(2N) ]; SC:[ O(N) ]       // Optimal when + ans - are different number
//       ====================================
        int p=0;
        int n=0;
        for (int i=0; i<arr.length; i++){   // this for-loop is just to figure out the number of + and -,
            if(arr[i] > 0){                 // if list is used, then this is not required.
                p++;
            } else {
                n++;
            }
        }
        int[] pos = new int[p];
        int[] neg = new int[n];

        int posI = 0;
        int negI = 0;
        for (int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                pos[posI] = arr[i];
                posI++;
            } else {
                neg[negI] = arr[i];
                negI++;
            }
        }
        for (int i=0; i<Math.min(p,n); i++){
            arr[2 * i] = pos[i];
            arr[(2 * i) + 1] = neg[i];
        }
        if (p>n){
            int temp = 2*n;
            for (int i=n; i<p; i++){
                arr[temp] = pos[i];
                temp++;
            }
        } else {
            int temp = 2*p;
            for (int i=p; i<n; i++){
                arr[temp] = neg[i];
                temp++;
            }
        }

        return arr;
//       ====================================
//       */

//      /**
//       * Optimal; TC:[ O(N) ]; SC:[ O(N) ]   // Optimal only when + ans - are same number
//       ====================================
//        int[] ans = new int[arr.length];
//        int posP = 0;
//        int negP = 1;
//        for (int i=0; i< arr.length; i++){
//            if(arr[i] > 0){
//                ans[posP] = arr[i];
//                posP += 2;
//            } else {
//                ans[negP] = arr[i];
//                negP += 2;
//            }
//        }
//        return ans;
//       ====================================
//       */
    }

}
