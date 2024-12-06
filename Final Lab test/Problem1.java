import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the Array : ");

        int size = input.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter element: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        System.out.println("sum of element : " + sum);

        System.out.println("Enter first number ");
        double num1 = input.nextInt();
        System.out.println("Enter second number");
        double num2 = input.nextInt();

        double a = num1 + num2;
        System.out.println("Addition: " + a);
        double b = num1 - num2;
        System.out.println("sub: " + b);
        double c = num1 * num2;
        System.out.println("multi: " + c);
        double d = num1 / num2;
        System.out.println("div: " + d);

        if (c>sum) {
            System.out.println("sum of arry is greater than the multiplication result");
        } else {
            System.out.println("less than");
        }

    }
}
