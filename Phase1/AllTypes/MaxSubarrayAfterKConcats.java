package Phase1.AllTypes;

import java.util.ArrayList;

import Utils.IOHandler;
import Utils.Converter;

public class MaxSubarrayAfterKConcats {

    public static int kadane(ArrayList<Integer> arr) {
        int maxSum = arr.get(0), currSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            currSum = Math.max(currSum + arr.get(i), arr.get(i));
            if (currSum > maxSum)
                maxSum = currSum;
        }
        return maxSum;
    }

    public static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { -3, -2, -1 };
        ArrayList<Integer> arrList = IOHandler.arrayListInit(Converter.toObject(arr));
        long sol = maxSubSumKConcat(arrList, arr.length, 7);
        System.out.println(sol);
    }
}
