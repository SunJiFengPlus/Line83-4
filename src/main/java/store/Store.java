package store;

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
        for (Item item : items) {
            if (item.name.equals("Aged Wine")) {
                item.updateValue();
            } else if (item.name.equals("Show Ticket")) {
                item.updateValue();
            } else if (item.name.equals("Sulfuras")) {
                item.updateValue();
            } else {
                item.updateValue();
            }
        }
    }
}