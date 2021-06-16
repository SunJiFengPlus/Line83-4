package store;

/**
 * @author 孙继峰
 * @since 2021/6/16
 */
public class ShowTicket extends Item {
    
    public ShowTicket(String name, int sellIn, int value) {
        super(name, sellIn, value);
    }
    
    @Override
    public void updateValue() {
        if (value < 50) {
            value = value + 1;
        
            if (sellIn < 11) {
                if (value < 50) {
                    value = value + 1;
                }
            }
        
            if (sellIn < 6) {
                if (value < 50) {
                    value = value + 1;
                }
            }
        }
    
        sellIn = sellIn - 1;
    
        if (sellIn < 0) {
            value = 0;
        }
    }
}
