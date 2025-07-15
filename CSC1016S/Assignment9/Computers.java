// Name: Modisnae Gomolemo
// Student number: MDSGOM004
// Date: 18 October 2024;
// Accessories class;

public class Computers {
    private String serialNum;
    private String manufacturer;
    private String colour;

    public Computers(String serial, String manufacturer, String colour) {
        this.serialNum = serial;
        this.manufacturer = manufacturer;
        this.colour = colour;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public String getManufacturer() {
        return manufacturer;

    }

    public String getColour() {
        return colour;
    }
}