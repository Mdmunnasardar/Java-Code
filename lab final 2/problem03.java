class Student {
    private String name;
    private String id;
    private String address;
    private double cgpa;

    // public Student(String name,int id,String address,double cgpa){

    //     this.name=name;
    //     this.id=id;
    //     this.address=address;
    //     this.cgpa=cgpa;
    // }
    public String getName() { 
        return name; 
    } 
 
    public void setName(String n) { 
        this.name = n; 
    } 
 
    public String getID() { 
        return id; 
    } 
 
    public void setID(String i) { 
        this.id = i; 
    }
    public String getAddress() { 
        return address; 
    } 
 
    public void setAddress(String a) { 
        this.address = a; 
    } 
 
    public double getCGPA() { 
        return cgpa; 
    
    } 
 
    public void setCGPA(double c) { 
        this.cgpa = c; 
    }


}





public class problem03 {
    public static void main(String[] args) {
        Student munna= new Student ();
        Student munna1= new Student ();

        munna.setName("munna");
        System.out.println(munna.getName());
    }
}
