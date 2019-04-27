package Polymorphism.Polymorphism;

public class Line extends Figure {
    private Point a, b;

    public Line(Color color, Point a, Point b) {
        super(color);
        this.a = a;
        this.b = b;
    }
    @Override
    public double getPerimeter() {
        return a.distanceTo(b);
    }

    @Override
    public double getArea() {
        return 0.0;
    }

    @Override
    public String toString() {
        return String.format("%s linia", getColor().getName());
    }
}
