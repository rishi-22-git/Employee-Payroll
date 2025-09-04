import java.util.ArrayList;

public class PayrollSystem {

    private ArrayList<Employee> employeList; // used to store data of employes in form of array list
                                                // each employee data is stored in separate index if we use array then we need to specify the size of array
    // but as we don't know the number of employees working we are using ArrayList<Employee>

    public PayrollSystem(){
        employeList = new ArrayList<>(); // as this constructor wiil run an object of array list will be fornmed
        // this is object creation and above was object declaration
    }
    public void addEmployee(Employee employee){
        employeList.add(employee); // adding employee data into array list
    }
    // removing an employee/inter if he/she resigns

    public void removeEmployee(String employeeId){
        Employee removeEmployee = null;
        for(Employee e : employeList){
            if(employeeId.equals( e.getEmployeeId())){
                removeEmployee = e;// assign  value to that index of array list which matches
                break;
            }
        }
        if (removeEmployee != null){
            employeList.remove(removeEmployee);
        }
    }

        // Displaying all Employees information

    public void displayInfo(){
        for(Employee e : employeList){
            System.out.println(e);
        }
    }



}
