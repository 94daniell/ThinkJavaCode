public class testing {
    public static void main(String[] args) {
        Math.sqrt(9);
        System.out.println(isDivisible(9, 10));
        System.out.println(isTriangle(3, 4, 5));
        
    }

    public static boolean isDivisible(int n, int m) {
        return n % m == 0;
    }

    public static boolean isTriangle(int a, int b, int c) {
        if (a + b < c) {
            return false;
        } else if (a + c < b) {
            return false;
        } else if (c + b < a) {
            return false;
        } else {
            return true;
        }
    }
    

}