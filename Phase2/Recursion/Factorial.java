package Phase2.Recursion;

public class Factorial {
    public static long fac(long n) {
        if (n > 1) {
            return n * fac(n - 1);
        } else {
            return 1l;
        }
    }

    public static void main(String[] args) {
        long sol = fac(6l);
        System.out.println(sol);
    }
}
