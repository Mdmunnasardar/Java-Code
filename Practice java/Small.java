public class Small {
   
        public static void main(String[] args) {
            int size[] = { 40, 59, 60, 35,70, 80, 90 };
            int small = size[0];
    
            for (int i = 0; i < size.length; i++) {
                if (size[i] < small)
                 {
                    small = size[i];
    
                }

            }
            System.out.println(small);
        }
    }

