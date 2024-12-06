import java.util.Scanner;

public class reversedNUmber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter arry size: ");

        int size = input.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the element: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("reversed: ");

        for (int i = size - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }

        input.close();
    }
}