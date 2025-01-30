class Car {
    String model;

    public Car(String model) {
        this.model = model;
    }

    public void CarName(Car car) {
        System.out.println("This car is a " + car.model);
    }
}
public class Problem03 {
    public static void main(String args[]) {
        
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda");


        car1.CarName(car2); 
        car2.CarName(car1); 
    }
}
