package Phase1.AllTypes;

import java.util.HashSet;

public class LongestSeq {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        if (N == 0 || N == 1)
            return N;
        HashSet<Integer> vals = new HashSet<>();
        for (int i : arr) {
            vals.add(i);
        }
        int maxLength = 1;
        for (Integer integer : vals) {
            if (!vals.contains(integer - 1)) {
                int currentNum = integer;
                int currentLength = 1;
                while (vals.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        return maxLength;
    }
}
