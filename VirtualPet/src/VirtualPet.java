public class VirtualPet {
    private String name;
    private int energyLevel;
    private int happinessLevel;
    private double weight;
    private int ageYears;
    private int ageMonths;

    public VirtualPet(String n) //constructor with name
    {
        name = n;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return name + "'s information: Energy level: " + energyLevel + ", Happiness level: "
        + happinessLevel+ " weight: " + weight + ", ageYears: " + ageYears + ", ageMonths: " + ageMonths;
    }

    public void feed()
    {
        if (getEnergyLevel() <= 10)
        {
            energyLevel = getEnergyLevel() + 1;
        }
        weight = weight + 1;
    }
    public int getEnergyLevel()
    {
        return energyLevel;
    }
    public int getHappinessLevel()
    {
        return happinessLevel;
    }
    public void play()
    {
        if (getHappinessLevel() <= 10)
            happinessLevel = getHappinessLevel() + 1;
        if (weight > 5)
            weight = weight - 1;
    }
    public void updateStatus()
    {
        if (getEnergyLevel() <= 10 && getEnergyLevel() >= 0)
            energyLevel = getEnergyLevel() -1;
        if (getHappinessLevel() <= 10 && getHappinessLevel() >= 0)
            happinessLevel = getHappinessLevel() -1;

        ageMonths = ageMonths + 1; // how to change years every 12 months?
        ageYears = ageYears + 1;
    }
}
