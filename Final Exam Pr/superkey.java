class animal {
    String name = "Animal";

    animal(){
        System.out.println("Animal constructor called");

    }
    void sound (){
        System.out.println("Animal make sound ");
    }
}
class dog extends animal {
    String name ="Dog";

    dog(){
        super();
        System.out.println("Dog constrcutor called");
    }
    void display (){
        System.out.println("sub class name : "+name);
        System.out.println("super class name : "+super.name);//refrence to animal name by super.name
        super.sound();// calling the super class method by super 

    }
}

public class superkey {
    public static void main(String[] args) {
        dog ob = new dog();

        ob.display();
    }
    
}
