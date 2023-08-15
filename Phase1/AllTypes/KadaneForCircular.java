package Phase1.AllTypes;

public class KadaneForCircular {

    public static int kadane(int[] arr) {
        int maxSum = arr[0], currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum = Math.max(currSum + arr[i], arr[i]);
            if (currSum > maxSum)
                maxSum = currSum;
        }
        return maxSum;
    }

    public static int maxSubarraySum(int[] arr, int n) {
        int totalSum = 0;
        for (int i : arr) {
            totalSum += i;
        }
        int kReg = kadane(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= -1;
        }
        int kInv = kadane(arr);
        kInv = totalSum - (kInv * -1);
        if (kInv == 0)
            kInv = totalSum;
        return kReg > kInv ? kReg : kInv;
    }

    public static void main(String[] args) {
        int[] arr = { -3, -2, -1 };
        int sol = maxSubarraySum(arr, arr.length);
        System.out.println(sol);
    }
}
