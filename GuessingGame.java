import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secretNumber = 25;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > secretNumber) {
                System.out.println("Too High! Try a lower number.");
            } 
            else if (guess < secretNumber) {
                System.out.println("Too Low! Try a higher number.");
            } 
            else {
                System.out.println("Congratulations! You guessed the correct number.");
            }

        } while (guess != secretNumber);

        sc.close();
    }
}