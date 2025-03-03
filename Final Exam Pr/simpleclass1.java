public class simpleclass1 {
    double width;
    double height;
    double depth;

    void volume() {  // Fixed method name
        System.out.println(width * height * depth);
    }

    public static void main(String[] args) {
        simpleclass1 ob = new simpleclass1();  // Fixed object instantiation

        ob.width = 4;
        ob.height = 5;
        ob.depth = 6;

        ob.volume();  // Fixed method call
    }
}
