// Step 1: Define the interface Animal
interface Animal {
    void makeSound(); // Abstract method (no body)
}

// Step 2: Implement the interface in the Dog class
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("gheww gewhh!"); // Method implementation
    }
}

// Step 3: Main class to test the Dog object
public class interfaceCreate {
    public static void main(String[] args) {
        Dog ob = new Dog(); // Create an object of Dog class
        ob.makeSound(); // Call the implemented method
    }
}
