package store;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

class StoreTest {

    @Test
    void test() {
        CombinationApprovals.verifyAllCombinations(
                this::update,
                new String[]{"foo", "Aged Wine", "Show Ticket", "Sulfuras"},
                new Integer[]{-1, 0, 1, 10, 11, 12},
                new Integer[]{-1, 0, 1, 49, 50, 51}
        );
    }

    Item update(String name, int sellIn, int value) {
        Item[] items = new Item[]{new Item(name, sellIn, value)};
        Store store = new Store(items);
        store.updateValue();
        return items[0];
    }
}