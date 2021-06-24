package topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static helpers.staticHelpers.StaticMethods.p;

public class ArraylistMethods {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(1,2,3));
        p(l);
        l.add(4);
        p(l);
        l.add(1,5);
        p(l);
    }
}
