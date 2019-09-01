/**
 * Rational
 */
public class Rational {

    private int numerator;
    private int denominator;

    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Rational(int num, int denom) {
        this.numerator = num;
        this.denominator = denom;
    }

    public static void printRational(Rational r) {
        System.out.printf("%d/%d", r.numerator, r.denominator);
        System.out.println();
    }

    public String toString() {
        return String.format("%d/%d", this.numerator, this.denominator);
    }

    public void negate() {
        this.numerator *= -1;
    }

    public void invert() {
        int placeholder = this.numerator;
        this.numerator = this.denominator;
        this.denominator = placeholder;
    }

    public static double toDouble(Rational r) {
        return ((double) r.numerator) / r.denominator;
    }

    private int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (b > a) {
            int q = b / a;
            int r = b % a;
            return gcd(a, r);
        } else {
            int q = a / b;
            int r = a % b;
            return gcd(b, r);
        }
    }

    public Rational reduce() {
        int i = gcd(this.denominator, this.numerator);
        if (i > 1) {
            return new Rational(this.numerator / i, this.denominator / i);
        }
        else {
            return new Rational(this.numerator, this.denominator);
        }
    }
    public static void main(String[] args) {
        Rational rat = new Rational();
        rat.numerator = 5;
        rat.denominator = 10;
        printRational(rat);
        System.out.println(rat);
        rat.negate();
        System.out.println(rat);
        rat.invert();
        printRational(rat);
    }
}