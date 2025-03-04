public class passValue {
    // int a,b;

    // passValue(int i,int j){
    // a=i;
    // b=j;

    // }

    void method(int i, int j) {
        i *= 2;
        j += 2;
    }

    public static void main(String[] args) {
        passValue ob = new passValue();
        int a = 20, b = 30;
        System.out.println(a + "  " + b);

        ob.method(a, b);

        System.out.println(a + " " + b);
    }
}
