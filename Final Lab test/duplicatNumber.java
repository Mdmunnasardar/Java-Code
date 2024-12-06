import java.util.LinkedHashSet;
import java.util.Scanner;

public class duplicatNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array: ");

        int size = input.nextInt();
        int number[] = new int[size];

        System.out.print("Enter the number of array element: ");

        for (int i = 0; i < size; i++) {
            number[i] = input.nextInt();

        }
        LinkedHashSet<Integer> uniqueElements = new LinkedHashSet<>();
        for (int num : number)
            uniqueElements.add(num);
        System.out.println("Array without duplicates: ");
        for (int num : uniqueElements)
            System.out.println(num + " ");
       
        


            input.close();
    }
}

