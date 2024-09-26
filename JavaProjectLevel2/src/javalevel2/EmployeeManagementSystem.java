package javalevel2;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		// Create a HashMap to store employee IDs and their names
        Map<Integer, String> employeeMap = new HashMap<>();

        // 1. Add employee IDs and names to the HashMap
        employeeMap.put(101, "Alice Johnson");
        employeeMap.put(102, "Bob Smith");
        employeeMap.put(103, "Charlie Brown");

        // Display all employee records
        System.out.println("Employee Records: " + employeeMap);

        // 2. Look up an employee's name by their ID
        int employeeID = 102;
        String employeeName = employeeMap.get(employeeID);
        System.out.println("Employee with ID " + employeeID + ": " + employeeName);

        // 3. Remove an employee who left the company
        employeeMap.remove(103);
        System.out.println("After removing employee ID 103: " + employeeMap);

        // 4. Display the total number of employees
        System.out.println("Total employees: " + employeeMap.size());

        // 5. Loop through and display all employee records
        System.out.println("All employees:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

	}

}
