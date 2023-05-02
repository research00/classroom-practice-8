public class Main {
    public static void main(String[] args) {
        long n = 100000;
        System.out.println("iteration-> sum 0 ~ " + n + ": " + iteration(n));
        System.out.println("recursion-> sum 0 ~ " + n + ": " + recursion(n));
    }
    public static long iteration(long n) {
        long sum = 0;
        for (long i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static long recursion(long n) {
        long sum = 0;
        if (n >=1) {
            sum = n + recursion(n - 1);
        }
        return sum;
    }
}