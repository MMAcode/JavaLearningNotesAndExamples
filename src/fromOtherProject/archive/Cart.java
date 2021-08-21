package fromOtherProject.archive;

import java.util.ArrayList;
import java.util.List;

public class Cart implements Countable {
    private List<Box> boxes = new ArrayList<>();

    public void add (Box box){
        boxes.add(box);
    }

    @Override
    public int getCount() {
        return boxes
                .stream()
                .map(box->box.getCount())
                .reduce(0,(subtotal,element)->subtotal+element);
    }
}
