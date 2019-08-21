import java.util.Random;

import com.sun.java_cup.internal.runtime.Scanner;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess;

        // Prompt user for a guess
        System.out.println("I'm thinking of a number, can you guess it?");
        java.util.Scanner in = new java.util.Scanner(System.in);
        guess = in.nextInt();
        System.out.printf("You guessed %d\n", guess);
        System.out.printf("I was thinking of %d\n", number);
        int difference;
        if (guess < number) {
            difference = number - guess;
        }
        else {
            difference = guess - number;
        }
        System.out.printf("You were off by %d\n", difference);
    }

}
