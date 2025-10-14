import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int magicNumber = (int) (Math.random() * (99)) + 1;
        int theGuess = 0;
        int counter = 0;
        int totalGames = 0;
        int totalGuesses = 0;
        int bestGame = 0;//fix later
        int currentGame = 0;//fix later
        double guessesPerGame = 0;//fix later
        String playAgain = "y";

        while (playAgain.substring(0,1).equalsIgnoreCase("y")) {
            magicNumber = (int) (Math.random() * 99) + 1;
            theGuess = 0;
            counter = 0;
            System.out.println("I'm thinking of a number between 1 and 100...");

            while (theGuess != magicNumber) {
                System.out.println("Your guess?");
                theGuess = sc.nextInt();

                if (theGuess < magicNumber)
                    System.out.println("It's higher.");
                if (theGuess > magicNumber)
                    System.out.println("It's lower.");
                if (theGuess == magicNumber) {
                    if (counter == 1) ;
                    {
                        System.out.println("You got it right in 1 guess!");
                    }
                }

            }
            totalGames++;
            totalGuesses += counter;
            currentGame++;//fix later

            System.out.println("Do you want to play again?");
            playAgain = sc.next();
        }
        System.out.println("Overall results:");
        System.out.println("Total games = " + totalGames);
        System.out.println("Total guesses = " + totalGuesses);
    }
}
