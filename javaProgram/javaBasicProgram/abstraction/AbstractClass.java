package abstraction;
// Abstract class
abstract class Shape {
    String name;
    // Constructor
    public Shape(String name) {
        this.name = name;
    }
    // Abstract method (no implementation)
    public abstract double calculateArea();
    // Concrete method
    public void displayInfo() {
        System.out.println("This is a " + name + ".");
    }
}
// Concrete subclass extending Shape
class Circle extends Shape {
    private double radius;
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
// Concrete subclass extending Shape
class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return length * width;
    }
}
// Main class to test the abstract class and its subclasses
public class AbstractClass {
    public static void main(String[] args) {
        // Cannot instantiate abstract class directly
        // Shape myShape = new Shape("Generic Shape"); // This would cause a compile-time error
        Circle circle = new Circle("Circle", 5.0);
        circle.displayInfo();
        System.out.println("Area of " + circle.name + ": " + circle.calculateArea());
        System.out.println(); // For better readability
        Rectangle rectangle = new Rectangle("Rectangle", 4.0, 6.0);
        rectangle.displayInfo();
        System.out.println("Area of " + rectangle.name + ": " + rectangle.calculateArea());
    }
}