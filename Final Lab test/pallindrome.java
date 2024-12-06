import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        int number, originalNumber, reversedNumber = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        
        originalNumber = number;

        
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        
        if (originalNumber == reversedNumber) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }

        input.close();
    }
}

