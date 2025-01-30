class CallByValueReference {

    public void modifyPrimitive(int x) {
        x = 50;
    }

    public void modifyObject(Person p) {
        p.setName("Updated Name");
    }
}

public class Problem04 {
    public static void main(String[] args) {
        CallByValueReference obj = new CallByValueReference();

        int num = 10;
        System.out.println("Before Call by Value: " + num);
        obj.modifyPrimitive(num);
        System.out.println("After Call by Value: " + num);

        Person person1 = new Person("Alice");
        System.out.println("Before Call by Reference: " + person1.getName());
        obj.modifyObject(person1);
        System.out.println("After Call by Reference: " + person1.getName());
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
