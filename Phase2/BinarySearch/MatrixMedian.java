package Phase2.BinarySearch;

import java.util.ArrayList;

import Utils.Converter;
import Utils.IOHandler;

public class MatrixMedian {

    public static int getLessThanCount(ArrayList<ArrayList<Integer>> arr, int mid) {
        int lowerThan = 0;
        for (ArrayList<Integer> row : arr) {
            int left = 0;
            int right = row.size() - 1;
            while (left <= right) {
                int midIndex = left + (right - left) / 2;
                int midValue = row.get(midIndex);
                if (midValue <= mid) {
                    lowerThan += (midIndex - left + 1);
                    left = midIndex + 1;
                } else {
                    right = midIndex - 1;
                }
            }
        }
        return lowerThan;
    }

    public static int getMedian(ArrayList<ArrayList<Integer>> matrix) {
        int count = matrix.size() * matrix.get(0).size();
        int low = 1;
        int high = 100000;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            int lowerThan = getLessThanCount(matrix, mid);
            System.out.println(low + " " + mid + " " + high);
            System.out.println(lowerThan);
            if (lowerThan <= count / 2) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 0, 0, 2, 4, 4 },
                { 3, 7, 10, 11, 15 },
                { 4, 4, 4, 7, 9 },
                { 1, 3, 5, 6, 9 },
                { 2, 5, 5, 6, 10 }
        };
        ArrayList<ArrayList<Integer>> arrLst = IOHandler.arrayList2DInit(Converter.toObject(arr));
        int sol = getMedian(arrLst);
        System.out.println(sol);
    }
}
