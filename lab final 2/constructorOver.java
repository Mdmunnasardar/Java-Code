class Box {
    double l;
    double k;
    double w;

    // Constructor 1: No parameters, default values for l, k, and w
    public Box() {
        l = 1.0;  // default length
        k = 1.0;  // default width
        w = 1.0;  // default height
    }

    // Constructor 2: Takes one parameter to initialize l, default values for k and w
    public Box(double a) {
        l = a;
        k = 1.0;  // default width
        w = 1.0;  // default height
    }

    // Constructor 3: Takes two parameters to initialize l and k, default value for w
    public Box(double a, double b) {
        l = a;
        k = b;
        w = 1.0;  // default height
    }

    // Constructor 4: Takes three parameters to initialize l, k, and w
    public Box(double a, double b, double c) {
        l = a;
        k = b;
        w = c;
    }
}

public class constructorOver {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Box box1 = new Box();                 // No parameters, default values
        Box box2 = new Box(5.0);              // One parameter (length), default width and height
        Box box3 = new Box(5.0, 3.0);         // Two parameters (length, width), default height
        Box box4 = new Box(5.0, 3.0, 2.0);    // Three parameters (length, width, height)

        // Printing the dimensions and calculating the volumes directly
        System.out.println("Box1: l = " + box1.l + ", k = " + box1.k + ", w = " + box1.w  );
        System.out.println("Box2: l = " + box2.l + ", k = " + box2.k + ", w = " + box2.w  );
        System.out.println("Box3: l = " + box3.l + ", k = " + box3.k + ", w = " + box3.w );
        System.out.println("Box4: l = " + box4.l + ", k = " + box4.k + ", w = " + box4.w  );
    }
}
