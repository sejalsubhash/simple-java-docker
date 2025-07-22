import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        // Record the start time
        long startTime = System.currentTimeMillis();

        // Get and format current date and time
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        // Display a greeting with the current formatted date
        System.out.println("👋 Hello, Docker World!");
        System.out.println("📅 Current Date & Time: " + formatter.format(currentDate));

        // Display system information
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        String architecture = System.getProperty("os.arch");
        String userName = System.getProperty("user.name");

        System.out.println("\n🖥️ System Info:");
        System.out.println("   OS: " + osName + " " + osVersion);
        System.out.println("   Architecture: " + architecture);
        System.out.println("   User: " + userName);

        // Simulate work (optional delay)
        try {
            Thread.sleep(1000); // 1 second delay
        } catch (InterruptedException e) {
            System.out.println("Execution interrupted.");
        }

        // Record the end time and calculate duration
        long endTime = System.currentTimeMillis();
        System.out.println("\n⏱️ Execution Time: " + (endTime - startTime) + " ms");
    }
}

