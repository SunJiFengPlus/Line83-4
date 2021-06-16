package store;

/**
 * @author 孙继峰
 * @since 2021/6/16
 */
public class Cure extends Item {
    
    public Cure(String name, int sellIn, int value) {
        super(name, sellIn, value);
    }
    
    @Override
    public void updateValue() {
        value -= 2;
        sellIn--;
    
        if (sellIn < 0) {
            value -= 2;
        }
        value = Math.max(0, value); 
    }
}
