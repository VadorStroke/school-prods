public class Shape {
    private String colour;
    private boolean filled;

    public Shape() {

    }

    public Shape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public boolean equals(Shape shape) {
        if (this.colour.equals(shape.colour) && this.filled == shape.filled) {
            return true;
        }
        return false;
    }

    public void setColor(String colour) {
        this.colour = colour;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    public String getColor() {
        return colour;
    }

    public String toString() {
        return colour + " " + filled;
    }
}
