package main;

import static helpers.staticHelpers.StaticMethods.p;
import static helpers.staticHelpers.TypeRecognizer.printTypeOf;//class Main_{ public static void main(String [] args) { }}

public class Main {
    public static void main(String[] args) {
        //System.out.println() = p();   with type: pt(), formatted: pf()
        //this is template class
       printTypeOf(1+2);
       char c1=23;
       char c2=40;
       printTypeOf((Integer)(c1+c2));
       printTypeOf(Integer.valueOf(349));



    }


}
