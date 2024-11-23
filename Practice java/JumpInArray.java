public class JumpInArray {
    public static void main(String[] args) {
        int marks[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 95, 85 };

        for (int elements : marks) {
            if (elements == 40) {
                break;
            }
            System.out.println(elements);

        }
        System.out.println("************");

        for (int elements : marks) {
            if (elements == 50) {
                continue;
            }
            System.out.println(elements);
        }
        System.out.println("***********");

        boolean t = true;
        System.out.println("True condition");
        if (t)
            return;
        System.out.println("the condition false");

    }
}
