import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] choices = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        int computerChoice = random.nextInt(3);  
        System.out.println("Enter your choice (Rock, Paper, or Scissors): ");
        String userChoice = scanner.nextLine();
        if (!userChoice.equalsIgnoreCase("Rock") && 
            !userChoice.equalsIgnoreCase("Paper") && 
            !userChoice.equalsIgnoreCase("Scissors")) {
            System.out.println("Invalid choice! Please enter Rock, Paper, or Scissors.");
            scanner.close();
            return;
        }
        System.out.println("Your choice: " + userChoice);
        System.out.println("Computer's choice: " + choices[computerChoice]);

        if (userChoice.equalsIgnoreCase(choices[computerChoice])) {
            System.out.println("It's a tie!");
        } else if (
            (userChoice.equalsIgnoreCase("Rock") && choices[computerChoice].equals("Scissors")) ||
            (userChoice.equalsIgnoreCase("Paper") && choices[computerChoice].equals("Rock")) ||
            (userChoice.equalsIgnoreCase("Scissors") && choices[computerChoice].equals("Paper"))
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

        scanner.close();
    }
}
