package store;

// Please don't modify the class name.
public class Item {

    public String name;

    public int sellIn;

    public int value;

    // Please don't modify the signature of this method.
    public Item(String name, int sellIn, int value) {
        this.name = name;
        this.sellIn = sellIn;
        this.value = value;
    }

    // Please don't modify the signature of this method.
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.value;
    }

    public static Item of(Item item) {
        if (item.name.equals("Aged Wine")) {
            return new AgedWine(item.sellIn, item.value);
        } else if (item.name.equals("Show Ticket")) {
            return new ShowTicket(item.sellIn, item.value);
        } else if (item.name.equals("Sulfuras")) {
            return new Sulfuras(item.sellIn, item.value);
        }
        return item;
    }

    public void update() {
        if (value > 0) {
            value = value - 1;
        }
        sellIn = sellIn - 1;
        if (sellIn < 0) {
            if (value > 0) {
                value = value - 1;
            }
        }
    }
}
