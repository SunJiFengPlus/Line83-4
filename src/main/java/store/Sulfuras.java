package store;

/**
 * @author 孙继峰
 * @version 1.0
 **/
public class Sulfuras extends Item {
    public Sulfuras(int sellIn, int value) {
        super("Sulfuras", sellIn, value);
    }

    @Override
    public void update() {
        if (sellIn < 0) {
            if (value > 0) {
                value = value - 1;
            }
        }
    }
}
