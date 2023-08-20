package Phase2.Recursion;

import java.util.HashMap;

public class Fibonacci {
    public static long fib(long n, HashMap<Long, Long> map) {
        if (map.containsKey(n)) {
            return map.get(n);
        }
        if (n <= 2) {
            return 1;
        }
        long result = fib(n - 1, map) + fib(n - 2, map);
        map.put(n, result);
        return result;
    }
    public static long fibMain(long n) {
        HashMap<Long, Long> memMap = new HashMap<>();
        return fib(n, memMap);
    }
    public static void main(String[] args) {
        long sol = fibMain(9);
        System.out.println(sol);
    }
}
