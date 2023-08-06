package Phase1.ArraysAndStrings.MultiDimArrays;

import Utils.IOHandler;

public class SetZero {
    public static void setZeros(int matrix[][]) {
        int topRowState = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    if(i==0) topRowState = 0;
                    else if(i>0) matrix[i][0]=0;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j]=0;
            }
        }

        if(matrix[0][0]==0){
            for (int i = 1; i < matrix.length; i++) {
                matrix[i][0]=0;
            }
        }
        
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[0][i] *= topRowState ;
        }
    }

    public static void main(String[] args) {
        int[][] twoDArray = {
            {99, 17, 67, 46 },
            {0, 87, 32, 53 },
            {27, 24, 79, 71 },
            {23, 0, 17, 0 },
            {85, 100, 40, 0} 
        };
        setZeros(twoDArray);
        IOHandler.print2dArray(twoDArray);
    }
}
