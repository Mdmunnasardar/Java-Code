import java.util.Arrays;
import java.util.Scanner;

public class findminimum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter array elemnt: ");

        int size = input.nextInt();
        int number[] = new int[size];
        System.out.println("enter element: ");
        for (int i = 0; i < size; i++) {
            number[i] = input.nextInt();
        }

        //finding minimum by sort.just array first index print which is 0..
        Arrays.sort(number);
        System.out.println("Second largest element: " + number[0]);
        input.close();
    }

}
