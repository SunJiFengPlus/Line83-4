package store;

import org.junit.Test;

public class StoreTest{
    @Test
    public void test() {
        
    }
    
    public Item updateValue(String name, int sellIn, int value) {
        Item item = Item.of(name, sellIn, value);
        Store store = Store.of(new Item[] {item});
        store.updateValue();
        return store.items[0];
    }
}