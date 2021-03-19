package store;

// Please don't modify the class name.
public class Store {
    Item[] items;

    // Please don't modify the signature of this method.
    public Store(Item[] items) {
        this.items = items;
    }

    // Please don't modify the signature of this method.
    public void updateValue() {
        for (Item item : items) {
            if (item.name.equals("Aged Wine")) {
                if (item.value < 50) {
                    item.value = item.value + 1;
                }
                item.sellIn = item.sellIn - 1;
                if (item.sellIn < 0) {
                    item.value = item.value + 1;
                }
            } else if (item.name.equals("Show Ticket")) {
                if (item.value < 50) {
                    item.value = item.value + 1;
                    if (item.sellIn < 11) {
                        if (item.value < 50) {
                            item.value = item.value + 1;
                        }
                    }
                    if (item.sellIn < 6) {
                        if (item.value < 50) {
                            item.value = item.value + 1;
                        }
                    }
                }
                item.sellIn = item.sellIn - 1;
                if (item.sellIn < 0) {
                    item.value = 0;
                }
            } else if (item.name.equals("Sulfuras")) {
                if (item.sellIn < 0) {
                    if (item.value > 0) {
                        item.value = item.value - 1;
                    }
                }
            } else {
                if (item.value > 0) {
                    item.value = item.value - 1;
                }
                item.sellIn = item.sellIn - 1;
                if (item.sellIn < 0) {
                    if (item.value > 0) {
                        item.value = item.value - 1;
                    }
                }
            }
        }
    }

}