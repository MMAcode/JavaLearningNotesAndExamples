package main;

class Main_{ public static void main(String [] args) { }}
//protected class Main_{ public static void main(String [] args) { }}
//private class Main_{ public static void main(String [] args) { }}

interface i1{}
//private interface i2{}

public class Main {
    class someClass1 {}
    private class someClass2 {}
    protected class someClass3 {}
    public class someClass4 {}
    interface i2{} //public by default
    private interface i3{}
    protected interface i4{}

    public static void main(String[] args) {
        System.out.println("ahoj");
    }
}
