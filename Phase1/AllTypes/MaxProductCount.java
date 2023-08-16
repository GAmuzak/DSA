package Phase1.AllTypes;

import java.util.ArrayList;
import java.util.HashMap;

import Utils.Converter;
import Utils.IOHandler;

public class MaxProductCount {

    public static long getCombos(int count) {
        long combosVal = (long) count * (count - 1) / 2;
        return combosVal;
    }

    public static long[] maxProductCount(int arr[], int n) {
        HashMap<Long, Integer> freq = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                long prod = (long) arr[i] * arr[j];
                freq.put(prod, freq.getOrDefault(prod, 0) + 1);
            }
        }
        int biggestFreq = 1;
        long currentTarget = 0;
        for (Long key : freq.keySet()) {
            if (freq.get(key) >= biggestFreq) {
                if (freq.get(key) > biggestFreq) {
                    biggestFreq = freq.get(key);
                    currentTarget = key;
                } else if (freq.get(key) == biggestFreq && currentTarget > key) {
                    biggestFreq = freq.get(key);
                    currentTarget = key;
                }
            }
        }
        if (biggestFreq == 1) {
            long[] none = { 0 };
            return none;
        } else {
            long[] sol = new long[2];
            sol[0] = currentTarget;
            sol[1] = (long) getCombos(biggestFreq);
            return sol;
        }
    }

    public static void main(String[] args) {
        Integer[] arrInp = IOHandler.handleArrayInput(Integer.class);
        int[] arr = Converter.toPrimitive(arrInp);
        long[] sol = maxProductCount(arr, arr.length);
        IOHandler.printArray(Converter.toObject(sol));
    }
}
