public class Food {
    private String name;
    private int energyIncrease;
    private int happinessIncrease;
    private int weightGain;

    //constructor
    public Food(String newName, int newEnergyIncrease, int newHappinessIncrease, int newWeightGain)
    {
        name = newName;
        energyIncrease = newEnergyIncrease;
        happinessIncrease = newHappinessIncrease;
        weightGain = newWeightGain;
    }

    public int getEnergyIncrease()
    {
        return energyIncrease;
    }
    public int getHappinessIncrease()
    {
        return happinessIncrease;
    }
    public int getWeightGain()
    {
        return weightGain;
    }
    public String getName()
    {
        return name;
    }
}
