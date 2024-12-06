import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        double result=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1=input.nextDouble();

        System.out.println("Enter a operator: (+,-,*,/)");
        char operator=input.next().charAt(0);

        System.out.println("Enter the Second number: ");
        double num2=input.nextDouble();

        switch (operator) {
            case '+':
            result=num1+num2;
                
            break;

            case '-':
            result=num1-num2;
                    
            break;

            case '*':
            result=num1*num2;
                
            break;

            case '/':
            result=num1/num2;
                
            break;
        
            default:
            System.out.println("invalid operator");

            break;
        }
            System.out.println("result: "+result);

            input.close();
           
        }
      

    }

