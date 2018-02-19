package com.knightly.cor;

/**
 * 销售经理，可以批准30%以内的折扣
 * Created by knightly on 2018/2/19.
 */
public class Manager extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.3) {
            System.out.format("%s批准了这口：%.2f%n", this.getClass().getName(), discount);
        } else {
            //交给上级处理
            successor.processDiscount(discount);
        }
    }
}
