// Name:Modisane Gomolemo
// Student Number:MDSGOM004
// NumberUtils class program
// Date:27 September 2024

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, String colour, double height, double width) {
        super(name, colour); // Costructor for rectangle
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);// Copy constructor
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public String toString() {
        return super.toString() + " " + "Length" + " " + height + " Width " + width;
        // called the toString from the parent class and concatenates on it
    }

}
