package DesignPrinciples._1_SOLID._5_Dependency_Inversion_P.problem;

public class MainProgram {

    public static void main(String[] args){
        Printer printer = new Printer();

        Shape.Circle circle = new Shape.Circle(5);
        calculateArea(circle);
        printer.print(circle);

        Shape.Rectangle rectangle = new Shape.Rectangle(5, 2);
        calculateArea(rectangle);
        printer.print(rectangle);

        Shape.Square square = new Shape.Square(4);
        calculateArea(square);
        printer.print(square);

        Shape.Cube cube = new Shape.Cube(8);
        calculateVolume(cube);
//        printer.print(cube);
        printer.printf(cube);
    }

    private static void calculateArea(I2DShape i2DShape){
        System.out.println("Area: " + i2DShape.getArea());
    }

    private static void calculateVolume(I3DShape i3DShape){
        System.out.println("Volume: " + i3DShape.getVolume());
    }

}
