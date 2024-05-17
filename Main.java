import java.util.Random;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Random number = new Random();
         Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        int totalScore = 0;
        String choice;

        do {
            int x = number.nextInt(6) + 1;
            totalScore += x;
            System.out.println(playerName + ", you rolled a " + x);
            System.out.println("Your total score is: " + totalScore);

            // Ask if the player wants to roll again
            System.out.print("Do you want to roll again? (yes/no): ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing, " + playerName + "! Your final score is " + totalScore);
    }
}