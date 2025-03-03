public class constructor1 {
    double length;
    double height;
// defalut con 
    // constructor1(){
    //     length=10;
    //     height=20;
    // }
    // //non para meter method ct+/


///parameter constructor 
    constructor1(double length,double height){
        this.length=length;
        this.height= height;
    }
    
    //non para meter method 
 double meth (){
    return length*height;
    
 }

    public static void main(String[] args) {
        constructor1 ob = new constructor1(5,7);

        System.out.println("Volume is : " + ob.meth());
    }

}

