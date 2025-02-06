class Shape {
    public void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: " + radius);
    }
}

class Rectangle extends Shape {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle: " + length + " x " + width);
    }
}

public class Problem07 {
    public static void main(String[] args) {
        Shape shape;  

        shape = new Circle(5.5);  
        shape.draw();  

        shape = new Rectangle(4.0, 3.0);  
        shape.draw();  
    }
}
