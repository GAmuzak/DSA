package Phase1.AllTypes;

import java.util.ArrayList;

import Utils.IOHandler;
import Utils.Converter;

public class MaxSubarrayAfterKConcats {

    public static long kadane(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        long maxSum = arr.get(0), currSum = 0;
        for (int i = 0; i < n * k; i++) {
            currSum += arr.get(i % n);
            maxSum = Math.max(maxSum, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {
        long arrSum = 0;
        for (Integer integer : arr) {
            arrSum += integer;
        }
        if (k == 1) {
            return kadane(arr, 1);
        } else if (arrSum < 0) {
            
            return kadane(arr, 2);
        } else {
            
            return kadane(arr, 2) + (k - 2) * arrSum;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3 };
        ArrayList<Integer> arrList = IOHandler.arrayListInit(Converter.toObject(arr));
        long sol = maxSubSumKConcat(arrList, arr.length, 3);
        System.out.println(sol);
    }
}
