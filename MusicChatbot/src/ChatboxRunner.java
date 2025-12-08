/**
 * Program to recommend artists based on music genre taste and current favorite artists.
 */

import java.util.Scanner;

public class ChatboxRunner {
    public static void main(String[] args) {
        Chatbox chatbox = new Chatbox();
        String greeting = chatbox.getGreeting();
        System.out.println(greeting);

        Scanner in = new Scanner(System.in);
        String statement = in.nextLine();
        int count = 0;

        while (!statement.equalsIgnoreCase("Done")) {

            if (statement.equalsIgnoreCase("next")) { // detects amount of goals through the loop
                count++;
                String goalQuestion = "What is your " + count + ". goal? Just type 'I want to...' with your goal!";
                System.out.println(goalQuestion);
                statement = in.nextLine();
                continue;  // Skip sending "next" to Chatbox.getResponse()
            }

            // Otherwise get a normal response
            String response = chatbox.getResponse(statement);
            System.out.println(response);

            statement = in.nextLine();
        }

        System.out.println("Good job planning your goals for the day! Here's what you've set for today."); // response once 'done' is typed
        System.out.println(chatbox.getGoals());
        in.close();
    }
}