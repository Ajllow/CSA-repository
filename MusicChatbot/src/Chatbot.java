import java.util.ArrayList;
public class Chatbot {

    private ArrayList<String> goals = new ArrayList<>(); // creates array list so that each goal is added to the array

    public String getGreeting() {
        return "Hello, welcome to your personal goal chatbox. Type 'next' to set your first goal! Type 'done' when you have set all your goals for the day.";
    } // greeting that gives instructions
    public String getResponse(String statement) { // gets responses that are either random, detecting time or keywords, or transforming statements
        String response = "";
        if (statement.indexOf("morning") >= 0)
        {
            response = "Great, an early goal to start the morning strong! Anything else you want to tell me about that?";
        }
        else if (findPhrase(statement, "noon", 0) >= 0)
        {
            response = "Nice, I look forward to noon. Anything else you want to tell me about that?";
        }
        else if (findPhrase(statement, "afternoon", 0) >= 0)
        {
            response = "That will make for a productive activity for the afternoon! What else can you tell me about that?";
        }
        else if (statement.indexOf("night") >= 0)
        {
            response = "Ooh, a late goal! Good idea.";
        }

        else if (statement.indexOf("no") >= 0)
        {
            response = "Why no?";
        }
        else if (statement.indexOf("yes") >= 0)
        {
            response = "Yes! You are doing so good!";
        }
        else if (statement.equalsIgnoreCase("Hi"))
        {
            response = "Hi! Want to set goals?";
        }

        // Responses which require transformations
        else if (findPhrase(statement, "I want", 0) >= 0)
        {
            response = transformGoalStatement(statement);
        }
        else
        {
            response = getRandomResponse();
        }
            return response;
        }
    public String transformGoalStatement(String statement) { // detects the goal using find phrase method and transforms the goal into a response
        String lastChar = statement.substring(statement.length() - 1);
        if (lastChar.equals(".")) {
            statement = statement.substring(0, statement.length() - 1);
        }
        int position = findPhrase(statement, "I want to", 0);
        String restOfStatement = statement.substring(position + 9);
        goals.add(restOfStatement.trim()); // adds goals to list
        return "That's a good goal! When would you like to" + restOfStatement + "? Type morning, noon, afternoon, or night";
    }


    private int findPhrase(String statement, String goal, int startPos) { // detect the phrase in a statement when method is called
        String phrase = statement.trim().toLowerCase();
        goal = goal.toLowerCase();

        // The only change to incorporate the startPos is in
        // the line below
        int position = phrase.indexOf(goal, startPos);

        // Refinement--make sure the goal isn't part of a
        // word
        while (position >= 0) {
            // Find the string of length 1 before and after
            // the word
            String before = " ", after = " ";
            if (position > 0) {
                before = phrase.substring(position - 1, position);
            }
            if (position + goal.length() < phrase.length()) {
                after = phrase.substring(position + goal.length(), position + goal.length() + 1);
            }

            // If before and after aren't letters, we've
            // found the word
            if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) // before is not a letter
                    && ((after.compareTo("a") < 0) || (after.compareTo("z") > 0))) {
                return position;
            }

            // The last position didn't work, so let's find
            // the next, if there isa one.
            position = phrase.indexOf(goal, position + 1);
        }
        return -1;
    }
    public ArrayList<String> getGoals() {
        return goals; // return goals in a list format once 'done' is typed
    }
    private String getRandomResponse() { // random responses when statement is not using keywords
        final int NUMBER_OF_RESPONSES = 6;
        int whichResponse = (int) (Math.random() * NUMBER_OF_RESPONSES);
        String response = "";
        String[] getRandomResponse = {"Interesting.", "Okay.", "I haven't heard that before.", "What else could you tell me about that?", "Where did you hear that?", "Please, go on."};
        response = (getRandomResponse[whichResponse]);
        return response;
    }
}