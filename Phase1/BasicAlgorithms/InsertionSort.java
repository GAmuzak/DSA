package Phase1.BasicAlgorithms;

import Utils.IOHandler;
import Utils.Converter;

public class InsertionSort {

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    public static void insertionSort(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arrInp = IOHandler.handleArrayInput(Integer.class);
        int[] arr = Converter.toPrimitive(arrInp);
        insertionSort(arr.length, arr);
        Integer[] op = Converter.toObject(arr);
        IOHandler.printArray(op);
    }
}
