package company;

public class Donor {

    private String name;
    private double amount;

    public Donor(String n, double a)
    {
        this.name =n;
        this.amount = a;
    }
public void setName(String n)
{
    name = n;
}
    public void setAmount(double a)
    {
      amount = a;
    }

    public String getName()
    {
        return name;
    }

    public double getAmount()
    {

        return amount;
    }
    public String toString()
    {
        return name + " contributed "+ amount+"$.";
    }
}
