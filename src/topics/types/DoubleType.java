package topics.types;

import static helpers.staticHelpers.TypeRecognizer.printTypeOf;

public class DoubleType {
    public static void main(String[] args) {

        double d = 23.45;
        int i = 23;
        System.out.println(i%2);
        System.out.println(d%2);


        printTypeOf(Double.parseDouble("11"));
        printTypeOf(Double.valueOf("22"));
        printTypeOf(Double.valueOf(33));

    }
}
