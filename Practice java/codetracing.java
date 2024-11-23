public class codetracing {
    
        public static void main(String[] args) {
            // Step 1: Define the ID as an array of integers
            int[] id = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};  // Example ID: 1234567890
            
            // Step 2: Extract the last two digits
            int lastDigit = id[id.length - 1];  // Last digit (0)
            int secondLastDigit = id[id.length - 2]+4;  // Second last digit (9)
    
            // Step 3: Add second last digit to the last digit
            int sumLastTwoDigits = lastDigit + secondLastDigit;  // 9 + 0 = 9
            
            // Step 4: Create a loop to print "Hello World"
            for (int i = 1; i <= sumLastTwoDigits; i++) {  // Loop from index 1 to 9
                System.out.println("Hello World");
            }
        }
    }
    

