class Student {
    String name;
    int age;
    double grade;

    public Student() {
        name = "Unknown";
        age = 18; 
        grade = 0.0; 
    }
    public Student(String name) {
        this.name = name;
        this.age = 18; 
        this.grade = 0.0; 
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 0.0;
    }

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void display() {
        System.out.println("Student: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

public class Problem02 {
    public static void main(String args[]) {

        Student s1 = new Student();                   
        Student s2 = new Student("Alice");            
        Student s3 = new Student("Bob", 20);            
        Student s4 = new Student("Charlie", 21, 88.5);  

       
        System.out.println("Student 1:");
        s1.display();
        
        System.out.println("\nStudent 2:");
        s2.display();
        
        System.out.println("\nStudent 3:");
        s3.display();
        
        System.out.println("\nStudent 4:");
        s4.display();
    }
}
