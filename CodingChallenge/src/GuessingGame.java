import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        int magicNumber = (int) (Math.random() * (99)) + 1;
        int theGuess = 0;
        int counter = 0;
        Scanner sc = new Scanner(System.in);

        while (theGuess != magicNumber)
        {
            System.out.println("I'm thinking of a number between 1 and 100...");
            theGuess = sc.nextInt();
            if (theGuess < magicNumber)
                System.out.println("It's higher.");
            if (theGuess > magicNumber)
                System.out.println("It's lower.");
            if (theGuess == magicNumber)
            {
                System.out.println("You got it right in " + (counter+1) + " guesses!");

                counter++;
        }
    }
}}
