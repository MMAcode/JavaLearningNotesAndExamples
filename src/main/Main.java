package main;

class Main1{
    public static void main(String [] args) { System.out.println("from main_"); }
    public static void testMe(){System.out.println("from main_ testme");};
} // nothing from this class will be accessible in other packages
//protected class Main_{ public static void main(String [] args) { }}
//private class Main_{ public static void main(String [] args) { }}

interface i1{void hi(String s);}
//private interface i2{}

public class Main implements i1{

    class someClass1 {}
    private class someClass2 {}
    protected class someClass3 {}
    public class someClass4 {}
    interface i2{} //NOT public by default, only methods are public by default
    private interface i3{}
    protected interface i4{}

    public static void main(String[] args) {
        System.out.println("ahoj");
    }

    public void hi(String ss){}
    public void hi(int ss){}
}
//class AC1 implements i1{}
abstract class AC2 implements i1{}
