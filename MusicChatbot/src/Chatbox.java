public class Chatbox {
    public String getGreeting() {
        return "Hello, what is your first goal? It can be for today, or any other day. Just say 'I want to...'";
    }
    public String getResponse(String statement) {
        String response = "";
        if (statement.indexOf("this week") >= 0)
        {
            response = "Okay, I'll make sure to track your progress this week!";
        }
        else if (statement.indexOf("tomorrow") >= 0)
        {
            response = "Nice, I look forward to tomorrow.";
        }
        else if (statement.indexOf("today") >= 0)
        {
            response = "Today will be a very productive day.";
        }

        // Responses which require transformations
        else if (findPhrase(statement, "I want", 0) >= 0)
        {
            response = transformGoalStatement(statement);
        }
            return response;
        }
    private String transformGoalStatement(String statement) {
        String lastChar = statement.substring(statement.length() - 1);
        if (lastChar.equals(".")) {
            statement = statement.substring(0, statement.length() - 1);
        }
        int position = findPhrase(statement, "I want to", 0);
        String restOfStatement = statement.substring(position + 9);
        return "That's a good goal! When would you like to" + restOfStatement + "?";
    }


    private int findPhrase(String statement, String goal, int startPos) {
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
            // the next, if there is one.
            position = phrase.indexOf(goal, position + 1);
        }
        return -1;
    }
    private String goals()
    {
        String goals = "";
        String[] data = goals.split(",");
        return data[0];
    }
}