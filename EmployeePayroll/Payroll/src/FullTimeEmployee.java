import java.time.LocalDate;

public class FullTimeEmployee extends Employee{

    private double monthlySalary;
    // using super keyword to asign values to parent class
    public FullTimeEmployee(String fullName, String employeeId, Address adr, double monthlySalary) {
        super(fullName, employeeId, adr);
        this.monthlySalary =monthlySalary;
    }

    @Override
    public double calcSalary() {
    return monthlySalary;
    }
}
