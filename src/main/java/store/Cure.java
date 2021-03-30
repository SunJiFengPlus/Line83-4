package store;

/**
 * @author 孙继峰
 * @version 1.0
 **/
public class Cure extends Item {
    public Cure(int sellIn, int value) {
        super("Cure", sellIn, value);
    }

    /**
     * 特效药的贬值速度是普通物品的两倍
     */
    @Override
    public void update() {
        if (value > 0) {
            value = value - 2;
        }
        sellIn = sellIn - 1;
        if (sellIn < 0) {
            if (value > 0) {
                value = value - 2;
            }
        }

        if (value < 0) {
            value = 0;
        }
    }
}
