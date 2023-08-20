package Phase2.Recursion;

import Utils.Converter;
import Utils.IOHandler;

public class MergeSort {

    public static int[] merge(int[] left, int[] right) {
        int[] combined = new int[left.length + right.length];
        int leftCtr = 0, rightCtr = 0, mainCtr = 0;
        while (leftCtr < left.length && rightCtr < right.length) {
            if (left[leftCtr] < right[rightCtr]) {
                combined[mainCtr] = left[leftCtr];
                leftCtr++;
            } else {
                combined[mainCtr] = right[rightCtr];
                rightCtr++;
            }
            mainCtr++;
        }
        while (leftCtr < left.length) {
            combined[mainCtr] = left[leftCtr];
            mainCtr++;
            leftCtr++;
        }
        while (rightCtr < right.length) {
            combined[mainCtr] = right[rightCtr];
            mainCtr++;
            rightCtr++;
        }
        return combined;
    }

    public static int[] split(int[] arr, int n) {
        if (n == 1) {
            return arr;
        }
        int leftLength = n / 2;
        int[] left = new int[leftLength];
        int rightLength = n - leftLength;
        int[] right = new int[rightLength];
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = arr[leftLength + i];
        }
        left = split(left, leftLength);
        right = split(right, rightLength);
        return merge(left, right);
    }

    public static void mergeSort(int[] arr, int n) {
        int[] sol = split(arr, n);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sol[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 9, 7, 4, 3, 8, 12, 11 };
        mergeSort(arr, arr.length);
        IOHandler.printArray(Converter.toObject(arr));
    }
}
