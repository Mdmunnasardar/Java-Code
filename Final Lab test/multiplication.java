import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        
        int num=input.nextInt();

        for(int i=0;i<=10;i++){
            
            System.out.println(num+"X"+i+"="+num*i);
        }
    
    
    input.close();
    }
}
