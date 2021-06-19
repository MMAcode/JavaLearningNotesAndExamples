package helpers;

import java.util.Arrays;

public class StaticHelpers {

    public static void pT(Object o){
        String className =o.getClass().getName();
        System.out.println(o + " ("+ className+")");
    }
    public static void p(Object o,Boolean... printClassName){
        //String classNameShort=o.getClass().getSimpleName();
        String className =o.getClass().getName();
        String stringToAppend = printClassName.length>0? " ("+ className+")" : "";
        System.out.println(o + stringToAppend);
    }
    // public static void p(Object ... objects){
    //     Arrays.stream(objects).forEach(o-> System.out.print(o));
    //     System.out.println();
    // }




    public static void pf(String s, Object ...o){
        System.out.printf(s,o);
        System.out.println();
    }

}
