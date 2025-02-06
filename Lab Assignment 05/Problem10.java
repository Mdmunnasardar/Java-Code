class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Student) {
            Student other = (Student) obj;
            return this.name.equals(other.name) && this.age == other.age;
        }
        return false;
    }
}

public class Problem10 {
    public static void main(String[] args) {
        Student student1 = new Student("Preota", 21);
        Student student2 = new Student("Mahmud", 22);
        Student student3 = new Student("Munna", 23);

        System.out.println(student1.toString());
        System.out.println(student2.toString());

        System.out.println(student1.equals(student2));
        System.out.println(student1.equals(student3));
    }
}
