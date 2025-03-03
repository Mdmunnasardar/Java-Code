class Box {
    double width, height, depth;

    // Default constructor
    Box() {
        width = height = depth = 0;
        System.out.println("Default Constructor: Box created with zero dimensions.");
    }

    // Parameterized constructor
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
        System.out.println("Parameterized Constructor: Box created with dimensions.");
    }

    // Copy constructor
    Box(Box obj) {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
        System.out.println("Copy Constructor: Box copied from another Box object.");
    }

    // Method to calculate volume
    double volume() {
        return width * height * depth;
    }
public class sample{
    public static void main(String[] args) {
        // Using default constructor
        Box box1 = new Box();
        System.out.println("Volume of box1: " + box1.volume());

        // Using parameterized constructor
        Box box2 = new Box(10, 5, 8);
        System.out.println("Volume of box2: " + box2.volume());

        // Using copy constructor
        Box box3 = new Box(box2);
        System.out.println("Volume of box3: " + box3.volume());
    }
}
}