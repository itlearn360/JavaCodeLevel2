package javaPackage;

public class EmployeeDetails {

	String name;
    int id;
    String department;
    double salary;

    // Method to set the employee's details
    public void setDetails(String empName, int empId, String empDepartment, double empSalary) {
        name = empName;
        id = empId;
        department = empDepartment;
        salary = empSalary;
    }
    
 // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
        System.out.println("-------------------------");
    }

    // Method to give a raise
    public void giveRaise(double amount) {
        salary += amount;
        System.out.println(name + " has been given a raise of $" + amount);
        System.out.println("New Salary: $" + salary);
        System.out.println("-------------------------");
    }
    
	public static void main(String[] args) {
		// Creating employee objects
		// Create employee objects
        EmployeeDetails emp1 = new EmployeeDetails();
        EmployeeDetails emp2 = new EmployeeDetails();

        // Set employee details using the setDetails method
        emp1.setDetails("John", 101, "HR", 50000);
        emp2.setDetails("Sara", 102, "IT", 70000);

        // Display employee details
        emp1.displayDetails();
        emp2.displayDetails();

        // Give a raise to John
        emp1.giveRaise(5000);

        // Display John's updated details
        emp1.displayDetails();
        
    }

}
