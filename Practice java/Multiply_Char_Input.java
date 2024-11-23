import java.util.Scanner;

public class Multiply_Char_Input {
    public static void main(String[] args) {
        Scanner input= new  Scanner(System.in);
        System.out.print("Enter the name: ");

        String name=input.nextLine();

       
        for(int i=0;i<name.length();i++){
           char charater=name.charAt(i);

            System.out.println(charater);
        }
    
    input.close();
    }
}
