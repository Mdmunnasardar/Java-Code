import java.util.Scanner;

public class input_From_User {

    public static void main(String[] args) {
    
        //int number;
        Scanner input = new Scanner(System.in);
        //System.out.print("Enter A nnumber ");
        //number = input.nextDouble();...//for double  type..
       // number = input.nextInt();//integer type..
       // System.out.println("Showing Input:" + number);
       System.out.println("Enter Your Name: ");
        //String name=input.nextLine();
       char name= input.next().charAt(0);

        System.out.println("Showing Input:" + name);

    }

}
