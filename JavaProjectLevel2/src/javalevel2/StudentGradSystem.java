package javalevel2;

import java.util.Map;
import java.util.TreeMap;

public class StudentGradSystem {

	public static void main(String[] args) {
		// Create a TreeMap to store student IDs and their grades
        TreeMap<Integer, String> studentGrades = new TreeMap<>();

        // 1. Add student IDs and grades to the TreeMap
        studentGrades.put(102, "B");
        studentGrades.put(101, "A");
        studentGrades.put(104, "C");
        studentGrades.put(103, "A");

        // Display all student grades sorted by student ID
        System.out.println("Student Grades (sorted by ID): " + studentGrades);

        // 2. Retrieve the grade of a specific student (e.g., student ID 101)
        int studentID = 101;
        String grade = studentGrades.get(studentID);
        System.out.println("Grade for student ID " + studentID + ": " + grade);

        // 3. Remove a student from the system (e.g., student ID 104)
        studentGrades.remove(104);
        System.out.println("After removing student ID 104: " + studentGrades);

        // 4. Display the total number of students in the system
        System.out.println("Total students: " + studentGrades.size());

        // 5. Display all students and their grades using a loop
        System.out.println("All student records:");
        for (Map.Entry<Integer, String> entry : studentGrades.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Grade: " + entry.getValue());
        }

	}

}
