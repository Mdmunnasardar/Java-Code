public class COL {
    class Student {
        String name;
        int age;
        double marks;
    
        // Default Constructor
        Student() {
            name = "Unknown";
            age = 0;
            marks = 0.0;
        }
    
        // Constructor with different parameter type (String only)
        Student(String n) {
            name = n;
            age = 18;  // Default age
            marks = 50.0;  // Default marks
        }
    
        // Constructor with String and int
        Student(String n, int a) {
            name = n;
            age = a;
            marks = 60.0;  // Default marks
        }
    
        // Constructor with all different types of parameters
        Student(String n, int a, double m) {
            name = n;
            age = a;
            marks = m;
        }
    
        void display() {
            System.out.println("Name: " + name + ", Age: " + age + ", Marks: " + marks);
        }
    
        public static void main(String[] args) {
            Student s1 = new Student();             // Calls default constructor
            Student s2 = new Student("Alice");      // Calls constructor with String
            Student s3 = new Student("Bob", 20);    // Calls constructor with String and int
            Student s4 = new Student("Charlie", 22, 85.5); // Calls constructor with String, int, double
    
            s1.display();
            s2.display();
            s3.display();
            s4.display();
        }
    }
    
}
