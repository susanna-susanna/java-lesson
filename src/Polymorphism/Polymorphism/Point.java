package Polymorphism.Polymorphism;

public class Point {
    private int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distanceTo(Point other) {
        return getDistance(this, other);
    }

    public static double getDistance(Point a, Point b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2)
        + Math.pow(a.getY() - b.getY(), 2));
    }
}
