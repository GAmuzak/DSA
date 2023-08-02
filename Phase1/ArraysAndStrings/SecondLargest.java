package Phase1.ArraysAndStrings;

public class SecondLargest {
    private static int getSecondLargest(int[] arr) {
        int big = Integer.MIN_VALUE;
        int big2 = Integer.MIN_VALUE;
        for (int i : arr) {
            if(i>big){
                big2=big;
                big=i;
            }
            else{
                if(i>big2&&i!=big){
                    big2=i;
                }
            }
        }
        if(big2==Integer.MIN_VALUE) return -1;
        return big2;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-10, -40, -25, -12, -25, -10};
        int sol = getSecondLargest(arr);
        System.out.println(sol);
    }
}