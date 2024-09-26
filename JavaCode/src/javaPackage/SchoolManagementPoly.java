package javaPackage;

public class SchoolManagementPoly {

	public static void main(String[] args) {
		// Create objects of different student types
        Student student1 = new PrimaryStudent();
        Student student2 = new HighSchoolStudent();
        Student student3 = new CollegeStudent();

        // Method Overriding: Call describe method (Polymorphism: each subclass provides its own implementation)
        student1.describe();
        student2.describe();
        student3.describe();

        // Method Overloading: Calculate study hours
        System.out.println("Primary student study hours (5 subjects): " + student1.studyHours(5));
        System.out.println("High school student study hours (5 subjects): " + student2.studyHours(5));
        System.out.println("College student study hours (5 subjects, 4 hours per subject): " + student3.studyHours(5, 4));

	}

}

//Parent class: Student
class Student {
 // Overridden method to describe the student (Method Overriding)
 public void describe() {
     System.out.println("I am a student.");
 }

 // Overloaded method to calculate study hours (Method Overloading)
 public int studyHours(int subjects) {
     return subjects * 2;  // Assuming each subject takes 2 hours
 }

 public int studyHours(int subjects, int hoursPerSubject) {
     return subjects * hoursPerSubject;
 }
}

//Subclass: PrimaryStudent
class PrimaryStudent extends Student {
 // Override describe method for PrimaryStudent
 @Override
 public void describe() {
     System.out.println("I am a primary school student.");
 }

 // Override studyHours method if needed (optional)
}

//Subclass: HighSchoolStudent
class HighSchoolStudent extends Student {
 // Override describe method for HighSchoolStudent
 @Override
 public void describe() {
     System.out.println("I am a high school student.");
 }

 // High school students spend more hours, so override studyHours
 @Override
 public int studyHours(int subjects) {
     return subjects * 3;  // Assuming each subject takes 3 hours for high school students
 }
}

//Subclass: CollegeStudent
class CollegeStudent extends Student {
 // Override describe method for CollegeStudent
 @Override
 public void describe() {
     System.out.println("I am a college student.");
 }

 // College students may have more flexibility, but we use the parent method for studyHours
}
