package Phase1.ArraysAndStrings.MultiDimArrays;

public class RotateArray {

    public static void inplaceRotate(int[][] arr, int n) {
        int left = 0, right = n-1;
        while(left<right){
            for (int i = 0; i < right-left; i++) {
                int top = left, bottom = right; 
                int topLeft = arr[top][left+i];
                arr[top][left+i] = arr[top+i][right];
                arr[top+i][right] = arr[bottom][right-i];
                arr[bottom][right-i] = arr[bottom-i][left];
                arr[bottom-i][left] = topLeft;
            }
            left++;
            right--;
        }
	}
    public static void main(String[] args) {
        int[][] twoDArray = {
            {1,  2,  3,  4}, 
            {5,  6,  7,  8},
            {9, 10, 11, 12}, 
            {13, 14, 15, 16}
        };
        inplaceRotate(twoDArray, twoDArray.length);
        for (int[] row : twoDArray) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
