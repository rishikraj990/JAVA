package LLD.DesignPrinciples._1_SOLID._4_Interface_Segregation_P;

public class MainProgram {

    public static void main(String[] args){
        Printer printer = new Printer();

        I2DShape circle = new Shape.Circle(5);
        calculateArea(circle);
        printer.print(circle);

        I2DShape rectangle = new Shape.Rectangle(5, 2);
        calculateArea(rectangle);
        printer.print(rectangle);

        I2DShape square = new Shape.Square(4);
        calculateArea(square);
        printer.print(square);

        I3DShape cube = new Shape.Cube(8);
        calculateVolume(cube);
        printer.print(cube);
    }

    private static void calculateArea(I2DShape i2DShape){
        System.out.println("Area: " + i2DShape.getArea());
    }

    private static void calculateVolume(I3DShape i3DShape){
        System.out.println("Volume: " + i3DShape.getVolume());
    }

}
