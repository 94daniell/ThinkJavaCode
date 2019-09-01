import java.util.Arrays;
import java.util.Random;

public class encap {

    public static double[] powArray(double[] a, int n) {
        double[] b = Arrays.copyOf(a, a.length);

        for (int i = 0; i < b.length; i++) {
            b[i] = Math.pow(b[i], n);
        }
        return b;
    }

    public static void main(String[] args) {
        double[] a = { 1, 2, 3, 4 };
        int[] d = { 1, 2, 3, 4 };
        double[] b = powArray(a, 3);
        int[] c = { 0, -2, -4, -6 };
        System.out.println(Arrays.toString(b));
        System.out.println(indexOfMax(c));
        System.out.println(Arrays.toString(sieve(12)));
        System.out.println(areFactors(2, d));
        System.out.println(maxInRange(c, 0, 2));
    }
    
    public static int[] histogram(int[] a) {
        scores = new int[100];
        for (int value : a) {
            scores[value]++;
        }
        return scores;
    }

    public static int indexOfMax(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[max]) {
                max = i;
            }
        }
        return max;
    }

    public static boolean[] sieve(int n) { // Program to employ the Sieve of Eratosthenes
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i < n; i++) {
            if (!primes[i]) {
                continue;
            }
            for (int j = i; j < n; j += i) {
                if (j == i) {
                    continue;
                }
                if (primes[j]) {
                    primes[j] = false;
                }
            }
        }
        return primes;
    }

    public static boolean areFactors(int n, int[] factors) {
        for (int factor : factors) {
            if (n % factor != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean arePrimeFactors(int n, int[] factors) {
        if (!areFactors(n, factors)) {
            return false;
        }
        boolean[] primes = sieve(n);
        for (int factor : factors) {
            if (!primes[factor]) {
                return false;
            }
        }
        return true;
    }
    
    public static int maxInRange(int[] a, int lowIndex, int highIndex) {
        if (lowIndex == highIndex) {
            return a[lowIndex];
        }
        int mid = (highIndex - lowIndex) / 2;
        return Math.max(maxInRange(a, lowIndex, lowIndex + mid), maxInRange(a, highIndex - mid, highIndex));
    }
    
    public static int max(int[] a) {
        return maxInRange(a, 0, a.length - 1);
    }
}