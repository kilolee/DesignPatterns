package com.knightly.cglibproxy;

import org.junit.Test;

/**
 * Created by knightly on 2018/2/13.
 */
public class Client {
    @Test
    public void cglibproxy() {
        CglibProxy proxy = new CglibProxy();
        Train train = (Train) proxy.getProxy(Train.class);
        train.move();
    }


}
