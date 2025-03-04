class A{
    int a,b;

    A(int a,int b){
        this.a=a;
        this.b=b;
    }

    void show (){
        System.out.println("Super class value called of a and b are : "+a+" "+b);
    }
}

class B extends A{
    int k;

    B (int a,int b,int c){
        super(a,b);
        k=c;
    }

    //@methodOverriding// as same name method in super class 
    void show(){
        super.show();
        System.out.println("k : "+k);
    }
    void volume(){
        System.out.println("Sum of three integer: " +a+b+k);
    }
    }


public class methodOverriding {
    public static void main(String[] args) {
        B o= new B(1,2,3);

        o.show();
        o.volume();
    }
}
