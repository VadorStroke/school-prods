public class Screen extends Computers {
    private int size;

    public Screen(String serial, String manufacturer, String colour, int size) {
        super(serial, manufacturer, colour);
        this.size = size;
    }

    public String toString() {
        return String.format("Screen: %s, %s, %s, %d", getSerialNum(), getColour(), getManufacturer(), this.size);
    }
}