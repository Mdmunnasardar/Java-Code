import java.util.Scanner;

public class problem09 {

    public static void main(String[] args) {
        String str;
        int count = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        str = input.nextLine();

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);

        input.close();
    }
}
