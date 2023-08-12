package Phase1.BasicAlgorithms;

import Utils.IOHandler;
import Utils.PrimitiveObjectConverter;

public class SelectionSort {

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    public static int minIndex(int[] arr, int startIndex) {
        int minVal = Integer.MAX_VALUE;
        int minIdx = startIndex;
        for (int i = startIndex; i < arr.length; i++) {
            if (minVal > arr[i]) {
                minVal = arr[i];
                minIdx = i;
            }
        }
        return minIdx;
    }

    public static void selectionSort(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            int minIdx = minIndex(arr, i);
            if (minIdx == i)
                continue;
            swap(arr, i, minIdx);
        }
    }

    public static void main(String[] args) {
        Integer[] arrInp = IOHandler.handleArrayInput(Integer.class);
        int[] arr = PrimitiveObjectConverter.convertToPrimitiveArray(arrInp);
        selectionSort(arr, arr.length);
        Integer[] op = PrimitiveObjectConverter.ConvertToObjectArray(arr);
        IOHandler.printArray(op);
    }
}
