package Phase1.AllTypes;

import Utils.IOHandler;
import Utils.PrimitiveObjectConverter;

public class CountingSort {
    public static int[] sort(int n, int arr[]) {
        int[] finalArray = new int[n];

        return finalArray;
    }

    public static void main(String[] args) {
        int[] inp = { 1, -2, 1, 2, -1, 0 };
        int[] sol = sort(inp.length, inp);
        Integer[] solPrint = PrimitiveObjectConverter.ConvertToObjectArray(sol);
        IOHandler.printArray(solPrint);
    }
}
