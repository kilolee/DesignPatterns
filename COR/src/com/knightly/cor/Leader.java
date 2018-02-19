package com.knightly.cor;

/**
 * 销售组长，可以批准15%以内的折扣
 * Created by knightly on 2018/2/19.
 */
public class Leader extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.15) {
            System.out.format("%s批准了这口：%.2f%n", this.getClass().getName(), discount);
        } else {
            //交给上级处理
            successor.processDiscount(discount);
        }
    }
}
