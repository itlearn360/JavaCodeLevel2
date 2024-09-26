package javalevel2;

import java.util.LinkedHashSet;
import java.util.Set;

public class TaskManagementSystem {

	public static void main(String[] args) {
		// Create a LinkedHashSet to store tasks
        Set<String> tasks = new LinkedHashSet<>();

        // 1. Add tasks to the LinkedHashSet
        tasks.add("Complete project report");
        tasks.add("Attend team meeting");
        tasks.add("Submit timesheet");
        tasks.add("Complete project report"); // Duplicate, will not be added

        // Display all tasks in the order they were added
        System.out.println("Current tasks: " + tasks);

        // 2. Check if a specific task is in the task list
        String taskToCheck = "Attend team meeting";
        boolean isTaskPresent = tasks.contains(taskToCheck);
        System.out.println("Is \"" + taskToCheck + "\" present? " + isTaskPresent);

        // 3. Remove a task that has been completed
        tasks.remove("Submit timesheet");
        System.out.println("After completing a task: " + tasks);

        // 4. Display the total number of tasks remaining
        System.out.println("Total number of tasks: " + tasks.size());

        // 5. Display all tasks using a loop, in the order they were added
        System.out.println("Tasks to be done:");
        for (String task : tasks) {
            System.out.println(task);
        }

	}

}
