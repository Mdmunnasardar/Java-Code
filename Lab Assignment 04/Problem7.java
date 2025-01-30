import java.util.Scanner;

class Problem7 {
    static int factor = 2;
    static int base = 10;  

    static { System.out.println("Static block executed."); }

    static void cal(int num) { 
        System.out.println("Result: " + (num * factor + base)); 
    }

    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        cal(sc.nextInt());  
        
        sc.close();
    } 
    
    
}
