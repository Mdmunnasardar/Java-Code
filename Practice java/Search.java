import java.util.Scanner;

public class Search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the size of the array
        int size = sc.nextInt(); 
        int number[] = new int[size];

        // Input array elements
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        // Input the number to search for
        int x = sc.nextInt(); 

        // Search and output
        boolean found = false; // Flag to check if the number is found
        for (int i = 0; i < size; i++) {
            if (number[i] == x) {
                System.out.println("X found in array at index: " + i);
                found = true;
                break; // Stop searching after finding the number
            }
        }

        // If the number is not found
        if (!found) {
            System.out.println("X not found in array.");
        }

        sc.close(); // Close the scanner
    }
}
