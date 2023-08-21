package Phase2.Recursion;

import java.util.*;

import Utils.Converter;
import Utils.IOHandler;

public class QuickSort {

    public static void swap(List<Integer> arr, int i, int j) {
        if (i == j)
            return;
        arr.set(i, arr.get(i) + arr.get(j));
        arr.set(j, arr.get(i) - arr.get(j));
        arr.set(i, arr.get(i) - arr.get(j));
    }

    public static int partition(List<Integer> a, int start, int end) {
        int pivot = a.get(end);
        int i = (start - 1);
        for (int j = start; j <= end - 1; j++) {
            if (a.get(j) < pivot) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, end);
        return (i + 1);
    }

    public static void quick(List<Integer> a, int start, int end) {
        if (start < end) {
            int p = partition(a, start, end);
            quick(a, start, p - 1);
            quick(a, p + 1, end);
        }
    }

    public static List<Integer> quickSort(List<Integer> arr) {
        quick(arr, 0, arr.size() - 1);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 9, 7, 4, 3, 8, 12, 11 };
        ArrayList<Integer> arrInp = IOHandler.arrayListInit(Converter.toObject(arr));
        quickSort(arrInp);
        IOHandler.printArrayList(arrInp);
    }
}
