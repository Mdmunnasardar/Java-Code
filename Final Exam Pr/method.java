class Box {
    double width, height, depth;

    // Constructor to initialize box dimensions
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // **Method without parameters and return type** (Displays box dimensions)
    void displayDimensions() {
        System.out.println("Width: " + width + ", Height: " + height + ", Depth: " + depth);
    }

    // **Method with return type** (Calculates volume)
    double getVolume() {
        return width * height * depth;
    }

    // **Method with parameters** (Updates dimensions)
    void updateDimensions(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
        System.out.println("Box dimensions updated.");
    }
 public class method {
    public static void main(String[] args) {
        // Creating a Box object
        Box myBox = new Box(10, 5, 8);

        // Calling a method without parameters
        myBox.displayDimensions();

        // Calling a method that returns a value
        double volume = myBox.getVolume();
        System.out.println("Volume: " + volume);

        // Calling a method with parameters
        myBox.updateDimensions(12, 6, 9);
        myBox.displayDimensions();
    }
}


}
    

