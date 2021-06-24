package main;

import static helpers.staticHelpers.StaticMethods.p;
import static helpers.staticHelpers.TypeRecognizer.printTypeOf;//class Main_{ public static void main(String [] args) { }}

interface tt{
    void ahoj(String s);
}
class Hiden{
    public int v;

    public void visible(){ System.out.println("can yo usee me?"); }
//    public int v =3;
}
public class Main {
    public Hiden hiding = new Hiden();
    public static void main(String[] args) {
        //System.out.println() = p();   with type: pt(), formatted: pf()
        //this is template class

        Main m= new Main();
        m.hiding.visible();
        Hiden h= m.hiding;
        h.visible();



    }


}
