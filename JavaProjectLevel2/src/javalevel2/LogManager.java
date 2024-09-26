package javalevel2;

public class LogManager {

	public static void main(String[] args) {
		// Using StringBuilder for efficient string manipulation
        StringBuilder log = new StringBuilder();

        // Simulate adding log entries
        log.append("INFO: Application started\n");
        log.append("DEBUG: Initializing variables\n");
        log.append("ERROR: Null pointer exception occurred\n");
        log.append("WARN: Low memory warning\n");
        log.append("INFO: Application terminated\n");

        // Convert the StringBuilder to a String and display the final log
        String finalLog = log.toString();
        System.out.println("Final Log Messages:\n" + finalLog);

	}

}
