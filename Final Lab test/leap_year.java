import java.util.Scanner;
public class leap_year {
   


    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        number = input.nextInt();

        if (number % 400 == 0) {
            System.out.println("Leap year");
        } else if (number % 100 == 0) {
            System.out.println("Not a Leap year");
        } else if (number % 4 == 0) {
            System.out.println("leap year");
        }
        input.close();
    
}

}