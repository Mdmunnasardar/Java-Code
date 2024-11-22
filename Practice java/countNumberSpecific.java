public class countNumberSpecific {
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,3,4,2,2,2,3,4,5,3};
        int count=0;
        int target=2;

        int size=arr.length;
        for (int i=0;i<size;i++){
            if(arr[i]==target)
            {
                count++;
            }
            
        }
        System.out.println("Target: "+target);
        System.out.println("Occurenc of: "+count);
        
    }
}
