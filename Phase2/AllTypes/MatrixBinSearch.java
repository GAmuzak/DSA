package Phase2.AllTypes;

import java.util.Arrays;

public class MatrixBinSearch {
    public static Pair search(int[][] matrix, int x) {
        Pair sol = new Pair(-1, -1);
        outer: for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            int j = Arrays.binarySearch(row, x);
            if (j >= 0) {
                sol.x = i;
                sol.y = j;
                break outer;
            }
        }
        return sol;
    }
}