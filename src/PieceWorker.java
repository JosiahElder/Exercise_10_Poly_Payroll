public class PieceWorker extends Employee
{
    private int unitsProduced;

    public PieceWorker(String name, int unitsProduced)
    {
        super(name);
        this.unitsProduced = unitsProduced;
    }

    @Override
    public double calculateMonthlyPay()
    {
        return unitsProduced;
    }
}