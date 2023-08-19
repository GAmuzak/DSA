package Phase2.BinarySearch;

import java.util.*;

public class AgressiveCows {

    public static boolean canPlaceCows(int[] stalls, int k, int targetDist) {
        int cowCount = 1, lastCoord = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastCoord >= targetDist) {
                cowCount++;
                lastCoord = stalls[i];
            }
            if (cowCount >= k)
                return true;
        }
        return false;
    }

    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int low = 0, high = stalls[stalls.length - 1] - stalls[0], mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            boolean canPlace = canPlaceCows(stalls, k, mid);
            if (canPlace) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        int[] arr = { 87, 93, 51, 81, 68, 99, 59 };
        int sol = aggressiveCows(arr, 4);
        System.out.println(sol);
    }
}
