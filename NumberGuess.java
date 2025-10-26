package projects;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int target = rand.nextInt(100) + 1;  // random number 1–100
        int guess = 0;
        int maxAttempts = 10;
        int attempts = 0; // ✅ Declare attempts

        System.out.println("I'm thinking of a number between 1 and 100.");

        while (guess != target && attempts < maxAttempts) {
            System.out.print("Enter your guess (" + (maxAttempts - attempts) + " tries left): ");
            guess = sc.nextInt();
            attempts++;

            if (guess < target) System.out.println("Too low!");
            else if (guess > target) System.out.println("Too high!");
        }

        if (guess == target) {
            System.out.println("🎉 Correct in " + attempts + " tries!");
        } else {
            System.out.println("Out of tries! The number was " + target);
        }

        sc.close(); // Always good to close the scanner
    }
}
