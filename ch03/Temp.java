import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        double tempC, tempF;
        final double C_TO_F_RATIO = 9.0 / 5.0;
        final int C_TO_F_DIFFERENCE = 32;
        Scanner in = new Scanner(System.in);

        System.out.println("How hot is it?");
        tempC = in.nextDouble();

        tempF = (tempC * C_TO_F_RATIO) + C_TO_F_DIFFERENCE;
        System.out.printf("In degrees of freedom, that's %.1f degrees\n", tempF);
        in.close();
    }
}