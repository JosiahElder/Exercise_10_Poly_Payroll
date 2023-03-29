public class Salaried extends Employee
{
    private int yearsOfService;

    public Salaried(String name, int yearsOfService)
    {
        super(name);
        this.yearsOfService = yearsOfService;
    }

    @Override
    public double calculateMonthlyPay()
    {
        return 50000 / 12  + 0.01 * yearsOfService;
    }
}
