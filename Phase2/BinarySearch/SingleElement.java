package Phase2.BinarySearch;

import java.util.ArrayList;

import Utils.Converter;
import Utils.IOHandler;

public class SingleElement {

    public static int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return arr[0];
        if (!(arr[0]==arr[1]))
            return arr[0];
        if (!(arr[n-1]==arr[n-2]))
            return arr[n - 1];
        int left = 1, right = n - 2, mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            int current = arr[mid];
            boolean dupOnLeft = arr[mid-1]==current;
            boolean dupOnRight = arr[mid+1]==current;
            if (!dupOnLeft && !dupOnRight) {
                return current;
            }
            int leftElementCount = mid;
            if (dupOnLeft) {
                if (leftElementCount % 2 == 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (dupOnRight) {
                if (leftElementCount % 2 == 0) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        int sol = singleNonDuplicate(arr);
        System.out.println(sol);
    }
}
