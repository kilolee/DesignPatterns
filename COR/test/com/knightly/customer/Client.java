package com.knightly.customer;

import com.knightly.cor.PriceHandlerFactory;
import org.junit.Test;

import java.util.Random;

/**
 * Created by knightly on 2018/2/19.
 */
public class Client {

    @Test
    public void customer() {
        Customer customer = new Customer();
        customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());
        Random rand = new Random();
        for (int i = 0; i <100 ; i++) {
            System.out.println(i+":");
            customer.requestDiscount(rand.nextFloat());
        }
    }
}
