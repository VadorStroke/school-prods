// Name: Modisnae Gomolemo
// Student number: MDSGOM004
// Date: 18 October 2024;
// Rectangle class;

public class Rectangle extends VectorObject {
    private int width;
    private int height;

    public Rectangle(int id, int x, int y, int width, int height) {
        super(id, x, y);
        this.width = width;
        this.height = height;
    }

    public void draw(char[][] canvas) {
        for (int i = x; i < x + width && i < canvas.length; i++) {
            for (int j = y; j < y + height && j < canvas[0].length; j++) {
                canvas[i][j] = '*';
            }
        }
    }
}
