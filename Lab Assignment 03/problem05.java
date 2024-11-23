import java.util.Scanner;

public class problem05 {
    public static void main(String[] args) {
        int number;
        int fact = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = input.nextInt();

        for (int i = number; i > 0; i--) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);

        input.close();
    }
}
