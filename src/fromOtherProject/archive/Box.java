package fromOtherProject.archive;

import java.util.ArrayList;
import java.util.List;

public class Box<T> implements Countable {
    private List<T> items = new ArrayList<>();

    public Box(T a, T b){
        items.add(a);
        items.add(b);
    }

    @Override
    public int getCount() {
        return items.size();
    }
}
