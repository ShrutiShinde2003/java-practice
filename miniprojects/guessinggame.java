import java.util.Random;
import java.util.Scanner;

public class guessinggame {
    public static void main (String[]args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        int randomNumber = random.nextInt(100)+ 1;
        int userGuess;
        int attempts = 0;
        System.out.println("Welcome to the Number Guessing Game");
        System.out.println("Guess a number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");

            userGuess = scanner.nextInt();

            attempts++;

            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
            }

        } while (userGuess != randomNumber);    

        scanner.close();
    }
}