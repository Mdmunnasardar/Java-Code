class Factorial{

    int fact (int n){
        int result;

        if (n==1)
        return 1;
        result=fact(n-1)*n;
        return result;
    }
}
public class recursion {
    public static void main(String[] args) {
        Factorial ob=new Factorial();

        ob.fact(5);

        System.out.println(ob.fact(5));

        System.out.println(ob.fact(6));

        System.out.println(ob.fact(1));
    }
}
