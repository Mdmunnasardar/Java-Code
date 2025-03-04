public class Over {
    double length, width;

    // initialize by constructor
    Over(double l, double w) {
        length = l;
        width = w;
    }

    // default constructor //value assign

    Over() {
        length = 10;
        width = 30;
    }

    Over(double d) {
        length = width = d;
        // width=2;
    }

    ///method call
    double set() {
        return length * width * 2;
    }

    public static void main(String arg[]) {
        Over ob = new Over();
        Over ob1 = new Over(10, 20);
        Over ob2 = new Over(4);

        ob.set();
        ob1.set();
        ob2.set();
        System.out.println(ob.set());
        System.out.println(ob1.set());
        System.out.println(ob2.set());
    }
}
