// Main class to initialize objects and test methods
public class Main {
    public static void main(String[] args) {
        // Initialize objects
        Quadrilateral shape1 = new Quadrilateral();
        Object shape2 = new Kite();
        Quadrilateral shape3 = new Trapezium();
        Object shape4 = new Parallelogram();
        Parallelogram shape5 = new Rhombus();
        Quadrilateral shape6 = new Rectangle();
        Parallelogram shape7 = new Square();
        Rectangle shape8 = new Square();

        // Print object names
        // System.out.println(shape1.name);
        // System.out.println(shape2.name); // CT: Compile-time error
        // System.out.println(shape3.name);
        // System.out.println(shape4.name); // CT: Compile-time error
        // System.out.println(shape5.name);
        // System.out.println(shape6.name);
        // System.out.println(shape7.name);

        // // Call methods on shape1
        // System.out.println("\nCalling methods on shape1:");
        // shape1.method1();
        // shape1.method2();
        // shape1.method3();
        // shape1.method4();

        // // Call methods on shape2 (requires casting)
        // System.out.println("\nCalling methods on shape2:");
        // shape2.method1(); // CT: Compile-time error
        // shape2.method2(); // CT: Compile-time error
        // shape2.method3(); // CT: Compile-time error
        // shape2.method4(); // CT: Compile-time error

        // Call methods on shape3
        // System.out.println("\nCalling methods on shape3:");
        // shape3.method1();
        // shape3.method2();
        // shape3.method3();
        // shape3.method4();

        // // Call methods on shape4 (requires casting)
        // System.out.println("\nCalling methods on shape4:");
        // shape4.method1(); // CT: Compile-time error
        // shape4.method2(); // CT: Compile-time error
        // shape4.method3(); // CT: Compile-time error
        // shape4.method4(); // CT: Compile-time error

        // // Call methods on shape5
        // System.out.println("\nCalling methods on shape5:");
        // shape5.method1();
        // shape5.method2();
        // shape5.method3();
        // shape5.method4();

        // // Call methods on shape6
        // System.out.println("\nCalling methods on shape6:");
        // System.err.println("");
        // shape6.method1();
        // System.err.println("");
        // shape6.method2();
        // System.err.println("");
        // shape6.method3();
        // System.err.println("");
        // shape6.method4();
        // System.err.println("");

        // // Call methods on shape7
        // System.out.println("\nCalling methods on shape7:");
        // System.err.println("");
        // shape7.method1();
        // System.err.println("");
        // shape7.method2();
        // System.err.println("");
        // shape7.method3();
        // System.err.println("");
        // shape7.method4();
        // System.err.println("");

        // // Call compareTo method on shape8
        // System.out.println("\nCalling compareTo on shape8:");
        // System.out.println(shape8.compareTo(shape8));

        // // Casting and calling methods
        // System.out.println("\nCasting and calling methods:");
        // System.err.println("");
        // ((Quadrilateral) shape1).method1();
        // System.err.println("");
        // ((Quadrilateral) shape2).method1();
        // System.err.println("");
        // ((Quadrilateral) shape3).method1();
        // System.err.println("");
        // ((Quadrilateral) shape4).method1();
        // System.err.println("");
        // ((Quadrilateral) shape5).method1();
        // System.err.println("");
        // ((Quadrilateral) shape6).method1();
        // System.err.println("");
        // ((Quadrilateral) shape7).method1();
        // System.err.println("");

        // // Casting and calling methods 2
        // System.err.println("\nCasting and calling methods 2: \n");
        // ((Quadrilateral) shape1).method2();
        // System.err.println("");
        // ((Quadrilateral) shape2).method2();
        // System.err.println("");
        // ((Quadrilateral) shape3).method2();
        // System.err.println("");
        // ((Quadrilateral) shape4).method2();
        // System.err.println("");
        // ((Quadrilateral) shape5).method2();
        // System.err.println("");
        // ((Quadrilateral) shape6).method2();
        // System.err.println("");
        // ((Quadrilateral) shape7).method2();
        // System.err.println("");

        // // Casting and calling methods 3
        // System.err.println("\nCasting and calling methods 3: \n");
        // ((Quadrilateral) shape1).method3();
        // System.err.println("");
        // ((Quadrilateral) shape2).method3();
        // System.err.println("");
        // ((Quadrilateral) shape3).method3();
        // System.err.println("");
        // ((Quadrilateral) shape4).method3();
        // System.err.println("");
        // ((Quadrilateral) shape5).method3();
        // System.err.println("");
        // ((Quadrilateral) shape6).method3();
        // System.err.println("");
        // ((Quadrilateral) shape7).method3();
        // System.err.println("");

        // // Object all shape method 1
        // System.err.println("\nObject all shapes method 1: \n");
        // ((Object) shape1).method1(); //CT: Compile-time error
        // ((Object) shape2).method1(); //CT: Compile-time error
        // ((Object) shape3).method1(); //CT: Compile-time error
        // ((Object) shape4).method1();// CT: Compile-time error
        // ((Object) shape5).method1(); //CT: Compile-time error
        // ((Object) shape6).method1(); //CT: Compile-time error
        // ((Object) shape7).method1(); //CT: Compile-time error

        // // Object all shape method 2
        // System.err.println("\nObject all shapes method 2: \n");
        // ((Object) shape1).method2();// CT: Compile-time error
        // ((Object) shape2).method2(); //CT: Compile-time error
        // ((Object) shape3).method2(); //CT: Compile-time error
        // ((Object) shape4).method2();// CT: Compile-time error
        // ((Object) shape5).method2(); //CT: Compile-time error
        // ((Object) shape6).method2(); //CT: Compile-time error
        // ((Object) shape7).method2(); //CT: Compile-time error

        // // Object all shape method 3
        // System.err.println("\nObject all shapes method 3: \n");
        // ((Object) shape1).method3();// CT: Compile-time error
        // ((Object) shape2).method3(); //CT: Compile-time error
        // ((Object) shape3).method3(); //CT: Compile-time error
        // ((Object) shape4).method3(); //CT: Compile-time error
        // ((Object) shape5).method3(); //CT: Compile-time error
        // ((Object) shape6).method3();// CT: Compile-time error
        // ((Object) shape7).method3();// CT: Compile-time error

        // // Kite all shape method 1
        // System.err.println("\nKite all shapes method 1: \n");
        // ((Kite) shape1).method1(); //RT: Compile-time error
        // ((Kite) shape2).method1(); //RT: Compile-time error
        // ((Kite) shape3).method1(); //RT: Compile-time error
        // ((Kite) shape4).method1(); //RT: Compile-time error
        // //((Kite) shape5).method1(); //CT: Compile-time error
        // ((Kite) shape6).method1(); //RT: Compile-time error
        // //((Kite) shape7).method1(); //CT: Compile-time error

        // Kite all shape method 2
        // System.err.println("\nKite all shapes method 2: \n");
        // ((Kite) shape1).method2();// RT: Run-time error
        // ((Kite) shape2).method2();// RT: Run-time error
        // ((Kite) shape3).method2();// RT: Run-time error
        // ((Kite) shape4).method2(); //RT: Run-time error
        // //((Kite) shape5).method2();// CT: Compile-time error
        // ((Kite) shape6).method2();// RT: Run-time error
        // //((Kite) shape7).method2();// CT: Compile-time error

        // // Kite all shape method 3
        // System.err.println("\nKite all shapes method 3: \n");
        // ((Kite) shape1).method2();// RT: Run-time error
        // ((Kite) shape2).method2(); //RT: Run-time error
        // ((Kite) shape3).method2();// RT: Run-time error
        // ((Kite) shape4).method2();// RT: Run-time error
        // ((Kite) shape5).method2(); //CT: Compile-time error
        // ((Kite) shape6).method2(); //RT: Run-time error
        // ((Kite) shape7).method2(); //CT: Compile-time error

        // Paralleforam all shape method 1
        // System.err.println("\nParallelogram all shapes method 1");
        // ((Parallelogram) shape1).method1(); // RT
        // ((Parallelogram) shape2).method1(); // RT
        // ((Parallelogram) shape3).method1(); // RT
        // ((Parallelogram) shape4).method1();
        // System.err.println("");
        // ((Parallelogram) shape5).method1();
        // System.err.println("");
        // ((Parallelogram) shape6).method1();
        // System.err.println("");
        // ((Parallelogram) shape7).method1(); // CT
        // System.err.println("");

        // // Paralleforam all shape method 2
        // System.err.println("\nParallelogram all shapes method 2");
        // ((Parallelogram) shape1).method2(); // RT
        // ((Parallelogram) shape2).method2(); // RT
        // ((Parallelogram) shape3).method2(); // RT
        // ((Parallelogram) shape4).method2();
        // System.err.println("");
        // ((Parallelogram) shape5).method2();
        // System.err.println("");
        // ((Parallelogram) shape6).method2();
        // System.err.println("");
        // ((Parallelogram) shape7).method2(); // CT
        // System.err.println("");

        // // Paralleforam all shape method 3
        // System.err.println("\nParallelogram all shapes method 3");
        // ((Parallelogram) shape1).method3(); // RT
        // ((Parallelogram) shape2).method3(); // RT
        // ((Parallelogram) shape3).method3(); // RT
        // ((Parallelogram) shape4).method3();
        // System.err.println("");
        // ((Parallelogram) shape5).method3();
        // System.err.println("");
        // ((Parallelogram) shape6).method3();
        // System.err.println("");
        // ((Parallelogram) shape7).method3();
        // System.err.println("");

        // // Trapezium all shapes method 1
        // System.err.println("\nTrapezium all shapes method 1: \n");
        // ((Trapezium) shape1).method1(); //RT
        // ((Trapezium) shape2).method1(); //RT
        // ((Trapezium) shape3).method1();
        // System.err.println("");
        // // ((Trapezium) shape4).method1(); //RT
        // // ((Trapezium) shape5).method1(); //CT
        // ((Trapezium) shape6).method1(); //RT
        // ((Trapezium) shape7).method1(); //CT

        // // Trapezium all shapes method 2
        // System.err.println("\nTrapezium all shapes method 2: \n");
        // // ((Trapezium) shape1).method2(); //RT
        // // ((Trapezium) shape2).method2(); //RT
        // ((Trapezium) shape3).method2();
        // System.err.println("");
        // // ((Trapezium) shape4).method2(); //RT
        // // ((Trapezium) shape5).method2(); //CT
        // // ((Trapezium) shape6).method2(); //RT
        // // ((Trapezium) shape7).method2(); //CT

        // // Trapezium all shapes method 3
        // System.err.println("\nTrapezium all shapes method 3: \n");
        // // ((Trapezium) shape1).method3(); //RT
        // // ((Trapezium) shape2).method3(); //RT
        // ((Trapezium) shape3).method3(); //RT
        // System.err.println("");
        // // ((Trapezium) shape4).method3(); //RT
        // // ((Trapezium) shape5).method3(); //CT
        // // ((Trapezium) shape6).method3(); //RT
        // // ((Trapezium) shape7).method3(); //CT

        // // Rhombus all shapes method 1
        // System.err.println("\nRhombus shapes method 1: \n");
        // // ((Rhombus) shape1).method1(); //RT
        // // ((Rhombus) shape2).method1(); //RT
        // // ((Rhombus) shape3).method1(); //RT
        // // ((Rhombus) shape4).method1(); //RT
        // ((Rhombus) shape5).method1();
        // System.err.println("");
        // // ((Rhombus) shape6).method1(); //RT
        // // ((Rhombus) shape7).method1(); //RT

        // // Rhombus all shapes method 2
        // System.err.println("\nRhombus shapes method 2: \n");
        // // ((Rhombus) shape1).method2(); //RT
        // // ((Rhombus) shape2).method2(); //RT
        // // ((Rhombus) shape3).method2(); //RT
        // // ((Rhombus) shape4).method2(); //RT
        // ((Rhombus) shape5).method2();
        // System.err.println("");
        // // ((Rhombus) shape6).method2(); //RT
        // // ((Rhombus) shape7).method2(); //RT

        // // Rhombus all shapes method 3
        // System.err.println("\nRhombus shapes method 3: \n");
        // // ((Rhombus) shape1).method3(); //RT
        // // ((Rhombus) shape2).method3(); //RT
        // // ((Rhombus) shape3).method3(); //RT
        // // ((Rhombus) shape4).method3(); //RT
        // ((Rhombus) shape5).method3();
        // System.err.println("");
        // // ((Rhombus) shape6).method3(); //RT
        // // ((Rhombus) shape7).method3(); //RT

        // // Rectangle all shapes method 1
        // System.err.println("\nRectangle all shapes method 1:");
        // // ((Rectangle) shape1).method1(); //RT
        // // ((Rectangle) shape2).method1(); //RT
        // // ((Rectangle) shape3).method1(); //RT
        // // ((Rectangle) shape4).method1(); //RT
        // // ((Rectangle) shape5).method1(); //RT
        // ((Rectangle) shape6).method1();
        // System.err.println("");
        // ((Rectangle) shape7).method1();

        // // Rectangle all shapes method 2
        // System.err.println("\nRectangle all shapes method 2:");
        // // ((Rectangle) shape1).method2(); //RT
        // // ((Rectangle) shape2).method2(); //RT
        // // ((Rectangle) shape3).method2(); //RT
        // // ((Rectangle) shape4).method2(); //RT
        // // ((Rectangle) shape5).method2(); //RT
        // ((Rectangle) shape6).method2();
        // System.err.println("");
        // ((Rectangle) shape7).method2();

        // // Rectangle all shapes method 3
        // System.err.println("\nRectangle all shapes method 3:");
        // // ((Rectangle) shape1).method3(); //RT
        // // ((Rectangle) shape2).method3(); //RT
        // // ((Rectangle) shape3).method3(); //RT
        // // ((Rectangle) shape4).method3(); //RT
        // // ((Rectangle) shape5).method3(); //RT
        // ((Rectangle) shape6).method3();
        // System.err.println("");
        // ((Rectangle) shape7).method3();

        // // Square all shapes method 1
        // System.err.println("\nSquare all shapes method 1: ");
        // // ((Square) shape1).method1(); //RT
        // // ((Square) shape2).method1(); //RT
        // // ((Square) shape3).method1(); //RT
        // // ((Square) shape4).method1(); //RT
        // // ((Square) shape5).method1(); //RT
        // // ((Square) shape6).method1(); //RT
        // ((Square) shape7).method1();

        // // Square all shapes method 2
        // System.err.println("\nSquare all shapes method 2: ");
        // // ((Square) shape1).method2(); //RT
        // // ((Square) shape2).method2(); //RT
        // // ((Square) shape3).method2(); //RT
        // // ((Square) shape4).method2(); //RT
        // // ((Square) shape5).method2(); //RT
        // // ((Square) shape6).method2(); //RT
        // ((Square) shape7).method2();

        // // Square all shapes method 3
        // System.err.println("\nSquare all shapes method 3: ");
        // // ((Square) shape1).method3(); //RT
        // // ((Square) shape2).method3(); //RT
        // // ((Square) shape3).method3(); //RT
        // // ((Square) shape4).method3(); //RT
        // // ((Square) shape5).method3(); //RT
        // // ((Square) shape6).method3(); //RT
        // ((Square) shape7).method3();
    }
}