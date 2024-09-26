package javalevel2;

public class ThreadMain {

	public static void main(String[] args) {
		// Creating two Runnable tasks
        MyTask task1 = new MyTask("Task 1");
        MyTask task2 = new MyTask("Task 2");

        // Creating two threads to run the tasks
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // Starting both threads
        thread1.start();
        thread2.start();

	}

}


//Class that implements Runnable to define the task
class MyTask implements Runnable {
 private String taskName;

 // Constructor to initialize the task name
 public MyTask(String taskName) {
     this.taskName = taskName;
 }

 // The run method contains the code that will be executed by the thread
 @Override
 public void run() {
     System.out.println(taskName + " is running");

     try {
         // Simulating some work with sleep
         Thread.sleep(2000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }

     System.out.println(taskName + " has completed");
 }
}
