
import java.util.Arrays;
import java.util.Collections;

public class Accending {
    public static void main(String[] args) {
        // Array of integers
        Integer[] numbers = {5, 2, 8, 1, 3};

        // Sorting in ascending order
        Arrays.sort(numbers);
        System.out.println("Ascending order: " + Arrays.toString(numbers));

        // Sorting in descending order
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending order: " + Arrays.toString(numbers));
    }
}


