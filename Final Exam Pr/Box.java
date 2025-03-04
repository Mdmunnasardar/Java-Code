class Box {
    int value;

    Box(int value) {
        this.value = value;
    }

    void modify(Box obj) {
        obj.value += 10; // Changes original object
    }
  
    public static void main(String[] args) {
        Box b = new Box(5);
        b.modify(b);
        System.out.println("Value after method call: " + b.value); // 15
    }
}
    

