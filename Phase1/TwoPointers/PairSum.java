package Phase1.TwoPointers;

import java.util.Scanner;

import Utils.IOHandler;
import Utils.PrimitiveObjectConverter;

public class PairSum {

    public static int pairSum(int arr[], int n, int target) {
        int left = 0, right = n - 1;
        int pairCount = 0, sum = 0;
        while (left < right) {
            sum = arr[left] + arr[right];
            if (sum == target) {
                pairCount++;
                left++;
                right--;
            }
            if (target > sum) {
                right--;
            }
            if (target < sum) {
                left++;
            }
        }
        return pairCount>0?pairCount:-1;
    }

    public static void main(String[] args) {
        Integer[] arr = IOHandler.handleArrayInput(Integer.class);
        int[] arrInts = PrimitiveObjectConverter.convertToPrimitiveArray(arr);
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        sc.close();
        int sol = pairSum(arrInts, arrInts.length, target);
        System.out.println(sol);
    }
}
