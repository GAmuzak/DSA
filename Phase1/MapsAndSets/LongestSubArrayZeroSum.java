package Phase1.MapsAndSets;

import java.util.ArrayList;

import Utils.IOHandler;

public class LongestSubArrayZeroSum {
    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
        
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Integer[] inp = { 1, -1, 3, 2, -2, -8, 1, 7, 1, 0, 2, 3};
        arr = IOHandler.arrayListInit(inp);
        int sol = LongestSubsetWithZeroSum(arr);
        System.out.println(sol);
    }
}
