package Phase1.ArraysAndStrings.Arrays;

public class ArrayAvg {

    private static double getAvg(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        double avg = sum/arr.length;
        return avg;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        double sol = getAvg(arr);
        System.out.println(sol);
    }
    
}
