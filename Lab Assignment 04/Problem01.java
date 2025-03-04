public class Problem01 {

    // Method to calculate area of a rectangle
    public double Area(double length, double width) {
        return length * width;
    }

    // Method to calculate area of a circle
    public double Area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
       Problem01 c = new Problem01();

        // Calculate and print areas
        System.out.println("Rectangle Area: " + c.Area(5, 3));
        System.out.println("Circle Area: " + c.Area(4));
    }
}
