public class returningValue {
    double width;
    double height;
    double depth;

    // void volume() {  // Fixed method name
    //     System.out.println(width * height * depth);
    // } this void which nothintg return now using return method  value 

    double volume(){
        return width*height*depth;
    }

    public static void main(String[] args) {
       returningValue ob = new returningValue();  // Fixed object instantiation
        //now creating multiple obj to use it --

        returningValue ob1= new returningValue();

        ob.width = 2;
        ob.height = 5;
        ob.depth = 6;

        System.out.println(ob.volume());
        ob1.width = 10;
        ob1.height = 5;
        ob1.depth = 6;
        System.out.println(ob1.volume());
        // Fixed method call
    }
}

