package com.knightly.ID;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kilo on 2018/8/14.
 * Factory抽象工厂的子类。实现了创建Product具体细节
 */
public class IDCardFactory extends Factory {
    private List owers = new ArrayList();

    public List getOwers() {
        return owers;
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owers.add(product.getOwner());
    }
}
