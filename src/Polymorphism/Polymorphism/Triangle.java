package Polymorphism.Polymorphism;

public class Triangle extends Figure{
    private Point a, b, c;

    public Triangle(Color color, Point a, Point b, Point c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a);
    }

    @Override
    public double getArea() {
        double hp = getPerimeter() / 2.0;
        return Math.sqrt(
                hp
                * (hp - a.distanceTo(b))
                * (hp - b.distanceTo(c))
                * (hp - c.distanceTo(a))
        );
    }

    @Override
    public String toString() {
        return String.format("%s treugolnik", getColor().getName());
    }
}
