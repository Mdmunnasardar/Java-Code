// Number class with a single number field
class Number {
    int value;

    // Constructor to initialize value
    public Number(int value) {
        this.value = value;
    }

    // Method to display the number
    public void display() {
        System.out.println("Number: " + value);
    }
}

public class Problem05 {

    // Method to update the number and return the updated object
    public Number updateNumber(Number n, int newValue) {
        n.value = newValue; // Update the value
        return n;            // Return the updated object
    }

    public static void main(String[] args) {
        // Create a Number object with value 10
        Number num1 = new Number(10);

        // Display the original number
        num1.display();

        Problem05 obj = new Problem05();

        // Update the number to 20
        Number updatedNum = obj.updateNumber(num1, 20);

        // Display the updated number
        updatedNum.display();
    }
}
