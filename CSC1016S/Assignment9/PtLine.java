// Name: Modisnae Gomolemo
// Student number: MDSGOM004
// Date: 18 October 2024;
// PtLine class;

public class PtLine extends VectorObject {
    private int endX;
    private int endY;

    public PtLine(int id, int startX, int startY, int endX, int endY) {
        super(id, startX, startY);
        this.endX = endX;
        this.endY = endY;
    }

    public void draw(char[][] canvas) {
        int deltaX = Math.abs(endX - x);
        int deltaY = Math.abs(endY - y);

        int stepX = 0;
        int stepY = 0;

        if (x < endX) {
            stepX = 1;
        } else {
            stepX = -1;
        }

        if (y < endY) {
            stepY = 1;
        } else {
            stepY = -1;
        }

        int error = deltaX - deltaY;
        int currentX = x;
        int currentY = y;

        boolean checker = true;
        while (checker) {
            if (currentX >= 0 && currentX < canvas[0].length && currentY >= 0 && currentY < canvas.length) {
                canvas[currentY][currentX] = '*';
            }
            if (currentX == endX && currentY == endY) {
                break;
            }

            int error2 = 2 * error;
            if (error2 > -deltaY) {
                error -= deltaY;
                currentX += stepX;
            }
            if (error < deltaX) {
                error += deltaX;
                currentY += stepY;
            }
        }

    }
}
