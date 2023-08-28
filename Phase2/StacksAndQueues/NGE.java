package Phase2.StacksAndQueues;

import java.util.Arrays;
import java.util.Stack;

import Utils.Converter;
import Utils.IOHandler;

public class NGE {

    public static int[] nextGreater(int[] arr, int n) {
        int[] solArray = new int[n];
        Arrays.fill(solArray, -1);
        Stack<Integer> greaterTrack = new Stack<>();
        greaterTrack.push(0);
        for (int i = 1; i < n; i++) {
            Integer prevIdx = greaterTrack.peek();
            if (arr[i] <= arr[prevIdx]) {
                greaterTrack.push(i);
            } else {
                while (!greaterTrack.isEmpty()) {
                    prevIdx = greaterTrack.peek();
                    if (arr[i] > arr[prevIdx]) {
                        solArray[prevIdx] = arr[i];
                        greaterTrack.pop();
                    } else
                        break;
                }
                greaterTrack.push(i);
            }
        }
        return solArray;
    }

    public static void main(String[] args) {
        int[] inp = { 4, 3, 5 };
        int[] sol = nextGreater(inp, inp.length);
        IOHandler.printArray(Converter.toObject(sol));
    }
}