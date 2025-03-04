// Step 1: Abstract class (cannot be instantiated)
abstract class Animal {
    // Step 2: Abstract method (no body, must be implemented by subclass)
    abstract void makeSound();
}

// Step 3: Subclass (inherits from Animal and implements the abstract method)
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!"); // Step 4: Provides actual method behavior
    }
}

// Step 5: Main class to execute the program
public class ab {
    public static void main(String[] args) {
        // Step 6: Creating an object of Dog using an Animal reference
        Animal ob = new Dog(); // Upcasting

        // Step 7: Calling the overridden method
        ob.makeSound(); // Output: Woof! Woof!
    }
}

