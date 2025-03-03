public class simpleClass {
    double width;
    double height;
    double depth;

    simpleClass(){
        width=20;
        height=30;
        depth=10;

    }
    @Override
    public String toString() {
        return "Width: " + width + ", Height: " + height + ", Depth: " + depth;
    }

    public static void main(String[] args) {
        simpleClass ob = new simpleClass();

        System.out.println(ob);
    }
}
