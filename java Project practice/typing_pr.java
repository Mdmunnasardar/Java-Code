import java.util.Scanner;

public class typing_pr {

    // Function to calculate accuracy
    public static void calculateAccuracy(String sentence, String userSentence) {
        double correctChars = 0;
        double totalChars = sentence.length();
        
        // Calculate the number of correct characters
        for (int i = 0; i < Math.min(sentence.length(), userSentence.length()); i++) {
            if (sentence.charAt(i) == userSentence.charAt(i)) {
                correctChars++;
            }
        }
        
        double accuracy = (correctChars / totalChars) * 100;
        System.out.println("Accuracy: " + accuracy + "%");
    }

    // Function to calculate words per minute (WPM)
    public static double calculateWPM(String sentence, long timeInMillis) {
        double timeInSeconds = timeInMillis / 1000.0;
        double words = sentence.split(" ").length;
        return (words / timeInSeconds) * 60;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String sentence = "Hello this is a typing speed test example.";
        
        // Welcome message
        System.out.println("Welcome to the Typing Speed Test!");
        System.out.println("Your sentence is: ");
        System.out.println("\"" + sentence + "\"");
        
        // Wait for the user to press Enter to start the test
        System.out.println("Press Enter to start the test.");
        scanner.nextLine();
        
        // Start the timer
        long startTime = System.currentTimeMillis();
        
        // Get user input
        System.out.println("Start typing the sentence...");
        String userSentence = scanner.nextLine();
        
        // Stop the timer
        long endTime = System.currentTimeMillis();
        
        // Calculate time taken in milliseconds
        long timeTaken = endTime - startTime;
        
        // Calculate words per minute (WPM)
        double wpm = calculateWPM(sentence, timeTaken);
        
        // Calculate accuracy
        calculateAccuracy(sentence, userSentence);
        
        // Display the results
        System.out.println("Time Taken: " + (timeTaken / 1000.0) + " seconds");
        System.out.println("Words Per Minute (WPM): " + wpm);
        
        // Display if the user typed correctly
        if (userSentence.equals(sentence)) {
            System.out.println("Perfect! You typed the sentence correctly.");
        } else {
            System.out.println("Oops! There were some mistakes.");
        }
        
        scanner.close();
    }
}
