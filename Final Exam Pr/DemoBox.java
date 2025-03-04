class Box {
    double width,height,depth;

    Box (double w, double h, double d){
        width=w;
        height= h;
        depth=d;

    }
    Box (){
        width=-1;
        height=-1;
        depth=-1;

    }

    Box (double len){
        width=height= depth= len;

    }
     double volume(){
        return width * height*depth;
     }
}
class BoxWeight  extends Box{
    double weight;

    BoxWeight( double w,double h,double d,double we){
       
        width=w;
        height= h;
        depth=d;
        weight=we;
    }

}

public class DemoBox {
    public static void main(String[] args) {
        BoxWeight ob= new BoxWeight(3, 03, 5, 3.124);
        BoxWeight ob1= new BoxWeight(1, 10, 02, 02);

        System.out.println(ob.volume());
        System.out.println("MY Box weight: "+ob.weight);


        System.out.println(ob1.volume());
        System.out.println(" object 2 Box weight : "+ob.weight);
    }
    
}
