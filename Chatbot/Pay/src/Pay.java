public class Pay
{
    //instance variables
    private double hoursWorked;
    private double payRate;
    private double grossPay;

    public static void main(String[] args)
    {
        Pay emp1 = new Pay();
        Pay emp2 = new Pay(36);

        emp1.setHours(48);
        emp2.setPayRate(15.6);

        emp1.calcGrossPay();
        emp2.calcGrossPay();

        System.out.println(emp1);
        System.out.println(emp2);
    }
    public Pay()
    {
        hoursWorked = 0;
        payRate = 7.5;
    }
    public Pay(double initHoursWorked)
    {
        hoursWorked = initHoursWorked;
    }

    public double getHours()
    {
        return hoursWorked;
    }
    public double getPayRate()
    {
        return payRate;
    }
    public double getGrossPay()
    {
        return grossPay;
    }

    public double calcGrossPay()
    {
        grossPay = hoursWorked * payRate;
        return grossPay;
    }

    public void setHours(double h)
    {
        hoursWorked = h;
    }
    public void setPayRate(double p)
    {
        payRate = p;
    }
    public String toString()
    {
        return "Hours worked: $" + hoursWorked + ", Pay rate: $" + payRate + ", Gross pay: $" + grossPay;
    }
}