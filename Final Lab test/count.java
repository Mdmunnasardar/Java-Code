import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Asking the user for the size of the array
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        
        // Creating the array
        int[] number = new int[size];
        
        // Populating the array
        System.out.println("Enter " + size + " numbers: ");
        for (int i = 0; i < size; i++) {
            number[i] = input.nextInt();
        }

        // Displaying the array elements
        System.out.println("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();

        // Asking for the target element
        System.out.print("Enter the element to count: ");
        int target = input.nextInt();

        // Counting occurrences of the target element
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == target) {
                count++;
            }
        }

        // Displaying the result
        System.out.println("The element " + target + " appears " + count + " time(s) in the array.");

        // Closing the scanner
        input.close();
    }
}
