import java.util.Arrays;
import java.util.Scanner;

public class findminimum {
    
    public static void main(String[] args) {
        
    
    Scanner input=new Scanner(System.in);
    System.out.print("enter array elemnt: ");

    int size=input.nextInt();
    int number[]=new int [size];
        System.out.println("enter element: ");
    for(int i=0;i<size;i++){
        number[i]=input.nextInt();
    }

    //to sort the number then size-2 which is indicate last before value 
    //that is the second largest.and largest then size-1
    //if say third largest then size-1
    //after all need to the array sort.
   Arrays.sort(number); 
   System.out.println("Second largest element: " + number[0]); 
}


    }
