package Phase1.Matrices;

public class SymMatrix {
    public static boolean isMatrixSymmetric(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix.length; j++) {
                if(matrix[i][j]!=matrix[j][i]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] twoDArray = {
            {1,0},
            {1,1}
        };
        // 1 2 3 4 5 6 7 8 9
        boolean ans = isMatrixSymmetric(twoDArray);
        System.out.println(ans);
    }
}
