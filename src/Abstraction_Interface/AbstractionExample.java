package Abstraction_Interface;

// Abstract class
abstract class Vehicle {
    String brand;

    // Constructor
    Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method (no implementation)
    abstract void start();

    // Concrete method (implemented)
    void stop() {
        System.out.println(brand + " is stopping...");
    }
}

// Concrete subclass
class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }

    // Implementing abstract method
    @Override
    void start() {
        System.out.println(brand + " car is starting with a key...");
    }
}

// Another concrete subclass
class Bike extends Vehicle {
    Bike(String brand) {
        super(brand);
    }

    // Implementing abstract method
    @Override
    void start() {
        System.out.println(brand + " bike is starting with a self-start button...");
    }
}

// Main class
public class AbstractionExample {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota");
        myCar.start(); // Output: Toyota car is starting with a key...
        myCar.stop();  // Output: Toyota is stopping...

        Vehicle myBike = new Bike("Yamaha");
        myBike.start(); // Output: Yamaha bike is starting with a self-start button...
        myBike.stop();  // Output: Yamaha is stopping...
    }
}
