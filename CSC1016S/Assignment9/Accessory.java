// Name: Modisnae Gomolemo
// Student number: MDSGOM004
// Date: 18 October 2024;
// Accessories class;

public class Accessory extends Computers {

    public Accessory(String serial, String manufacturer, String colour) {
        super(serial, manufacturer, colour);
    }

    public String toString() {
        return String.format("Accessories: %s, %s, %s", getSerialNum(), getManufacturer(), getColour());
    }

}