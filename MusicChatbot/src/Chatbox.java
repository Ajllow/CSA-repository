public class Chatbox {
    public String getGreeting() {
       return "Hello, would you like to get music recommendations? (yes/no)";
    }
    public String getResponse(String statement) {
        String response = "";
        if (statement.equalsIgnoreCase("Yes"))
        {
            response = "Okay. First question. What genre of music do you like?";
                if (statement.indexOf("pop") >= 0)
                    response = "Cool.";
        }
        return response;
    }
}
