class Outer{
int a =10;
    void test(){
        inner ob =new inner();
        ob.display();
    }

    class inner{
        void display(){
            System.out.println(" This inner class call by outer: "+ a);
        }
    }
}



public class outerclasscall {
    public static void main(String[] args) {
      Outer o = new Outer();
      o.test();  
    }
}
