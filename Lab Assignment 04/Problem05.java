class Number {
    int value;

    public Number(int value) {
        this.value = value;
    }
    public void display() {
        System.out.println("Number: " + value);
    }
}

public class Problem05 {

    public Number newNum(Number n, int newValue) {
        n.value = newValue;
        return n;            
    }

    public static void main(String[] args) {
        Number num1 = new Number(10);

        num1.display();

        Problem05 obj = new Problem05();
        Number updatedNum = obj.newNum(num1, 20);
        updatedNum.display();
    }
}
