final class FinalClass {

    final int maxValue = 100;

    final void display() {
        System.out.println("This is a final method.");
    }
}

class Problem09 {
    public static void main(String[] args) {

        FinalClass obj = new FinalClass();
        System.out.println("Max value: " + obj.maxValue);

        obj.display();

    }
}
