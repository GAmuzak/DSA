package Phase2.Recursion;

public class Fibonacci {
    public static long fib(long n) {
        if (n > 2) {
            return fib(n - 2) + fib(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        long sol = fib(9);
        System.out.println(sol);
    }
}
