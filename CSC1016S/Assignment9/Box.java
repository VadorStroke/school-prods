// Name: Modisnae Gomolemo
// Student number: MDSGOM004
// Date: 18 October 2024;
// Box class;

public class Box extends Computers {
    private int memory;

    public Box(String serial, String manufacturer, String colour, int memory) {
        super(serial, manufacturer, colour);
        this.memory = memory;
    }

    public String toString() {
        return String.format("Box: %s, %s, %s, %d", getSerialNum(), getManufacturer(), getColour(), this.memory);
    }
}