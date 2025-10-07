// Question 6: Interface & Multiple Inheritance

// Create two interfaces:
// Flyable → has method void fly().
// Swimmable → has method void swim().
// Create a class Duck that implements both interfaces (Flyable & Swimmable):
// Implement fly() → prints "Duck is flying".
// Implement swim() → prints "Duck is swimming".
// In main():
// Create a Duck object.
// Call both fly() and swim() methods.
interface Flyable {

    void fly();
}

interface Swimmable {

    void swim();
}

class Duck implements Flyable, Swimmable {

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}

class TestFly {

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}
