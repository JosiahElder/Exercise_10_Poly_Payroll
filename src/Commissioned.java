public class Commissioned extends Employee
{
    private double grossSales;

    public Commissioned(String name, double grossSales)
    {
        super(name);
        this.grossSales = grossSales;
    }

    @Override
    public double calculateMonthlyPay()
    {
        return 2000 + 0.1 * grossSales;
    }
}
