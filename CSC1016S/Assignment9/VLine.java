// Name: Modisnae Gomolemo
// Student number: MDSGOM004
// Date: 18 October 2024;
// Vline class;

public class VLine extends VectorObject {
    private int length;

    public VLine(int id, int x, int y, int length) {
        super(id, x, y);
        this.length = length;

    }

    public void draw(char[][] canvas) {
        for (int i = y; i < y + length && i < canvas.length; i++) {
            canvas[i][x] = '*';
        }
    }
}
