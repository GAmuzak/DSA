package Phase1.TwoPointers;

import Utils.IOHandler;
import Utils.Converter;

public class NegPosSeparation {

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    public static int[] separateNegativeAndPositive(int a[]) {
        int left = 0, right = a.length - 1;
        while (left < right) {
            if (a[left] < 0) {
                // already negative
                left++;
            } else if (a[right] >= 0) {
                // already positive
                right--;
            } else {
                swap(a, left, right);
                left++;
                right--;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Integer[] arrInp = IOHandler.handleArrayInput(Integer.class);
        int arr[] = Converter.toPrimitive(arrInp);
        int[] newArr = separateNegativeAndPositive(arr);
        Integer[] sol = Converter.toObject(newArr);
        IOHandler.printArray(sol);
    }

}
