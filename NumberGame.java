import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        String playAgain;

        do {
            int randomNumber = rand.nextInt(100) + 1; // 1 to 100
            int attempts = 5;
            boolean guessedCorrectly = false;

            System.out.println("\n=== Number Guessing Game ===");
            System.out.println("Guess a number between 1 and 100");
            System.out.println("You have " + attempts + " attempts.");

            for (int i = 1; i <= attempts; i++) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();

                if (guess == randomNumber) {
                    System.out.println("Correct! You guessed the number.");
                    score++;
                    guessedCorrectly = true;
                    break;
                } else if (guess > randomNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }

                System.out.println("Attempts left: " + (attempts - i));
            }

            if (!guessedCorrectly) {
                System.out.println("Game Over! The correct number was: " + randomNumber);
            }

            System.out.println("Your Score: " + score);

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");
        sc.close();
    }
}