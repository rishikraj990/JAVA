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

        /** ya square bhi ek type of rectangle hai pr hum rectangle ko parent aur square ko child nahi bana sakte,
         * kyoki wo square ke property ko breake kareg,
         * square me length, bredath nahi hota
         * esliye square extends rectangle ki jagah, square implements IShape is better option
         */
    }

    private static void calculateArea(IShape iShape){
        System.out.println("Area: " + iShape.getArea());
    }

}
