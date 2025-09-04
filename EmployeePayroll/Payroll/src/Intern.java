import java.time.LocalDate;

public class Intern extends Employee{
    private double workingHours;
    private double hourlySalary;

    public Intern(String fullName, String employeeId,  Address adr, double workingHours, double hourlySalary) {
        super(fullName, employeeId,  adr);
        this.workingHours = workingHours;
        this.hourlySalary = hourlySalary;
    }
    @Override
    public double calcSalary(){
        return workingHours * hourlySalary;  // salary of intern
    }
}
