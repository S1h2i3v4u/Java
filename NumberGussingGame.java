package Project9;
import java.util.*;

// Game loop using do-while

public class NumberGussingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Number Guessing Game!");

        // Generate a random number between 1 and 10
        Random rand = new Random();
        int target = rand.nextInt(10) + 1;

        int guess; 
        do {
       
            System.out.print("Enter your guess (1 to 10): ");
            guess = sc.nextInt();

            // Check if the guess is too low, too high, or correct
            if (guess < target) {
                System.out.println("Too low! Try again.");
            } else if (guess > target) {
                System.out.println("Too high! Try again.");
            }

        } while (guess != target);     // Continue looping until the guess is correct

        System.out.println(" Congratulations! You guessed the correct number: " + target);
    }
}
