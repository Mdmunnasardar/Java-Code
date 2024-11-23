import java.util.Scanner;

public class problem07 {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = input.nextInt();

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;

        }
        System.out.println("Sum of digits: " + sum);

        input.close();

    }
}
