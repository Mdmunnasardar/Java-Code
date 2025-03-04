class Munna {
    int a, b;

    void show() {
        System.out.println("a and b value : " + a + " " + b);
    }
}

class sardar extends Munna {
    int c;

    void showExtends() {
        System.out.println("c value : " + c);
    }

    void sum() {
        System.out.println(a+b+c);

    }
}

public class inheritance {
    public static void main(String[] args) {
        Munna ob = new Munna();
        sardar ob2 = new sardar();

        ob.a = 10;
        ob.b = 20;
        System.out.println("content of super class: ");
        ob.show();

        ob2.a = 4;
        ob2.b = 8;
        ob2.c = 9;
        System.out.println(" conten of sub class: ");
        ob2.show();
        ob2.showExtends();

        System.out.println();
        ob2.sum();

    }
}
