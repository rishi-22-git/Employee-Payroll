public class Main {
    public static void main(String[] args) {

        PayrollSystem ps = new PayrollSystem();
    // interns working

        // Intern 1
        Address adrInt1 = new Address();
        adrInt1.setLine1("Minal Residency");
        adrInt1.setLine2("Gate 4, Bhopal");
        adrInt1.setPostalCode(462033);
        adrInt1.setCityName("Bhopal");
        Employee int1 = new Intern("Kaavya Shrivastava", "int101", adrInt1, 50, 80);

        // Intern 2 - Indore
        Address adrInt2 = new Address("Vijay Nagar", "Near C21 Mall", 452010, "Indore");
        Employee int2 = new Intern("Aman Verma", "int102", adrInt2, 55, 82);
        ps.addEmployee(int2);

// Intern 3 - Lucknow
        Address adrInt3 = new Address("Hazratganj", "Near Sahara Ganj Mall", 226001, "Lucknow");
        Employee int3 = new Intern("Ritika Sharma", "int103", adrInt3, 60, 85);
        ps.addEmployee(int3);

// Intern 4 - Patna
        Address adrInt4 = new Address("Bailey Road", "Near Patna Zoo", 800001, "Patna");
        Employee int4 = new Intern("Siddharth Singh", "int104", adrInt4, 52, 78);
        ps.addEmployee(int4);

// Intern 5 - Nagpur
        Address adrInt5 = new Address("Dharampeth", "Opposite Coffee House", 440010, "Nagpur");
        Employee int5 = new Intern("Priya Gupta", "int105", adrInt5, 58, 83);
        ps.addEmployee(int5);

// Intern 6 - Chandigarh
        Address adrInt6 = new Address("Sector 17", "Near ISBT", 160017, "Chandigarh");
        Employee int6 = new Intern("Rohan Mehta", "int106", adrInt6, 54, 81);
        ps.addEmployee(int6);

// Intern 7 - Jaipur
        Address adrInt7 = new Address("MI Road", "Near Panch Batti", 302001, "Jaipur");
        Employee int7 = new Intern("Sneha Patel", "int107", adrInt7, 57, 84);
        ps.addEmployee(int7);

// Intern 8 - Kanpur
        Address adrInt8 = new Address("Arya Nagar", "Near Swaroop Nagar", 208002, "Kanpur");
        Employee int8 = new Intern("Kunal Rajput", "int108", adrInt8, 53, 79);
        ps.addEmployee(int8);

// Intern 9 - Surat
        Address adrInt9 = new Address("Ring Road", "Near Textile Market", 395002, "Surat");
        Employee int9 = new Intern("Shreya Tiwari", "int109", adrInt9, 61, 86);
        ps.addEmployee(int9);

// Intern 10 - Ranchi
        Address adrInt10 = new Address("Kanke Road", "Near RIMS", 834008, "Ranchi");
        Employee int10 = new Intern("Aditya Mishra", "int110", adrInt10, 56, 82);
        ps.addEmployee(int10);
      // full time employee working

        // Full-Time Employee 1 - Pune
        Address adrEmp1 = new Address("Himalya Nagar", "Wagholi", 411014, "Pune");
        Employee emp1 = new FullTimeEmployee("Rahul Yadav", "exp101", adrEmp1, 50000);
        ps.addEmployee(emp1);

// Full-Time Employee 2 - Delhi
        Address adrEmp2 = new Address("Dwarka Sector 7", "Near Metro Station", 110075, "Delhi");
        Employee emp2 = new FullTimeEmployee("Ananya Sharma", "exp102", adrEmp2, 60000);
        ps.addEmployee(emp2);

// Full-Time Employee 3 - Mumbai
        Address adrEmp3 = new Address("Andheri East", "Opposite Metro Station", 400069, "Mumbai");
        Employee emp3 = new FullTimeEmployee("Rohit Kapoor", "exp103", adrEmp3, 65000);
        ps.addEmployee(emp3);

// Full-Time Employee 4 - Bengaluru
        Address adrEmp4 = new Address("Whitefield", "Near ITPL", 560066, "Bengaluru");
        Employee emp4 = new FullTimeEmployee("Megha Iyer", "exp104", adrEmp4, 70000);
        ps.addEmployee(emp4);

// Full-Time Employee 5 - Chennai
        Address adrEmp5 = new Address("Velachery", "Phoenix Mall Road", 600042, "Chennai");
        Employee emp5 = new FullTimeEmployee("Suresh Reddy", "exp105", adrEmp5, 62000);
        ps.addEmployee(emp5);

// Full-Time Employee 6 - Hyderabad
        Address adrEmp6 = new Address("Gachibowli", "Near Infosys Campus", 500032, "Hyderabad");
        Employee emp6 = new FullTimeEmployee("Neha Agarwal", "exp106", adrEmp6, 72000);
        ps.addEmployee(emp6);

// Full-Time Employee 7 - Kolkata
        Address adrEmp7 = new Address("Salt Lake Sector V", "Near Technopolis", 700091, "Kolkata");
        Employee emp7 = new FullTimeEmployee("Arjun Sen", "exp107", adrEmp7, 58000);
        ps.addEmployee(emp7);

// Full-Time Employee 8 - Jaipur
        Address adrEmp8 = new Address("Malviya Nagar", "Near World Trade Park", 302017, "Jaipur");
        Employee emp8 = new FullTimeEmployee("Pooja Choudhary", "exp108", adrEmp8, 56000);
        ps.addEmployee(emp8);

// Full-Time Employee 9 - Ahmedabad
        Address adrEmp9 = new Address("SG Highway", "Near ISKCON Temple", 380015, "Ahmedabad");
        Employee emp9 = new FullTimeEmployee("Vivek Patel", "exp109", adrEmp9, 64000);
        ps.addEmployee(emp9);

// Full-Time Employee 10 - Lucknow
        Address adrEmp10 = new Address("Gomti Nagar", "Near Wave Mall", 226010, "Lucknow");
        Employee emp10 = new FullTimeEmployee("Shruti Verma", "exp110", adrEmp10, 59000);
        ps.addEmployee(emp10);

        ps.displayInfo();
        System.out.println(emp2.getFullName());
        System.out.println(emp2.calcSalary());

    ps.removeEmployee("emp1");
        ps.displayInfo();



    }
}
