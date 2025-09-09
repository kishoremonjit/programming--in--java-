// Superclass
class ShapeLab11 {
    public void area() {
        System.out.println("Area method in Shape class");
    }
}

// Subclass Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

// Subclass Triangle
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void area() {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle: " + result);
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

// Main class to demonstrate runtime polymorphism
public class Main {
    public static void main(String[] args) {
        Shape s;

        // Circle object
        s = new Circle(7);
        s.area();  // Calls Circle's area()

        // Triangle object
        s = new Triangle(5, 10);
        s.area();  // Calls Triangle's area()

        // Rectangle object
        s = new Rectangle(4, 8);
        s.area();  // Calls Rectangle's area()
    }
}
