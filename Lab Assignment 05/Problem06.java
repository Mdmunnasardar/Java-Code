class Animal {
    String type = "Animal";

    public void displayType() {
        System.out.println("Type: " + type);
    }
}

class Mammal extends Animal {
    String category = "Mammal";

    public void displayCategory() {
        System.out.println("Category: " + category);
    }
}

class Dog extends Mammal {
    String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    public void displayBreed() {
        System.out.println("Breed: " + breed);
    }
}

public class Problem06 {
    public static void main(String[] args) {
        Dog d = new Dog("Golden Retriever");
        d.displayType();     
        d.displayCategory();  
        d.displayBreed();    
    }
}
