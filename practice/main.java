// Question 3: Inheritance + Method Overriding

// Create the following class hierarchy:
// Parent class → Animal
// Method: void sound() → prints "Animal makes a sound".
// Child class → Dog
// Inherits from Animal.
// Overrides the sound() method to print "Dog barks".
// Child class → Cat
// Inherits from Animal.
// Overrides the sound() method to print "Cat meows".
// In your main() method:
// Create objects of Animal, Dog, and Cat.
// Call the sound() method on each to demonstrate method overriding.
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

class main {

    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();
        Animal c = new Cat();
        a.sound();
        d.sound();
        c.sound();
    }
}
