package Polymorphism.Polymorphism;

public class Main {
    static double totalArea = 0.0;
    static double totalPerimeter = 0.0;

    static void addFigure(Figure figure) {
        totalArea += figure.getArea();
        totalPerimeter += figure.getPerimeter();

    }
    public static void main(String[] args) {
        Color red = new Color("red");
        Color blue = new Color("blue");

        Figure figure;
        figure = new Triangle(
                red,
                new Point(0, 0),
                new Point(3, 0),
                new Point(0, 4)
                );

        System.out.println(figure);
        addFigure(figure);
        System.out.format("area=%.2f\nperimeter=%.2f", totalArea, totalPerimeter);
        System.out.println();

        figure = new Circle(
                blue,
                new Point(0, 0),
                1
        );
        System.out.println(figure);
        addFigure(figure);
        System.out.format("area=%.2f\nperimeter=%.2f", totalArea, totalPerimeter);
        System.out.println();

        figure = new Line(
                red,
                new Point(1, 1),
                new Point(-1, -1)
        );

        System.out.println(figure);
        addFigure(figure);
        System.out.format("area=%.2f\nperimeter=%.2f", totalArea, totalPerimeter);
        System.out.println();

        figure = new HalfTransporentCircle(
                blue,
                new Point(0, 0),
                1
        );
        System.out.println(figure);
        addFigure(figure);
        System.out.format("area=%.2f\nperimeter=%.2f", totalArea, totalPerimeter);
        System.out.println();


        //System.out.println(triangle.getPerimeter());
        /*Figure someFigure = triangle;
        System.out.println(someFigure.getPerimeter());  //вот эти две строчки равнозначны предыдущей.*/
    }
}
