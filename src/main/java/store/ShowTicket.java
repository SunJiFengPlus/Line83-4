package store;

/**
 * @author 孙继峰
 * @version 1.0
 **/
public class ShowTicket extends Item {
    public ShowTicket(int sellIn, int value) {
        super("Show Ticket", sellIn, value);
    }

    @Override
    public void update() {
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
