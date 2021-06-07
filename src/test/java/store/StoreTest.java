package store;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.Test;

public class StoreTest{
    @Test
    public void test() {
        CombinationApprovals.verifyAllCombinations(
                this::updateValue,
                new String[]{"foo"},
                new Integer[]{0},
                new Integer[]{0}
        );
    }
    
    public Item updateValue(String name, int sellIn, int value) {
        Item item = Item.of(name, sellIn, value);
        Store store = Store.of(new Item[] {item});
        store.updateValue();
        return store.items[0];
    }
}