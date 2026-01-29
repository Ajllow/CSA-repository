public class Game {
    private String name;
    private int happinessIncr;
    private int weightDecr;

    public String getName() {
        return name;
    }
    public int getHappinessIncr() {
        return happinessIncr;
    }
    public int getWeightDecr() {
        return weightDecr;
    }

    public Game(String newName, int newHappinessIncr, int newWeightDecr){
        name = newName;
        happinessIncr = newHappinessIncr;
        weightDecr = newWeightDecr;
    }

    public boolean isWinner()
    {
        return Math.random() < 0.5;
    }

}
