package Methods;
import java.util.Scanner;

public class DiceGame {

    static int rollDice() {
        return (int)(Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int playerScore = 0;
        int computerScore = 0;

        System.out.println("Welcome to the Dice Game (Player vs Computer)!");
        System.out.println("First to score 5 wins the game.");
        System.out.println("----------------------------------");

        while (playerScore < 5 && computerScore < 5) {
            System.out.print("\nPress Enter to roll your dice...");
            scanner.nextLine(); 

            int playerRoll = rollDice();
            int computerRoll = rollDice();

            System.out.println("You rolled: " + playerRoll);
            System.out.println("Computer rolled: " + computerRoll);

            if (playerRoll > computerRoll) {
                playerScore++;
                System.out.println("You win this round!");
            } else if (computerRoll > playerRoll) {
                computerScore++;
                System.out.println("Computer wins this round!");
            } else {
                System.out.println("It's a tie!");
            }

            System.out.println("Score => You: " + playerScore + " | Computer: " + computerScore);
        }

        System.out.println("\n Game Over!");
        if (playerScore > computerScore) {
            System.out.println("Congratulations! You won the game!");
        } else {
            System.out.println("Better luck next time! Computer won.");
        }

        scanner.close();
    }
}
