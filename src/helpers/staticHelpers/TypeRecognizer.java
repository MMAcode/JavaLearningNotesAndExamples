package helpers.staticHelpers;

public class TypeRecognizer {
    public static void main(String[] args) {

    }
   public static void printTypeOf(byte i){ System.out.println(i+": byte"); }
   public static void printTypeOf(short i){ System.out.println(i+": short"); }
   public static void printTypeOf(int i){ System.out.println(i+": int"); }
   public static void printTypeOf(long i){ System.out.println(i+": long"); }
   public static void printTypeOf(float i){ System.out.println(i+": float"); }
   public static void printTypeOf(double i){ System.out.println(i+": double"); }
   public static void printTypeOf(Object i){
       System.out.println(i+": " + (i==null ? "null":i.getClass().getName()));

   }
}

