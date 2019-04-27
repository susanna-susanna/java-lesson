package Polymorphism.Polymorphism;

public class HalfTransporentCircle extends Circle{
    HalfTransporentCircle(Color color, Point center, double radius) {
        super(new Color(String.format("poluprozrachniy %s", color.getName())), center, radius);
    }

    @Override
    public Color getColor() {
        Color parentColor = super.getColor();
        return new Color(String.format("poluprozrachniy %s", parentColor.getName()));

    }
}
