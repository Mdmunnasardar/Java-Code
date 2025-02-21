import java.util.Scanner;

class Fact { 
    public int fact1(int n) { 
        if (n == 0 || n == 1) {  
            return 1; 
        } 
        return n * fact1(n - 1); 
    } 
} 
 
public class Factmin {  // Change 'fact' to 'FactMain'
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Taking input from user
        
        Fact ob = new Fact();  
        int result = ob.fact1(num); 
        System.out.println("Factorial of " + num + " is: " + result); 
        
        sc.close();
    } 
}
