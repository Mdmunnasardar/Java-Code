import java.util.Scanner;

public class vowel {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("enter a string:");

       String str=input.nextLine();
       str=str.toLowerCase();
       int count=0;

       for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            count++;
        }
    
       }
       System.out.println("count the vowels: "+count);
       input.close();
    }
}