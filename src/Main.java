// "Exercise_10_Poly_Payroll, Ready for Marking"
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Employee> emp = new ArrayList<>();

        emp.add(new Commissioned("Bob Loblaw", 40000));
        emp.add(new Salaried("Sue Me", 10));
        emp.add(new PieceWorker("Tina Zena", 1000));
        emp.add(new Manager("Richard Rich", 100000, 2000));

        for (Employee employee : emp)
        {
            System.out.println("Name: " + employee.getName());
            System.out.println("     Employee Type: " + employee.getClass().getSimpleName());
            System.out.printf("     Monthly Pay: $%.2f%n", employee.calculateMonthlyPay());
            System.out.println();
        }
    }
}