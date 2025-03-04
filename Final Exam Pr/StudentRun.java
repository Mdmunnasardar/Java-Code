class Student {
    private String name="Unknown" ;
    private int age=18 ;

   Student (){

   }
   Student (String name ){
    this.name = name;
   }
   public String getName(){
    return name;
   }
   public int getAge (){
    return age;
   }
}
public class StudentRun {
    public static void main(String[] args) {
        Student ob1= new Student();
        Student ob2= new Student();

        System.out.println(ob1.getName());
        System.out.println(ob1.getAge());
        System.out.println(ob2.getName());
        System.out.println(ob2.getAge());
    }
}
