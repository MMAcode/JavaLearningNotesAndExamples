package topics;

import static helpers.StaticHelpers.p;

public class MethodNaming {
    static void method1(){p("hi");}
    static void Method1(){p("Hi");}
    static void mEthod1(){p("hI");}

    public static void main(String[] args) {
        method1();
        Method1();
        mEthod1();
    }
}
