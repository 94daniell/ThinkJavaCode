import java.math.BigInteger;
/**
 * Big
 */
public class Big {

    public static BigInteger factorial(int n) {
        BigInteger m = BigInteger.valueOf(1);
        for (int i = n; i > 0; i--) {
            BigInteger next = BigInteger.valueOf(i);
            m = m.multiply(next);
        }
        return m;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 30; i++) {
            System.out.print(factorial(i) + " ");
        }
        System.out.println();
    }
}