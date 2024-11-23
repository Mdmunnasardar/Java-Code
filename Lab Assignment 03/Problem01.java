import java.util.Scanner;

public class problem01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elemnts:");

        int size = input.nextInt();
        int array[] = new int[size];

        System.out.print("Enter elements: ");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();

        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        System.out.println("Sum of array elements: " + sum);

        input.close();
    }
}