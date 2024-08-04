package DesignPrinciples._1_SOLID._4_Interface_Segregation_P;

public class Printer {

    public void print(IShape iShape){
        System.out.println("Print: " + iShape);
    }

}
