public class ST {
    static int a=30 ;
    static int b=40;
    static int c;

    static void  method (){
        System.out.println(a);
        System.out.println(b);
    }

    static{
       int  c=a*b;
       System.out.println(c);

    }
    public static void main(String[] args) {
        method();
    }
}
