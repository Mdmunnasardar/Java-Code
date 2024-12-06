import java.util.Scanner;

public class Marge2Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of array size one : ");

        int size1 = input.nextInt();
        int number1[] = new int[size1];
        System.out.println("Enter the number of Element size one is: ");
        for (int i = 0; i < size1; i++) {
            number1[i] = input.nextInt();

        }

        System.out.println("Enter the number of array size two : ");

        int size2 = input.nextInt();
        int number2[] = new int[size2];
        System.out.println("Enter the number of Element size two is: ");
        for (int i = 0; i < size2; i++) {
            number2[i] = input.nextInt();
        }
        int margeArray[] = new int[size1 + size2];

        for (int i = 0; i < size1; i++) {
            margeArray[i] = number1[i];
        }

        for (int i = 0; i < size2; i++) {
            margeArray[size1 + i] = number2[i];
        }

        System.out.println("Marge Array:");

        for (int i = 0; i < margeArray.length; i++) {
            System.out.println(margeArray[i] + " ");
        }

        input.close();
    }
}
