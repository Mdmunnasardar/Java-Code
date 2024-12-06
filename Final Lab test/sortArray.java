import java.util.Arrays;
import java.util.Scanner;

public class sortArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter array elemnt: ");

        int size = input.nextInt();
        int number[] = new int[size];
        System.out.print("enter element: ");
        for (int i = 0; i < size; i++) {
            number[i] = input.nextInt();
        }

        
        Arrays.sort(number);
        System.out.println("Sort Array: ");
        for (int i = 0; i < size; i++) {
          System.out.print(number[i]+" ");
        }

        input.close();
    }
}
