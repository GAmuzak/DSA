package Phase1.AllTypes;

import Utils.IOHandler;
import Utils.Converter;

public class RotateMatrixToRight {
    public static int[][] rotateMatRight(int[][] mat, int n, int m, int k) {
        int[][] rotatedMat = new int[n][m];
        k %= m;
        if (k == 0)
            return mat;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rotatedMat[i][(j + k) % m] = mat[i][j];
            }
        }
        return rotatedMat;
    }

    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 }
        };
        int[][] rotatedMat = rotateMatRight(mat, mat.length, mat[0].length, 2);
        IOHandler.print2dArray(Converter.toObject(rotatedMat));
    }
}
