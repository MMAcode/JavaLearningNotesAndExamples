package helpers;


public class StaticHelpers implements {
    public static void p(Object o,Boolean... printClassName){
//        String classNameShort=o.getClass().getSimpleName();
        String className =o.getClass().getName();
        String stringToAppend = printClassName.length>0? " ("+ className+")" : "";
        System.out.println(o + stringToAppend);
    }
    public static void pf(String s, Object ...o){
        System.out.printf(s,o);
        System.out.println();
    }

}
