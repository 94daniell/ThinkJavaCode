public class Multadd {

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static void main(String[] args) {
        System.out.println(multadd(2, 4, 3));
        System.out.println(multadd(1, 2, 3));
        System.out.println(multadd(0.5, Math.cos(Math.PI / 4), Math.sin(Math.PI / 4)));
        System.out.println(multadd(1, Math.log(10), Math.log(20)));
        System.out.println(oddSum(5));
    }
    
    public static double expSum(double x) {
        double exp = Math.exp(-x);
        return multadd(x, exp, Math.sqrt(1 - exp));
    }

    public static int oddSum(int n) {
        if (n % 2 == 0 || n <= 0) {
            System.err.println("Input to oddSum must be an odd integer");
            return 0;
        }
        if (n == 1) {
            return n;
        } else {
            return n + oddSum(n - 2);
        }
    }
    
    public static int ack(int m, int n) {
        if (m == 0 && n >= 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ack(m - 1, 1);
        } else if (m > 0 && n > 0) {
            return ack(m - 1, ack(m, n - 1));
        } else {
            System.err.println("Inputs to ack must be positive integers");
            return 0;
        }
    }
}