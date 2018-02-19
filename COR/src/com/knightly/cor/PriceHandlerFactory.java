package com.knightly.cor;

/**
 * 创建PriceHandler实例的工厂类
 * Created by knightly on 2018/2/19.
 */
public class PriceHandlerFactory {

    public static PriceHandler createPriceHandler() {

        PriceHandler sales = new Sales();
        PriceHandler leader = new Leader();
        PriceHandler manager = new Manager();
        PriceHandler director = new Director();
        PriceHandler vicePresident = new VicePresident();
        PriceHandler ceo = new CEO();

        sales.setSuccessor(leader);
        leader.setSuccessor(manager);
        manager.setSuccessor(director);
        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(ceo);

        return sales;
    }
}
