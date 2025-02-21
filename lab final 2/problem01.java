class circle {
    private double radius;
    private String color;

    public circle(){
        radius=1.0;
        color ="red";
    }
    public circle (double radius){
      this.radius=radius;
      color="red";

    }
    public  double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
}



public class problem01 {
    public static void main(String[] args) {
        circle ob=new circle();

        System.out.println("radius: "+ob.getRadius());

        System.out.println("radius: "+ob.getColor());
    }
}
