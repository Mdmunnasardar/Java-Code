import java.util.Scanner;

public class Without_arraySize {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        // Prompt the user
        System.out.println("Sample Input:\nEnter elements (end input with -1):");

        while (true) {
            int num = input.nextInt(); // Read input
            if (num == -1) { // Sentinel value to stop input
                break;
            }
            sum += num; // Add the input to the sum
        }

        // Display the result
        System.out.println("Sample Output:\nSum of array elements: " + sum);

        input.close(); // Close the scanner
    }
}


