package fromOtherProject.archive;

import java.util.ArrayList;
import java.util.List;

public class Counter<T> implements Countable {
    private List<T> items = new ArrayList<>();

    public void add (T item){
        items.add(item);
    }

    @Override
    public int getCount() {
        return items.size();
    }
}
