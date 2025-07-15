// Name:Modisane Gomolemo
// Student Number:MDSGOM004
// NumberUtils class program
// Date:27 September 2024

public class Circle extends Shape {
    private double radius;

    public Circle(String name, String colour, double radius) {
        super(name, colour);// Circle constructor
        this.radius = radius;
    }

    public Circle(Circle circle) {
        super(circle);// Copy constructor
        this.radius = circle.radius;
    }

    public String toString() {
        return super.toString() + " Radius " + radius;
        // called the toString from the parent class and concatenates on it
    }
}
