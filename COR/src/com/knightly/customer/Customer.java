package com.knightly.customer;

import com.knightly.cor.PriceHandler;

/**
 * 客户，请求折扣
 * Created by knightly on 2018/2/19.
 */
public class Customer {

    private PriceHandler priceHandler;

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    public void requestDiscount(float discount){
        priceHandler.processDiscount(discount);
    }
}
