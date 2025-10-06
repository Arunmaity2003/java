// 🧩 Question 4: Constructor Chaining using super

// Create two classes:
// Parent class → Vehicle
// Has a constructor that takes a String brand and prints:
// Vehicle brand: <brand>
// Child class → Car
// Inherits from Vehicle.
// Has a constructor that takes String brand and int speed.
// Calls the parent class constructor using super(brand).
// Then prints:
// Car speed: <speed> km/h
// In your main() method:
// Create a Car object with "Tesla" as brand and 200 as speed.
// Observe the order of constructor execution.
class Vehicle {

    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle brand: " + brand);
    }
}

class Car extends Vehicle {

    int speed;

    public Car(String brand, int speed) {
        super(brand);
        this.speed = speed;
        System.out.println("Car speed: " + speed);
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

public class VehicleCar {

    public static void main(String[] args) {
        Car c = new Car("Tesla", 200);
        c.displayInfo();
    }
}
