
final class Constants {

    static final double PI = 3.14159;
}

class Shape {

    final void displayShape() {
        System.out.println("Displaying shape details...");
    }
}

class Circle extends Shape {

    void area(int radius) {
        System.out.println("Area: " + Constants.PI * radius * radius);
    }
}

class FinalKeyword {

    public static void main(String[] args) {
        Circle c = new Circle();
        c.displayShape();
        c.area(4);
    }
}
