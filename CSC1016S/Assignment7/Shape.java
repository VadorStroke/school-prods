// Name:Modisane Gomolemo
// Student Number:MDSGOM004
// NumberUtils class program
// Date:27 September 2024

public class Shape {
    private String name;
    private String colour;

    public Shape(Shape shape) {
        this.name = shape.name;
        this.colour = shape.colour;// copy constructor for shape class
    }

    public Shape(String name, String colour) {
        this.name = name; // costructor for shape
        this.colour = colour;
    }

    public String toString() {
        return name + " " + colour;// returns the name and colour, formatted
    }

}
