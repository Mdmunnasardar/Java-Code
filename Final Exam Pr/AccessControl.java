class AccessControl {
    int a;
    public int b;
    private int c;

    void setc(int i) {
        c = i;
    }

    int getc() {
        return c;
    }

    public static void main(String[] args) {
        AccessControl ob = new AccessControl();

        ob.a = 10;
        ob.b = 20;

        // ob.c=30;
        ob.setc(100);

        ob.getc();
        System.out.println(" a , b ANd C : " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
