package Phase1.ArraysAndStrings.Arrays;

public class ReverseArray {
    private static int[] reverse(int[] arr) {
        int[] revArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            revArr[arr.length-1-i] = arr[i];
        }
        return revArr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] revArr = reverse(arr);
        for (int i : revArr) {
            System.out.print(i + ", " );
        }
    }
}
