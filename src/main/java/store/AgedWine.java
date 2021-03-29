package store;

/**
 * @author 孙继峰
 * @version 1.0
 **/
public class AgedWine extends Item {
    public AgedWine(int sellIn, int value) {
        super("Aged Wine", sellIn, value);
    }

    /**
     * 陈年老酒（Aged Wine）是一种特殊的商品，放得越久，价值反而越高。而且过了销售剩余天数后价值会双倍上涨。
     */
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
