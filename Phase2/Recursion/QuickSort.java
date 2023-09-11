package Phase2.Recursion;

import java.util.*;

import Utils.Converter;
import Utils.IOHandler;

public class QuickSort {

    public static void swap(List<Integer> arr, int i, int j) {
        if (i == j)
            return;
        int temp = arr.get(j);
        arr.set(j, arr.get(i));
        arr.set(i, temp);
    }

    public static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(high);
        int leftWall = low - 1;
        for (int i = low; i < high; i++) {
            if (arr.get(i) < pivot) {
                leftWall++;
                swap(arr, leftWall, i);
            }
        }
        swap(arr, high, leftWall + 1);
        return leftWall + 1;
    }

    public static void quick(List<Integer> arr, int low, int high) {
        if (low < high) {
            int pivotLoc = partition(arr, low, high);
            System.out.println(pivotLoc);
            quick(arr, low, pivotLoc - 1);
            quick(arr, pivotLoc + 1, high);
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
