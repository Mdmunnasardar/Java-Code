public class MVL {
    String name;
    int age;
    double cgpa;

    void method() {
        System.out.println(" NO argument ");

    }

    int method1(int a) {
        System.out.println(" integer value : ");
        return a * a;
    }

    double meth(double c) {

        System.out.println("last one ");
        return c * 10;
    }

    String method3(String str) {
        return str;
    }

    public static void main(String[] args) {
        MVL ob = new MVL();

        ob.method();
        System.out.println("Call 2nd method  : " + ob.method1(2));
        System.out.println("Call 3rd method  : " + ob.meth(2.8));
        System.out.println("LAst call : " + ob.method3("munna"));
    }
}
