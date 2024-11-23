import java.util.Scanner;

public class problem08 {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i = 1; i < 10; i++) {
            int multi = number * i;

            System.out.println(number + "*" + i + "=" + multi);

        }
        input.close();
    }
}