class OverloadDemo {
    void test(){
        System.out.println("NO Parameters");
    }
    void test(int a){
        System.out.println("a: "+a);
    }
    void test(int a,int b){
        System.out.println("a value: "+a+" b value : "+b);
    }
   double  test(double a){
    System.out.println("double: "+a);
        return a*a;
    }
}
class MethodOvL {
    public static void main (String args[]){
        OverloadDemo ob=new OverloadDemo();
        double result;
        ob.test();
        ob.test(10,20);
        ob.test(10);
        result=ob.test(123.5);
        System.out.println("result: "+result);

    }
}