public class Pow {
    public static double myPow(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            n = Math.abs(n);
        }

        double result = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                result *= x;
            }
            x *= x;
            n /= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2, -2147483648));
    }
}
