class Person {
    String n;
    int a;

    public Person(String n, int a) {
        this.n = n;
        this.a = a;
        System.out.println("Person constructor called.");
    }

    public void displayInfo() {
        System.out.println("Name: " + n);
        System.out.println("Age: " + a);
    }
}

class Employee extends Person {
    String job;

    public Employee(String n, int a, String j) {
        super(n, a);
        this.job = j;
        System.out.println("Employee constructor called.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Job Title: " + job);
    }
}

public class Problem05 {
    public static void main(String[] args) {
        Employee e = new Employee("Munna", 23, "Software Developer");
        e.displayInfo();
    }
}
