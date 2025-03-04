class Circle {
    private double radius =1.0;
    private String color ="red";

    Circle (){
      //  radius=1.0;
        //color= "red";
    }
    Circle(double radius ){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;

    }
}

public class CircleRun {
    public static void main(String[] args) {
        
    
    Circle ob= new Circle();
    Circle ob1= new Circle(10);
    
    System.out.println(ob.getRadius());
    System.out.println(ob.getRadius());


    ob1.getRadius();
    System.out.println(ob1.getRadius());
    ob1.getArea();
    System.out.println(ob1.getArea());
}
}