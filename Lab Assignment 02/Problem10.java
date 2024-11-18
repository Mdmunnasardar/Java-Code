import java.util.Scanner;

public class Problem10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int targetSum = input.nextInt();

        boolean pairFound = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                    pairFound = true;
                    break;
                }
            }
            if (pairFound) {
                break;
            }
        }

        if (!pairFound) {
            System.out.println("No pair found with the given sum.");
        }

        input.close();
    }
}


