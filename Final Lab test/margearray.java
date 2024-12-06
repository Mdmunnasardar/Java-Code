import java.util.Scanner; 
public class margearray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n1; i++)
            arr1[i] = sc.nextInt();

        System.out.print("Enter number of elements in second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n2; i++)
            arr2[i] = sc.nextInt();


        int[] mergedArray = new int[n1 + n2];
        System.arraycopy(arr1, 0, mergedArray, 0, n1);
        System.arraycopy(arr2, 0, mergedArray, n1, n2);
        System.out.print("Merged array: ");
       // for (int num : mergedArray)
         //   System.out.print(num + " ");

            for (int i = 0; i < mergedArray.length; i++) {
                System.out.print(mergedArray[i] + " ");
            }
            
            sc.close();
    }
}
