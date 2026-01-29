public class VirtualPet4 {
    private String name;
    private int energyLevel;
    private int happinessLevel;
    private double weight;
    private int ageYears;
    private int ageMonths;

    // Constant Variables
    private static final int MINIMUM_WEIGHT = 5;
    private static final int MAXIMUM_LEVEL = 10;

    public VirtualPet4(String petName) //constructor with name
    {
        name = petName;
        energyLevel = 0;
        happinessLevel = 0;
        weight = MINIMUM_WEIGHT;
        ageMonths = 0;
        ageYears = 0;
    }

    public String getName()
    {
        return name;
    }
    public int getEnergyLevel()
    {
        return energyLevel;
    }
    public int getHappinessLevel()
    {
        return happinessLevel;
    }

    public void feed(Food f)
    {
        if (energyLevel != MAXIMUM_LEVEL)
        {
            energyLevel++;
        }
        weight++;
    }
    public String toString()
    {
        return name + "'s Information:\nEnergy: " + energyLevel + "\nHappiness: "
                + happinessLevel + "\nWeight: " + weight + " g\nAge: "
                + ageMonths + " months and " + ageYears + " years";
    }

    public boolean play(Game g)
    {
        if (happinessLevel != MAXIMUM_LEVEL)
            happinessLevel++;
        if (weight != MINIMUM_WEIGHT)
            weight--;
        if (g.isWinner()){
            return true;
        }
        else
            return false;
    }
    public void updateStatus()
    {
        if (energyLevel <= MAXIMUM_LEVEL && energyLevel > 0)
            energyLevel--;
        if (happinessLevel <= MAXIMUM_LEVEL && happinessLevel > 0)
            happinessLevel--;

        ageMonths++;
        if (ageMonths == 12) {
            ageYears++;
            ageMonths = 0;
        }
    }
}
