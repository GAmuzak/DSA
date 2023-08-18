package Phase2.BinarySearch;

public class FindSquareRoot {
    public static int sqrtN(long N) {
        long left = 0;
        long right = N / 2;
        long mid = 0;
        while (left <= right) {
            mid = (right + left) / 2;
            long midSqr = mid * mid;
            if (midSqr == N) {
                return (int) mid;
            } else if (midSqr < N) {
                left = mid + 1;
            } else if (midSqr > N) {
                right = mid - 1;
            }
        }
        if (mid * mid > N)
            mid--;
        return (int) mid;
    }

    public static void main(String[] args) {
        long val = 28;
        int sol = sqrtN(val);
        System.out.println(sol);
    }
}
