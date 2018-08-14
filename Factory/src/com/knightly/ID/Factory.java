package com.knightly.ID;

/**
 * Created by kilo on 2018/8/14.
 * 工厂模板模板类
 * 具体细节交由子类实现
 */
public abstract class Factory {
    /**
     * 创建对象的算法框架
     *
     * @param owner
     * @return
     */
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
