package fromOtherProject.archive;

import java.util.ArrayList;
import java.util.List;

public class CounterMiro<T extends Countable> implements Countable{
    private List<T> items = new ArrayList<>();

    public void add (T item){
        items.add(item);
    }

    @Override
    public int getCount() {
        return items
                .stream()
                .map(item->item.getCount())
                .reduce(0,(subtotal,element)->subtotal+element);
    }
}
