import java.util.Arrays;
import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter array size: ");

        int size=input.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter array element: ");
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }

        boolean isShorted=true;
        for(int i=0;i<size-1;i++){
            if(arr[i]>arr[i+1]){
                isShorted=false;
                break;
            }
        }
        if(isShorted){
            System.out.println("ARray is shorted: ");
        }
        else{
            System.out.println("Not shorted");
        }
        System.out.println("Array shorted");
        Arrays.sort(arr);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    

        input.close();

    }
}
