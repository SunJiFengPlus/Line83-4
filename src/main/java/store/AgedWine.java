package store;

/**
 * @author 孙继峰
 * @version 1.0
 **/
public class AgedWine extends Item {
    public AgedWine(int sellIn, int value) {
        super("Aged Wine", sellIn, value);
    }

    @Override
    public void update() {
        if (value < 50) {
            value = value + 1;
        }
        sellIn = sellIn - 1;
        if (sellIn < 0) {
            value = value + 1;
        }
    }
}
