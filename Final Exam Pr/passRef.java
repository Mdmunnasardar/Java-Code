public class passRef {
    int a ,b;

    passRef(int i, int j){
        a=i;
        b=j;
    }
    void method (passRef p){
        p.a *=2;
        p.b +=2;
    }

    public static void main(String[] args) {
        passRef ob = new passRef(14, 27);

        System.out.println(" Before pass reference : "+ob.a+"  "+ob.b);

        ob.method(ob);

        System.out.println("after pass reference : "+ob.a+" "+ob.b);
    }
}

