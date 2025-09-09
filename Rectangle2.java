//Two string method

package com.OOPJ;

class Rectangle {
    private double length;
    private double breadth;

    // Constructor
    public Rectangle(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    // Method to calculate area
    public double getArea() {
        return this.length * this.breadth;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "Rectangle [length = " + this.length + ", breadth = " + this.breadth + "]";
    }
}

// Test class
class RectangleClass {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3.9, 8.9);

        System.out.println("Area: " + r1.getArea());
        System.out.println(r1);  // calls toString()
    }
}