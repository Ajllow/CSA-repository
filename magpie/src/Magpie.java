public class Magpie
{
    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        int whichResponse = (int) (Math.random()*(NUMBER_OF_RESPONSES));
        String response = "";

        if (whichResponse == 0)
        {
            response = "Interesting.";
        }
        else if (whichResponse == 1)
        {
            response = "Okay.";
        }
        else if (whichResponse == 2)
        {
            response = "I haven't heard that before.";
        }
        else if (whichResponse == 3)
        {
            response = "What else could you tell me about that?";
        }
        else if (whichResponse == 4)
        {
            response = "that's cool";
        }
        else if (whichResponse == 5)
        {
            response = "huh.";
        }

        return response;
    }

    /**
     * Get a default greeting
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk. Type in \"Bye\" to end our chat.";
    }

    /**
     * Gives a response to a user statement
     *
     * @param statement the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        response = getRandomResponse();
            if (statement.indexOf("math") >= 0 || statement.indexOf("physics") >= 0 || statement.indexOf("science") >= 0)
                response = "is that your favorite subject?";
            else if (statement.indexOf("american school of the hague") >= 0)
                response = "I love that school!";
        return response;
    }
    private int findPhrase(String statement, String goal, int startPos)
    {
        String phrase = statement.toLowerCase();
        goal = goal.toLowerCase();
        int position = phrase.indexOf(goal, startPos);
        while (position >= 0)
        {
            String before = " ", after = " ";
            if (position > 0)
            {
                before = phrase.substring(position - 1, position);
            }
            if (position + goal.length() < phrase.length())
            {
                after = phrase.substring(position + goal.length(),
                        position + goal.length() + 1);
            }

            /* determine the values of index, before, and after at this point in the method. */
            if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) &&
                    ((after.compareTo("a") < 0) || (after.compareTo("z") > 0)))
            {
                return position;
            }
            position = phrase.indexOf(goal, position + 1);
        }
        return -1;
    }
}