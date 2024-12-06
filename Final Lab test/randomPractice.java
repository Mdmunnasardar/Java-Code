import java.util.Scanner;

public class randomPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the arrray size: ");

        int size = input.nextInt();
        int arr[] = new int[size];

        // input for user
        System.out.println("enter the number: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        // output showing array
        // for(int i=0;i<size;i++){
        // System.out.print(arr[i]);

        int max = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }

        }

        int min = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        System.out.println("enter target:");
        int target = input.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {

                count++;
            }
        }

        System.out.println("The number is large: " + max);
        System.out.println("minimum Number : " + min);
        System.out.println("sum of Array: " + sum);
        System.out.println(count + " time(s) in the array.");
        input.close();

    }
}
