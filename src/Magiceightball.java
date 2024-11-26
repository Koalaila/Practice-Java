import java.util.Random;
import java.util.Scanner;

public class Magiceightball {
    public static void main(String[] args) {
        // Array of 20 possible responses from the Magic 8 Ball
        String[] responses = {
            "It is certain.",
            "Very doubtful.",
            "Yes, definitely.",
            "No way.",
            "Ask again later.",
            "Cannot predict now.",
            "Yes, but don't count on it.",
            "My sources say no.",
            "You may rely on it.",
            "Don't hold your breath.",
            "Most likely.",
            "Outlook not so good.",
            "Yes.",
            "No.",
            "I wouldn't count on it.",
            "Yes, in due time.",
            "Reply hazy, try again.",
            "Better not tell you now.",
            "Definitely not.",
            "Absolutely."
        };

        // Create a random object for random response generation
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Magic 8 Ball game!");
        System.out.println("Ask a yes-or-no question, and I will provide an answer.");
        System.out.println("Type 'exit' to quit the game.");

        while (true) {
            // Prompt user for a question
            System.out.print("Ask a question: ");
            String question = scanner.nextLine();

            // Check if the user wants to exit
            if (question.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing. Goodbye!");
                break;
            }

            // Generate a random response
            int randomIndex = rand.nextInt(responses.length);
            String answer = responses[randomIndex];

            // Display the response
            System.out.println("Magic 8 Ball says: " + answer);
        }

        scanner.close();
    }
}
