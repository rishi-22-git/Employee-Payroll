import java.time.LocalDate;
import java.time.LocalDate;

public abstract class Employee {

    private String fullName; // using private modifier to increase security
    private String employeeId;
    private Address adr;


    public Employee(String fullName, String employeeId,Address adr) {
        this.fullName = fullName;
        this.employeeId = employeeId;

        this.adr = adr;
    }
    public Employee(){}  // no argument constructor for flexibility

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }



    public Address getAdr() {
        return adr;
    }

    public void setAdr(Address adr) {
        this.adr = adr;
    }
    public abstract double calcSalary();

         // overriding to string for accessibility
    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", adr=" + adr +
                '}';
    }
}
