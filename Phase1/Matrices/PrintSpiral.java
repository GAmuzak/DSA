package Phase1.Matrices;

public class PrintSpiral {
    public static void spiralPrint(int matrix[][]){
        if(matrix.length==0) return;
		int top = 0, left = 0, bottom = matrix.length-1, right = matrix[0].length-1;
        while (true) {
            if(left>right) break;
            //print top, left to right
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;
            if(top>bottom) break;
            //print top to bottom, right
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right]+ " ");
            }
            right--;
            if(left>right) break;
            //print bottom, right to left
            for (int i = right; i >= left; i--) {
                System.out.print(matrix[bottom][i]+ " ");
            }
            bottom--;
            if(top>bottom) break;
            //print bottom to top, left
            for (int i = bottom; i >= top; i--) {
                System.out.print(matrix[i][left]+ " ");
            }
            left++;
        }
	}

    public static void main(String[] args) {
        // int[][] twoDArray = {
        //     {99, 17, 67, 46 },
        //     {0, 87, 32, 53 },
        //     {27, 24, 79, 71 },
        //     {23, 0, 17, 0 },
        //     {85, 100, 40, 0} 
        // };
        int[][] twoDArray = {
            
        };
        spiralPrint(twoDArray);
    }
}
