package topics.types;

import static helpers.staticHelpers.TypeRecognizer.printTypeOf;

public class character {
    public static void main(String[] args) {
        printTypeOf(1+2);
        char c1=23;
        char c2=40;
        printTypeOf((Integer)(c1+c2));
        printTypeOf(Integer.valueOf(349));
    }
}
