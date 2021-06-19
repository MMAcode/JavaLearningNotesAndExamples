package helpers;

import java.util.Arrays;

public class StaticHelpers {


    public static void p(Object o){ System.out.println(o); }
    public static void pt(Object o){
        //String classNameShort=o.getClass().getSimpleName();
        String className =o.getClass().getName();
        System.out.println(o + " ("+ className+")");
    }
    public static void pf(String s, Object ...o){
        System.out.printf(s,o);
        System.out.println();
    }

}
