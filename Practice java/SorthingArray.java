import java.util.Arrays;
import java.util.Collections;
public class SorthingArray {
    
     public static void main (String[] args){
        String names[]={"mahmud","rafi","sourov","rony" ,"himel"};
        Arrays.sort(names);
        for(String n:names){
            System.out.println(n);
        }
        System.out.println("*********");
        Arrays.sort(names, Collections.reverseOrder());
        for(String s:names){
            System.out.println(s);
        }
     }
}
