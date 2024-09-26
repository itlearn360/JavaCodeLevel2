package javalevel2;

import java.util.ArrayList;
import java.util.List;

public class ToDoListManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a List to store tasks
        List<String> toDoList = new ArrayList<>();

        // 1. Add tasks to the To-Do list
        toDoList.add("Buy groceries");
        toDoList.add("Finish homework");
        toDoList.add("Clean the house");
        toDoList.add("Call mom");

        // Display the list of tasks
        System.out.println("To-Do List: " + toDoList);

        // 2. Remove a task (task completed)
        toDoList.remove("Finish homework"); // Remove by element
        System.out.println("After completing a task: " + toDoList);

        // 3. Modify a task (update task description)
        toDoList.set(1, "Clean the entire house"); // Change the second task
        System.out.println("Updated To-Do List: " + toDoList);

        // 4. Check if a specific task exists
        boolean hasTask = toDoList.contains("Buy groceries");
        System.out.println("Is 'Buy groceries' on the list? " + hasTask);

        // 5. View a specific task by index
        String taskAtIndex = toDoList.get(0);
        System.out.println("First task on the list: " + taskAtIndex);

        // 6. Display the total number of tasks
        int totalTasks = toDoList.size();
        System.out.println("Total tasks left: " + totalTasks);
	}

}
