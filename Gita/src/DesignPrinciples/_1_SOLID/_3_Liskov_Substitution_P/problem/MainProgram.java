package DesignPrinciples._1_SOLID._3_Liskov_Substitution_P.problem;

public class MainProgram {

    public static void main(String[] args){
        Printer printer = new Printer();

        Shape.Circle circle = new Shape.Circle(5);
        calculateArea(circle);
        printer.print(circle);

        Shape.Rectangle rectangle = new Shape.Rectangle(5, 2);
        calculateArea(rectangle);
        printer.print(rectangle);

        Shape.Square square = new Shape.Square(4, 5);
        calculateArea(square);
        printer.print(square);
    }

    private static void calculateArea(IShape iShape){
        System.out.println("Area: " + iShape.getArea());
    }

}
