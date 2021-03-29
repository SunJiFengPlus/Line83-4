package store;

/**
 * @author 孙继峰
 * @version 1.0
 **/
public class Sulfuras extends Item {
    public Sulfuras(int sellIn, int value) {
        super("Sulfuras", sellIn, value);
    }

    /**
     * 魔法锤（Sulfuras）是一种传奇商品，其销售剩余天数和品质值都不会变化。
     */
    @Override
    public void update() {
        if (sellIn < 0) {
            if (value > 0) {
                value = value - 1;
            }
        }
    }
}
