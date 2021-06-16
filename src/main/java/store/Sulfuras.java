package store;

/**
 * @author 孙继峰
 * @since 2021/6/16
 */
public class Sulfuras extends Item {
    
    public Sulfuras(String name, int sellIn, int value) {
        super(name, sellIn, value);
    }
    
    @Override
    public void updateValue() {
        if (sellIn < 0) {
            if (value > 0) {
                value = value - 1;
            }
        }
    }
}
