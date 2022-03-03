import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int numberOfAttempts = 0; numberOfAttempts < 5;) {
            System.out.println("Let's the party started. Your task to do is guess correct number in max 5 attempts:");
            int numberToGuess = new Random().nextInt(100);
            System.out.println("Give me first try :)");
            int userInput = sc.nextInt();
            int Tries;

            while (userInput != numberToGuess) {

                do {
                    numberOfAttempts++;
                    Tries = 5 - numberOfAttempts;
                    System.out.println(Tries + " attempts you left");
                    System.out.println("Please try again");
                    if (userInput > numberToGuess)
                        System.out.println("Your number is GREATER than the one you are trying to guess");
                    else
                        System.out.println("Your number is LOWER than the one you are trying to guess");
                    userInput = sc.nextInt();
                    if (Tries == 1)
                        System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);
                    break;
                }
                while (Tries == 0);
            if (Tries == 0)
                sc.close();
            }
        }
    }
}



