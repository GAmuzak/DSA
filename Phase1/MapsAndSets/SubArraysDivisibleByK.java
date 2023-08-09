package Phase1.MapsAndSets;

import java.util.ArrayList;
import java.util.HashMap;

import Utils.IOHandler;

public class SubArraysDivisibleByK {
    public static int subArrayCount(ArrayList<Integer>arr, int k) {
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        freq.put(0, 1);
        long sum = 0;
        int rem = 0;
        int subArrayCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            sum += num;
            rem = (int) sum % k;
            if (rem < 0) rem += k;
            if (freq.containsKey(rem)) {
                Integer currentFreq = freq.get(rem);
                subArrayCount += currentFreq;
                freq.put(rem, freq.get(rem)+1);
            }
            else {
                freq.put(rem, 1);
            }
        }
        return subArrayCount;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Integer[] inp = {2,3,5,4,5,3,4};
        arr = IOHandler.arrayListInit(inp);
        int k = 7;
        int sol = subArrayCount(arr, k);
        System.out.println(sol);
    }
}
