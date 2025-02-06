class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " says Woof!");
    }
}

public class Problem02 {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.sound();
        System.out.println("Dog's name is: " + dog.name);
    }
}

