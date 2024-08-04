package DesignPrinciples._1_SOLID._5_Dependency_Inversion_P;

public class PrinterF implements IPrinter {

    public void print(IShape iShape){
        System.out.printf("PrintF: " + iShape);
    }

}
