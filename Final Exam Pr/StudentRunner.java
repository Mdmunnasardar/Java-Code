class Student {
    private String name ;
    private String  id;
    private String homeTown ;
    private double cgpa;

    public Student() {
        this.name = "";
        this.id = "";
        this.homeTown = "";
        this.cgpa = 0.0;
    }

    // Parameterized Constructor
    public Student(String name, String id, String homeTown, double cgpa) {
        this.name = name;
        this.id = id;
        this.homeTown = homeTown;
        this.cgpa = cgpa;
    }
    public String getName(){
        return name;
    }
    public void setName(String n ){
       this.name=n;
    }
    public String getID(){
        return id;
    }

    public void setId (String i){
        this.id=i;
    }
    public String gethomeTown(){
        return homeTown;
    }

    public void sethomeTown (String i){
        this.homeTown=i;
    }
    public double getcgpa(){
        return cgpa;
    }

    public void setcgpa (double c){
        this.cgpa=c;
    }
    @Override
    public String toString() {
        return "Name: " + name + "\nID: " + id + "\nHome Town: " + homeTown + "\nCGPA: " + cgpa + "\n----------------------";

}
}


public class StudentRunner {
    public static void main(String[] args) {
        Student john = new Student();
        Student mike = new Student();
        Student carol = new Student();

        // Setting values using setter methods
        john.setName("John Doe");
        john.setId("S101");
        john.sethomeTown("New York");
        john.setcgpa(3.7);

        mike.setName("Mike Smith");
        mike.setId("S102");
        mike.sethomeTown("Los Angeles");
        mike.setcgpa(3.5);

        carol.setName("Carol White");
        carol.setId("S103");
        carol.sethomeTown("Chicago");
        carol.setcgpa(3.8);

        // Displaying student details using toString()
        System.out.println("Student Information:");
        System.out.println(john);
        System.out.println(mike);
        System.out.println(carol);

        // Creating a student using the parameterized constructor
        Student alice = new Student("Alice Brown", "S104", "San Francisco", 3.9);

        // Displaying Alice's details
        System.out.println("Student Created Using Parameterized Constructor:");
       System.out.println(alice);
    }
}