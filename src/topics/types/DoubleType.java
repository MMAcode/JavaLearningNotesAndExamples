package topics.types;

import static helpers.staticHelpers.TypeRecognizer.printTypeOf;

public class DoubleType {
    public static void main(String[] args) {
        printTypeOf(Double.parseDouble("11"));
        printTypeOf(Double.valueOf("22"));
        printTypeOf(Double.valueOf(33));

    }
}
