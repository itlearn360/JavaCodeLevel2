package javalevel2;

public class LogManagerWithoutThreads {

	public static void main(String[] args) {
		// Using StringBuffer for string manipulation
        StringBuffer log = new StringBuffer();

        // Simulate adding log entries sequentially
        log.append("INFO: User logged in\n");
        log.append("ACTION: User opened dashboard\n");
        log.append("ACTION: User edited profile\n");
        log.append("INFO: User logged out\n");

        // Convert the StringBuffer to a String and display the final log
        String finalLog = log.toString();
        System.out.println("Final Log Messages:\n" + finalLog);

	}

}
