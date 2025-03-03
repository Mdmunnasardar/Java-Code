public class parameters {
    double width;
    double height;
    double depth;

    // void volume() { // Fixed method name
    // System.out.println(width * height * depth);
    // }  now using return method value

    double volume() {
        return width * height * depth;
    }
    // para meter method which is passing argument in ()--

    void setpara(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public static void main(String[] args) {
        parameters ob = new parameters(); // Fixed object instantiation
        // now creating multiple obj to use it --
        parameters ob1 = new parameters();
        // double vol ;

        ob.setpara(3, 3, 3);
        ob.volume();
        System.out.println(ob.volume());

        ob1.setpara(30, 30, 30);
        ob1.volume();
        System.out.println(ob1.volume());

        // Fixed method call
    }
}
