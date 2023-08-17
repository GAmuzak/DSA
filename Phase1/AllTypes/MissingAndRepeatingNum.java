package Phase1.AllTypes;

import java.util.ArrayList;
import java.util.HashMap;

import Utils.Converter;
import Utils.IOHandler;

/**
 * MissingAndRepeatingNum
 */
public class MissingAndRepeatingNum {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int[] sol = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : arr) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        int m = 0, r = 0;
        for (int i = 1; i <= n; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) > 1) {
                    r = i;
                }
            } else {
                m = i;
            }
        }
        sol[0] = m;
        sol[1] = r;
        return sol;
    }

    public static void main(String[] args) {
        Integer[] inp = { 6, 5, 3, 1, 5, 4 };
        ArrayList<Integer> arr = IOHandler.arrayListInit(inp);
        int[] sol = missingAndRepeating(arr, arr.size());
        IOHandler.printArray(Converter.toObject(sol));
    }
}