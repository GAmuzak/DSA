package Phase1.BasicAlgorithms;

import Utils.IOHandler;
import Utils.PrimitiveObjectConverter;

public class Kadane {
    public static long maxSubarraySum(int[] arr, int n) {
        int maxSum = 0, currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (currSum < 0)
                currSum = 0;
            currSum += arr[i];
            if (currSum > maxSum)
                maxSum = currSum;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Integer[] arrInp = IOHandler.handleArrayInput(Integer.class);
        int[] arr = PrimitiveObjectConverter.convertToPrimitiveArray(arrInp);
        maxSubarraySum(arr, arr.length);
        Integer[] op = PrimitiveObjectConverter.ConvertToObjectArray(arr);
        IOHandler.printArray(op);
    }
}
