public class sum {
    public static void main(String[] args) {
     int size[] ={1,2,3,4,5,6};
        int sum=0;
        for (int i=0;i<size.length;i++){
            sum+=size[i];
            //if you want  digit to another digit sum.like sum of each digit.
            System.out.print("  "+ sum);
           // System.out.print();
        }
        //final sum of all digit
        System.out.println(" sum off all digit: "+sum);
    }
}
