package Phase2.Recursion;

public class SumTillN {

    public static int getSum(int n) {
        if (n > 1) {
            int oneLess = getSum(n - 1);
            System.out.println(oneLess);
            return n + oneLess;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int sol = getSum(8);
        System.out.println(sol);
    }
}