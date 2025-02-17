class Student {
    private String name;
    private String id;
    private String address;
    private double cgpa;

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

public class Problem05 {
    public static void main(String[] args) {
    
        Student munna = new Student();
        Student shahjalal = new Student();
        Student preota = new Student();

        munna.setName("Munna Sardar");
        munna.setID("11230321540");
        munna.setAddress("Darogavita,Khulna");
        munna.setCGPA(3.86);

        shahjalal.setName("Shahjalal Mahmud");
        shahjalal.setID("11230321539");
        shahjalal.setAddress("Rohim Shorok,Khulna");
        shahjalal.setCGPA(3.98);

        preota.setName("Preota Saha");
        preota.setID("11230321538");
        preota.setAddress("Nirala,Khulna");
        preota.setCGPA(3.9);

     
        System.out.println("Student 1: " + munna.getName() + ", ID: " + munna.getID() + ", Address: " + munna.getAddress() + ", CGPA: " + munna.getCGPA());
        System.out.println();
        System.out.println("Student 2: " + shahjalal.getName() + ", ID: " + shahjalal.getID() + ", Address: " + shahjalal.getAddress() + ", CGPA: " + shahjalal.getCGPA());
        System.out.println();
        System.out.println("Student 3: " + preota.getName() + ", ID: " + preota.getID() + ", Address: " + preota.getAddress() + ", CGPA: " + preota.getCGPA());
    }
}
