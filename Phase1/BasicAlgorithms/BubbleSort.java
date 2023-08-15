package Phase1.BasicAlgorithms;

import Utils.IOHandler;
import Utils.Converter;

public class BubbleSort {

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    public static void bubbleSort(int[] arr, int n) {
        boolean allSorted = false;
        while (!allSorted) {
            allSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i, i - 1);
                    allSorted = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arrInp = IOHandler.handleArrayInput(Integer.class);
        int[] arr = Converter.toPrimitive(arrInp);
        bubbleSort(arr, arr.length);
        Integer[] op = Converter.toObject(arr);
        IOHandler.printArray(op);
    }
}
