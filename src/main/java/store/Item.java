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
    
    public static Item of(String name, int sellIn, int value) {
        if (name.equals("Aged Wine")) {
            return new AgedWine(name, sellIn, value);
        } 
        return new Item(name, sellIn, value);
    }

    // Please don't modify the signature of this method.
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.value;
    }
    
    public void updateValue() {
        
    } 
}
