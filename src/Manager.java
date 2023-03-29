public class Manager extends Employee
{
    private double baseSalary;
    private double monthlyBonus;

    public Manager(String name, double baseSalary, double monthlyBonus)
    {
        super(name);
        this.baseSalary = baseSalary;
        this.monthlyBonus = monthlyBonus;
    }

    @Override
    public double calculateMonthlyPay()
    {
        return baseSalary / 12 + monthlyBonus;
    }
}