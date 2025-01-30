class Method {

    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
}
public class Problem01 {
    public static void main(String args[]) {
        Method ob = new Method();
        int resultInt;
        double resultDouble;

        resultInt = ob.add(10, 20);
        System.out.println("Addition of two integers: " + resultInt);

        resultInt = ob.add(10, 20, 30);
        System.out.println("Addition of three integers: " + resultInt);

        resultDouble = ob.add(4.5, 5.5);  
        System.out.println("Addition of two doubles: " + resultDouble);
    }
}
