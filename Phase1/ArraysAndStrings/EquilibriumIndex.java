package Phase1.ArraysAndStrings;

import java.util.Arrays;

import Utils.IOHandler;

public class EquilibriumIndex {

    public static int arraySum(int [] arr){
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }

    public static int arrayEquilibriumIndex(int[] arr){  
		int leftSum = 0;
        int rightSum = 0;
        int[] right = Arrays.copyOfRange(arr, 1, arr.length);
        for (int i = 0; i < arr.length; i++) {
            
            if(i==0){
                leftSum = 0;
                rightSum = arraySum(right);
            }
            else{
                leftSum += arr[i-1];
                rightSum -= arr[i];
            }
            if(leftSum==rightSum) return i;
        }
        return -1;
	}

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        int index = arrayEquilibriumIndex(arr);
        System.out.println(index);
    }
}
