import java.util.Scanner;

class Rectangle {
    double length, breadth;

    // Method to input rectangle dimensions
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: "); length = sc.nextDouble();
        System.out.print("Enter breadth: "); breadth = sc.nextDouble();
    }

    // Method to calculate area
    double area() {
        return length * breadth;
    }

    // Method to calculate perimeter
    double perimeter() {
        return 2 * (length + breadth);
    }

    // Method to display area and perimeter
    void display() {
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.input();
        r.display();
    }
}
