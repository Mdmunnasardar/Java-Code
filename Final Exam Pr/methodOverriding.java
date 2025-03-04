class A{
    int a,b;

    A(int a,int b){
        this.a=a;
        this.b=b;
    }

    void show (){
        System.out.println(" a and b are : "+a+" "+b);
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
        System.out.println("k : "+k);
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        B o= new B(1,2,3);

        o.show();
    }
}
