class Parent {
    private String name;
    protected int roll;
    public String section;

    public Parent(String name, int roll, String section) {
        this.name = name;
        this.roll = roll;
        this.section = section;
    }

    public void Display() {
        System.out.println("Name: " + name + ", Roll: " + roll + ", Section: " + section);
    }
}

class Child extends Parent {
    public Child(String name, int roll, String section) {
        super(name, roll, section);
    }

    public void Show() {
        System.out.println("Roll: " + roll + ", Section: " + section);
    }
}

public class Problem04 {
    public static void main(String[] args) {
        Parent p = new Parent("Munna Sardar", 1540, "3J");
        p.Display();

        Child c = new Child("", 1540, "3J");
        c.Show();
    }
}
