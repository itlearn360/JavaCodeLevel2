package javalevel2;

import java.util.ArrayList;

public class StudentManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub// Create an ArrayList to store student names
        ArrayList<String> students = new ArrayList<>();

        // 1. Add students to the list
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("Diana");

        // Display all students
        System.out.println("Students enrolled: " + students);

        // 2. Remove a student who dropped out (e.g., Charlie drops out)
        students.remove("Charlie");
        System.out.println("After removing a student: " + students);

        // 3. Access and display a specific student by their position (index)
        System.out.println("First student: " + students.get(0)); // Outputs Alice

        // 4. Check the number of students enrolled
        System.out.println("Total number of students: " + students.size());

        // 5. Modify the name of a student (e.g., Change "Diana" to "David")
        students.set(2, "David");
        System.out.println("Updated student list: " + students);

        // 6. Check if a particular student is in the list
        boolean isBobEnrolled = students.contains("Bob");
        System.out.println("Is Bob enrolled? " + isBobEnrolled);
	}

}
