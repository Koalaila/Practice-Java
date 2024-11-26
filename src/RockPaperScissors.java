import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Game options
        String[] choices = {"Rock", "Paper", "Scissors"};

        // Instructions for the user
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter your choice:");
        System.out.println("1 for Rock");
        System.out.println("2 for Paper");
        System.out.println("3 for Scissors");

        // Get the user's choice
        System.out.print("Your choice: ");
        int userChoice = scanner.nextInt();

        // Validate user input
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid choice! Please enter a number between 1 and 3.");
            return;
        }

        // Generate computer's choice
        int computerChoice = random.nextInt(3) + 1;

        // Display choices
        System.out.println("You chose: " + choices[userChoice - 1]);
        System.out.println("Computer chose: " + choices[computerChoice - 1]);

        // Determine the winner
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) || // Rock beats Scissors
                   (userChoice == 2 && computerChoice == 1) || // Paper beats Rock
                   (userChoice == 3 && computerChoice == 2)) { // Scissors beats Paper
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}
