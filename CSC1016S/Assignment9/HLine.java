// Name: Modisnae Gomolemo
// Student number: MDSGOM004
// Date: 18 October 2024;
// Hline class;

public class HLine extends VectorObject {
    private int length;

    public HLine(int id, int x, int y, int length) {
        super(id, x, y);
        this.length = length;
    }

    public void draw(char[][] canvas) {
        for (int i = x; i < x + length && i < canvas[0].length; i++) {
            canvas[y][i] = '*';
        }
    }
}
