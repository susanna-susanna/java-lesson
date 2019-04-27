package Polymorphism.Polymorphism;

public class Circle extends Figure {
    private Point center;
    private double radius;

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    Circle(Color color, Point center, double radius) {
        super(color);
        this.center = center;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("%s krug", getColor().getName());
    }
}
