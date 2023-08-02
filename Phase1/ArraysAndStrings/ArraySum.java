package Phase1.ArraysAndStrings;

public class ArraySum {

    public static int getSum(int[] arr){
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int sol = getSum(arr);
        System.out.println(sol);
    }
}
