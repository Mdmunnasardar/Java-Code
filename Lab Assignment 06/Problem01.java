class Circle {
    private double radius;
    private String color;
    
    public Circle() {
        radius = 1.0;
        color = "red";
    }
    
    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }
    
    public double getRadius() {
        return radius;
    }
    
    public String getColor() {
        return color;
    }
}

public class Problem01 {
    public static void main(String[] args) {
        Circle cir1 = new Circle();
        System.err.println("Radius: " + cir1.getRadius());
        System.err.println("Color: " + cir1.getColor());

        Circle cir2 = new Circle(10.5);
        System.err.println("Radius: " + cir2.getRadius());
        System.err.println("Color: " + cir2.getColor());
    }
}
