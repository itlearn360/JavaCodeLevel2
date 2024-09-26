package javalevel2;

public class DownloadManager {

	public static void main(String[] args) {
		// List of files to download
        String[] files = {"file1.zip", "file2.zip", "file3.zip", "file4.zip"};

        // Create and start a thread for each file download
        for (String file : files) {
            Thread downloadThread = new Thread(new FileDownload(file));
            downloadThread.start();
        }

        System.out.println("All downloads started...");

	}

}


//Class representing a file download task
class FileDownload implements Runnable {
 private String fileName;

 // Constructor to initialize the file name
 public FileDownload(String fileName) {
     this.fileName = fileName;
 }

 // This method simulates the file download process
 @Override
 public void run() {
     System.out.println("Downloading file: " + fileName);

     try {
         // Simulate time taken to download a file (e.g., 3 seconds)
         Thread.sleep(3000); // Sleep for 3 seconds to simulate download time
     } catch (InterruptedException e) {
         e.printStackTrace();
     }

     System.out.println("Download completed: " + fileName);
 }
}