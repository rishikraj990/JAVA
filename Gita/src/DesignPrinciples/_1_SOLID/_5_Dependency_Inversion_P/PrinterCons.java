package DesignPrinciples._1_SOLID._5_Dependency_Inversion_P;

public class PrinterCons implements IPrinter {

    public void print(IShape iShape){
        System.out.println("Print: " + iShape);
    }

}
