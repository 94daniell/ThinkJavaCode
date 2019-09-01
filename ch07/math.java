public static class math {
    
    public static void main(String args[]) {
        System.out.println(SquareRoot(16));
        System.out.println(power(3,0));
        System.out.println(factorial(0));
        check(1.0);
    }
    
    public static double SquareRoot(double a) {
        double x = a/2;
        double y = a;
        while (Math.abs(x - y) > 0.0001) {
            y = x;
            x = (x + a/x)/2;
        }
        return x;
    }
    
    public static double power(double x, int n) {
        double x0 = 1;
        for (int i=0; i<n; i++) {
            x0*=x;
        }
        return x0;
    }
    public static int factorial(int n) {
        int m = 1;
        for (int i = n; i > 0; i--) {
            m = m * i;
        }
        return m;
    }
    
    public static double myexp(double x, int n) {
        double e = 1.0;
        double j = 1.0;
        for (int i=1; i<n; i++) {
            //e = e + (power(x,i)/factorial(i));
            j *= (x/i);
            e += j;
        }
        return e;
    }
        
    public static double gauss(double x, int n) {
        double j = 1;
        double y = 1.0;
        for (int i = 1; i < n; i++) {
            j *= (-x / i) * x;
            y += j;
        }
        return y;
    }
    
    public static void check(double x) {
        System.out.print(x + "\t");
        System.out.print(myexp(x, 18)+"\t");
        System.out.println(Math.exp(x));
    }
}