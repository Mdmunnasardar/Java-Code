import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        
    
     Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        
        int num=input.nextInt();
        if(num<0){
            System.out.println("please give positive value");
        }else{
        int fact=1;
        for(int i=num;i>0;i--){
            fact*=i;
        }
        System.out.println("fcatorial: "+fact);
        input.close();
}
}
}