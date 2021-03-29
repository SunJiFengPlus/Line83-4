package store;

/**
 * @author 孙继峰
 * @version 1.0
 **/
public class ShowTicket extends Item {
    public ShowTicket(int sellIn, int value) {
        super("Show Ticket", sellIn, value);
    }

    /**
     * 演出票（Show Ticket）越接近演出日，价值反而上升。在演出前10天，价值每天上升2点；
     * 演出前5天，价值每天上升3点。但一旦过了演出日，价值就马上变成0。
     */
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
