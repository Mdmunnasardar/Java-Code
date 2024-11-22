public class Largest {

    public static void main(String[] args) {
        int size[] = { 1, 2, 3, 40, 59, 6, 70, 8, 9 };
        int largest = size[0];

        for (int i = 0; i < size.length; i++) {
            if (size[i] > largest) {
                largest = size[i];

            }
        }
        System.out.println(largest);
    }
}