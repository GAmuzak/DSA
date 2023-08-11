package Phase1.TwoPointers;

import Utils.IOHandler;
import Utils.PrimitiveObjectConverter;

public class PairSum {

    public static int pairSum(int arr[], int n, int target) {
        int i=0;
        int j=n-1;
        int count=0;
        while (i<j) {
            int sum = arr[i]+arr[j];
            if (sum < target)
                i++;
            else if (sum > target) 
                j--;
            else{
                count++;
                i++;
                j--;
            }
        }
        if(count == 0)
        count = -1;
        return count;
    }

    public static void main(String[] args) {
        Integer[] arr = IOHandler.handleArrayInput(Integer.class);
        int[] arrInts = PrimitiveObjectConverter.convertToPrimitiveArray(arr);
        int sol = pairSum(arrInts, arrInts.length, 12);
        System.out.println(sol);
    }
}
