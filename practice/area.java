
abstract class Shape {

    abstract double area();

    void displayArea() {
        System.out.println("Area:" + area());
    }
}

class Circle extends Shape {

    int r;

    Circle(int r) {
        this.r = r;
    }

    double area() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {

    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    double area() {
        return width * height;
    }
}

class area {

    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(3, 4);

        circle.displayArea();
        rectangle.displayArea();
    }
}
