package Phase2.AllTypes;

import java.util.HashMap;

import Utils.Converter;
import Utils.IOHandler;

public class CheckSubset {
    public static boolean checkSubset(int[] arr1, int[] arr2, int n, int m) {
        HashMap<Integer, Integer> freqMap = new HashMap<>(n);
        for (int val : arr1) {
            freqMap.put(val, freqMap.getOrDefault(val, 0) + 1);
        }
        for (int val : arr2) {
            if (freqMap.containsKey(val)) {
                freqMap.put(val, freqMap.get(val) - 1);
                if (freqMap.get(val) == 0)
                    freqMap.remove(val);
            }
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = Converter.toPrimitive(IOHandler.handleArrayInput(Integer.class));
        int[] arr2 = Converter.toPrimitive(IOHandler.handleArrayInput(Integer.class));
        boolean sol = checkSubset(arr1, arr2, arr1.length, arr2.length);
        System.out.println(sol);
    }
}
