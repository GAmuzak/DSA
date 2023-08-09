package Phase1.MapsAndSets;

import java.util.ArrayList;
import java.util.HashMap;

import Utils.IOHandler;

public class LongestSubArrayZeroSum {
    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0;
        int longestSubArrayLength = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            sum += num;
            if (map.containsKey(sum)) {
                int idx = map.get(sum);
                int length = i - idx;
                if (length > longestSubArrayLength) {
                    longestSubArrayLength = length;
                    // System.out.println(idx+" "+i);
                }
            }
            else if (sum == 0) {
                int length = i+1;
                if (length > longestSubArrayLength) {
                    longestSubArrayLength = length;
                    // System.out.println(i);
                }
            }
            else {
                map.put(sum, i);
            }
        }
        // IOHandler.printHashMap(map);
        return longestSubArrayLength;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Integer[] inp = { 1, -1, 3, 2, -2, -8, 1, 7, 10, 23};
        arr = IOHandler.arrayListInit(inp);
        int sol = LongestSubsetWithZeroSum(arr);
        System.out.println(sol);
    }
}
