package OOP.Lecture01.Ex003;

/**
 * Это точка 2D
 */

public class Point2D {
    private int x, y;

    /**
     * Это конструктор
     * 
     * @param valueX это координата х
     * @param valueY это координата y
     */

    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point2D(int value) {
        this(value, value);
    }

    public Point2D() {
        this(0);
    }

    // public Point2D(int value) {
    // x = value;
    // y = value;
    // }
    // public Point2D() {
    // x = 0;
    // y = 0;
    // }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int value) {
        this.x = value;
    }

    public void setY(int value) {
        this.y = value;
    }

    private String getInfo() {
        return String.format("x: %d; y: %d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public static Object distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
}
