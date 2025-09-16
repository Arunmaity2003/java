abstract class Shape {
    abstract double area();

    public void display() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {
    double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 3.14 * radius * radius;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape[] shapes = { new Rectangle(3, 6), new Circle(5) };

        for (Shape s : shapes) {
            s.display();
            System.out.println("Area: " + s.area());
            System.out.println("----");
        }
    }
}
