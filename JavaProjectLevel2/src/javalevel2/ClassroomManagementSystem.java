package javalevel2;

import java.util.HashSet;
import java.util.Set;

public class ClassroomManagementSystem {

	public static void main(String[] args) {
		 // Create a Set to store student IDs
        Set<Integer> studentIDs = new HashSet<>();

        // 1. Add student IDs to the set
        studentIDs.add(101);
        studentIDs.add(102);
        studentIDs.add(103);
        studentIDs.add(101); // Duplicate, will not be added

        // Display all registered students
        System.out.println("Registered student IDs: " + studentIDs);

        // 2. Check if a specific student is already registered
        int studentToCheck = 102;
        boolean isRegistered = studentIDs.contains(studentToCheck);
        System.out.println("Is student ID " + studentToCheck + " registered? " + isRegistered);

        // 3. Remove a student who dropped the course
        studentIDs.remove(103);
        System.out.println("After removing student ID 103: " + studentIDs);

        // 4. Display the total number of registered students
        System.out.println("Total number of registered students: " + studentIDs.size());

        // 5. Loop through and display all student IDs
        System.out.println("All registered students:");
        for (int studentID : studentIDs) {
            System.out.println("Student ID: " + studentID);
        }
	}

}
