class CBValue {
    void meth(int x, int y) {
        x = x + 10;
        y = y - 5;
    }
}

class CBReference {
    int a, b;

    CBReference(int x, int y) {
        a = x;
        b = y;
    }

    void meth(CBReference obj) {
        obj.a = obj.a + 5;
        obj.b = obj.b - 2;
    }
}

public class Problem04 {
    public static void main(String args[]) {
        int a = 10, b = 20;
        CBValue Ob = new CBValue();

        System.out.println("Before Call by Value: a = " + a + ", b = " + b);
        Ob.meth(a, b);
        System.out.println("After Call by Value: a = " + a + ", b = " + b);

        CBReference Obj = new CBReference(10, 20);

        System.out.println("\nBefore Call by Reference: Obj.a = " + Obj.a + ", Obj.b = " + Obj.b);
        Obj.meth(Obj);
        System.out.println("After Call by Reference: Obj.a = " + Obj.a + ", Obj.b = " + Obj.b);
    }
}
