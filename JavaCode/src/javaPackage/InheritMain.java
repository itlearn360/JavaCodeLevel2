package javaPackage;

public class InheritMain {

	public static void main(String[] args) {
		// Create an Employee object
		Employee emp1 = new Employee("John Doe", 101, 50000);
		System.out.println("Employee Details:");
		emp1.displayDetails(); // Display details of a regular employee

		System.out.println("-------------------------");

		// Create a Manager object
		Manager mgr1 = new Manager("Alice Smith", 102, 75000, 5);
		System.out.println("Manager Details:");
		mgr1.displayDetails(); // Display details of a manager, including bonus and team size

	}

}

//Parent Class: Employee
class Employee {
	// Common attributes for all employees
	String name;
	int id;
	double salary;

	// Constructor to initialize employee details
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	// Method to display employee details
	public void displayDetails() {
		System.out.println("Employee ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: $" + salary);
	}
}

//Child Class: Manager
class Manager extends Employee {
	// Additional attribute for managers
	int teamSize;

	// Constructor to initialize manager details (uses Employee constructor)
	public Manager(String name, int id, double salary, int teamSize) {
		// Call the parent class constructor to initialize common attributes
		super(name, id, salary);
		this.teamSize = teamSize;
	}

	// Method to calculate bonus based on team size
	public double calculateBonus() {
		return salary * 0.1 * teamSize; // Bonus is 10% of salary per team member
	}

	// Override the displayDetails method to include team size and bonus
	@Override
	public void displayDetails() {
		super.displayDetails(); // Call the parent class method to display common details
		System.out.println("Team Size: " + teamSize);
		System.out.println("Bonus: $" + calculateBonus());
	}
}