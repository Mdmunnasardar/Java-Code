class Animal {
    String name;
    int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Dog extends Animal {
    
    public Dog(String name, int age) {
        super(name, age);
    }
    
    public void bark() {
        System.out.println(name + " is barking!");
    }
}

public class Problem01 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3);
        myDog.display();
        myDog.bark();
    }
}
