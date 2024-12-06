import java.util.Scanner;

public class vowels {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the word:");
        String str = input.nextLine();
        int count = 0;

        str = str.toLowerCase();

        for (int i = 0;i<str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count++;
            }
        }
        System.out.println("number of vowels count: " + count);
        input.close();
    }
}