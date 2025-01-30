class MethodOver {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b,double c) {
        return a + b + c;
    }
}

public class Method {
    public static void main(String args[]) {
        MethodOver ob = new MethodOver();
        int resultInt;
        double resultDouble;

      
        resultInt = ob.add(10, 20);           
        System.out.println("Addition of two integers: " + resultInt);

        resultInt = ob.add(10, 20, 30);        
        System.out.println("Addition of three integers: " + resultInt);

        resultDouble = ob.add(4.5, 5.6,9.5);        
        System.out.println("Addition of three integers: " + resultDouble);


    }
}
