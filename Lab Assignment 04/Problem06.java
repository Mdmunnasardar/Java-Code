class Fact {
    public int fact(int n) {
        if (n == 0 || n == 1) { 
            return 1;
        }
        return n * fact(n - 1);
    }
}

public class Problem06 {
    public static void main(String[] args) {
        Fact ob = new Fact(); 
        int num = 5;
        int result = ob.fact(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
