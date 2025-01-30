class Number {
    private int num;  

    protected Number(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    protected int square() {
        return num * num;
    }

    public void showSquare() {
        System.out.println("Square of " + num + " is " + square());
    }
}

public class Problem08 {
    public static void main(String[] args) {
        Number n = new Number(5);
        System.out.println("Number: " + n.getNum()); 
        n.setNum(8);  
        n.showSquare();  
    }
}
