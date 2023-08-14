package Phase1.AllTypes;

import Utils.IOHandler;
import Utils.PrimitiveObjectConverter;

public class CountingSort {

    public static int getMinIndex(int arr[]) {
        int minVal = Integer.MAX_VALUE;
        int minIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
                minIdx = i;
            }
        }
        return minIdx;
    }

    public static int getMaxIndex(int arr[]) {
        int maxVal = Integer.MIN_VALUE;
        int maxIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    public static int[] sort(int n, int arr[]) {
        int[] finalArray = new int[n];
        int smallest = arr[getMinIndex(arr)];
        int biggest = arr[getMaxIndex(arr)];
        int[] counter = new int[biggest - smallest + 1];
        for (int i : arr) {
            counter[i - smallest] += 1;
        }
        int sum = 0;
        for (int i = 0; i < counter.length; i++) {
            sum += counter[i];
            counter[i] = sum - 1;
        }
        for (int i : arr) {
            finalArray[counter[i - smallest]] = i;
            counter[i - smallest]--;
        }
        return finalArray;
    }

    public static void main(String[] args) {
        int[] inp = { 1, -2, 1, 2, -1, 0 };
        int[] sol = sort(inp.length, inp);
        Integer[] solPrint = PrimitiveObjectConverter.ConvertToObjectArray(sol);
        IOHandler.printArray(solPrint);
    }
}
