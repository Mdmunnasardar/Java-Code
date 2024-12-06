import java.util.Scanner;

public class rotateOne {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter arry size: ");

        int size = input.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the element: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int last = arr[size - 1];

        for (int i = size - 1; i > 0; i--) 
            arr[i] = arr[i - 1];
            arr[0] = last;
        
        System.out.print("Rotated array: ");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
        
        input.close();
    }
}