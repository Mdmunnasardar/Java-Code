// Parent class with different access modifiers
class Parent {
    private int privateVar = 10;    // Private: Not accessible outside this class
    protected int protectedVar = 20; // Protected: Accessible within the same package and subclasses
    public int publicVar = 30;      // Public: Accessible from anywhere

    // Getter for private variable (optional)
    public int getPrivateVar() {
        return privateVar;
    }
}

// Child class inheriting Parent
class Child extends Parent {
    public void display() {
        // System.out.println("Private Variable: " + privateVar); // Not Accessible - Compile Error
        System.out.println("Protected Variable: " + protectedVar); // Accessible
        System.out.println("Public Variable: " + publicVar); // Accessible
    }
}

// Main class to run the program
public class AccessModifiersDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();

        // Direct access from outside the class
        // System.out.println("Private Variable: " + obj.privateVar); // Not Accessible - Compile Error
        System.out.println("Protected Variable: " + obj.privateVar);
        System.out.println("Protected Variable: " + obj.protectedVar); // Accessible (Same Package)
        System.out.println("Public Variable: " + obj.publicVar); // Accessible
    }
}
