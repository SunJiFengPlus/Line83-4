package store;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Please don't modify the class name.
public class Store {
    List<Item> items;

    // Please don't modify the signature of this method.
    public Store(Item[] items) {
        this.items = Arrays.stream(items).map(Item::of).collect(Collectors.toList());
    }

    // Please don't modify the signature of this method.
    public void updateValue() {
        items.forEach(Item::update);
    }

}