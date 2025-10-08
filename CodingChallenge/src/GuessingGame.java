import java.util.Scanner;

public class GuessingGame
{
    {
        System.out.println("I will think of a number between 1 and 100");
        System.out.println("and you will try to guess it.");
        System.out.println("After each guess, I will give you a clue about");
        System.out.println("whether the correct number is higher or lower.");
        int number = (int) (math.random(100) * 1);
        System.out.println("I'm thinking of a number between 1 and 100...");
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();
        System.out.println("Your guess?" + guess);
        if (guess < number)
        {
            System.out.println("It's lower.");
        }
        if (guess > number)
        {
            System.out.println("It's higher.");
        }
        else if (guess = number)
        {
            System.out.println("You got it right in" + nGuesses + "guesses!");
        }

    }
}
