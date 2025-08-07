package Methods;
//Number Guessing Game using Math Function 
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int secretNumber = (int)(Math.random() * 100) + 1;

        int guess;
        int attempts = 0;

        System.out.println("*** Welcome to the Number Guessing Game! ***");
        System.out.println("    (Guess a number between 1 and 100.)\n ");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try a higher number.");
            } else {
                System.out.println("Too high! Try a lower number.");
            }
        }

        scanner.close();
    }
}
