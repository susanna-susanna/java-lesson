package Polymorphism.Polymorphism;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Figure {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public double getArea() {
        throw new NotImplementedException();
    }

    public double getPerimeter() {
        throw new NotImplementedException();
    }

    public Color getColor() {
        return color;
    }
}
