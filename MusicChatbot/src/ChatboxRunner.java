/**
 * Program to recommend artists based on music genre taste and current favorite artists.
 */

import java.util.Scanner;
public class ChatboxRunner
{
    public static void main(String[] args)
    {
            Chatbox chatbox = new Chatbox();
            String greeting = chatbox.getGreeting();
            System.out.println(greeting);
            Scanner in = new Scanner(System.in);
            String statement = in.nextLine();

            while(!statement.equalsIgnoreCase("Quit") && !statement.equalsIgnoreCase("No"))
            {
                String response = chatbox.getResponse(statement);
                System.out.println(response);
                statement = in.nextLine();
            }
        System.out.println("Thank you for the conversation. Have a nice day.");
        in.close();
    }
}