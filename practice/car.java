// 🧩 Question 1: Basic Class & Object

// Create a Java class called Car that has:
// Two instance variables: brand (String) and speed (int).
// A constructor to initialize both fields.
// A method displayInfo() that prints:
// Brand: Tesla, Speed: 120 km/h
// Then, create an object of this class in the main method and call displayInfo().
class car {

    String brand;
    int speed;

    public car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Brand: " + this.brand + ", Speed: " + this.speed + " km/h");
    }

    public static void main(String[] args) {
        car c = new car("Tesla", 120);
        c.displayInfo();
    }
}
