import java.util.Scanner;

public class problem06 {
    public static void main(String[] args) {

        int number;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
        input.close();
    }
}
