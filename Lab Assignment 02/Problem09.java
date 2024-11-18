import java.util.Scanner;

public class Problem09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = input.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        int last = array[size - 1];
        for (int i = size - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = last;

        System.out.print("Rotated array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        input.close();
    }
}


