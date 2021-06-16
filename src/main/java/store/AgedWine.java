package store;

/**
 * @author 孙继峰
 * @since 2021/6/15
 */
public class AgedWine extends Item {
    
    public AgedWine(String name, int sellIn, int value) {
        super(name, sellIn, value);
    }
    
    @Override
    public void updateValue() {
        if (value < 50) {
            value = value + 1;
        }
    
        sellIn = sellIn - 1;
    
        if (sellIn < 0) {
            value = value + 1;
        }
    }
}
