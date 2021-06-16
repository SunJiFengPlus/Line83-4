package store;

import java.util.Arrays;

// Please don't modify the class name.
public class Store {
    Item[] items;

    // Please don't modify the signature of this method.
    public Store(Item[] items) {
        this.items = items;
    }
    
    public static Store of(Item[] items) {
        return new Store(items);
    }

    // Please don't modify the signature of this method.
    public void updateValue() {
        Arrays.stream(items).forEach(Item::updateValue);
    }
}