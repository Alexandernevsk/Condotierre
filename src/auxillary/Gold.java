package auxillary;

import java.math.BigDecimal;

public class Gold {
    private BigDecimal money;

    public Gold(double money) {
        this.money = new BigDecimal(money);
    }

    public Gold(float money) {
        this.money = new BigDecimal(money);
    }

    public Gold(int money) {
        this.money = new BigDecimal(money);
    }

    public Gold(long money) {
        this.money = new BigDecimal(money);
    }
}
