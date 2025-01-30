class Outer {
    int outerNum = 50;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println("Outer class num: " + outerNum);
        }
    }
}

public class Problem10 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
