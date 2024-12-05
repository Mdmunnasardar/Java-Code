import java.util.Scanner;

public class SumofArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of element: ");

        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
           
        }
        int arr[] = new int[number];
        System.out.println("the Array Element: " + number);

        for (int i = 0; i < number; i++) {
            arr[i] = input.nextInt();

        }
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum += arr[i];

        }
       int max=arr[0];
       for(int i=0;i<number;i++){
        if(arr[i]>max){
            max=arr[i];
        }
       }

        System.out.println("sum of arrray elemnt: " + sum);
        System.out.println("large number: "+max);
        input.close();

    }
}