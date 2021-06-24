package main;

import static helpers.staticHelpers.StaticMethods.p;
import static helpers.staticHelpers.TypeRecognizer.printTypeOf;//class Main_{ public static void main(String [] args) { }}

interface tt{
    void ahoj(String s);
}

public class Main {
    public static void main(String[] args) {
        //System.out.println() = p();   with type: pt(), formatted: pf()
        //this is template class
        System.out.println(true && false || false);
        System.out.println(false && false || true);
        System.out.println(true || false && false);
        System.out.println((true || false) && false);



    }


}
