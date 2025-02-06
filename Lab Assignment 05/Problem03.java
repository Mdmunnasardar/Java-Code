class Vehicle {
    public void move() {
        System.out.println("The vehicle is moving at a normal speed.");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("The car is moving on the road.");
    }
}

public class Problem03 {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.move();

        Vehicle myCar = new Car();
        myCar.move();
    }
}
