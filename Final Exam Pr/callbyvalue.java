class callbyvalue {
    void modify(int num) {
        num = num + 10; // Changes only local copy
    }

    public static void main(String[] args) {
        int a = 5;
        callbyvalue obj = new   callbyvalue();
        obj.modify(a);
        System.out.println("Value after method call: " + a); // Still 5
    }
}

