class Method {

    public int sum (int a,int b){
        return a+b;
    }
    public int sum (int a,int b,int c){
        return a+b+c;
    }
    public double sum (double  a,double  b){
        return a+b;
    }

}
public class methodOver{
        public static void main(String args[]){
            //int result;
            Method ob=new Method();

            //ob.sum(3,4);
            System.out.println(ob.sum(3,4));
            System.out.println(ob.sum(3,4,5));
            System.out.println(ob.sum(3.4,4.5));
        }
        }



    