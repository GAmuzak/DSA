package Phase1.ArraysAndStrings.Arrays;

public class CheckVal {

    private static boolean isPresent(int[] arr, int val) {
        for (int i : arr) {
            if(val==i) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int val1 = 3, val2 = 8;
        boolean val1Present = isPresent(arr, val1), val2Present = isPresent(arr, val2);
        System.out.println("Is " + val1 + " Present: " + val1Present);
        System.out.println("Is " + val2 + " Present: " + val2Present);
    }

}
