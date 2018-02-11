package com.knightly.hair;

import java.util.Map;

/**
 * 发型工厂，工厂类模式
 * Created by knightly on 2018/2/10.
 */
public class HairFactory {
    /**
     * 根据类型来创建对象
     *
     * @param key
     * @return
     */
    public HairInterface getHair(String key) {
        if ("left".equals(key)) {
            return new LeftHair();
        } else if ("right".equals(key)) {
            return new RightHair();
        }
        return null;
    }

    /**
     * 根据类的名称来产生对象
     *
     * @param className
     * @return
     */
    public HairInterface getHairByClassName(String className) {
        try {
            HairInterface hair = (HairInterface) Class.forName(className).newInstance();
            return hair;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据类的名称来生产对象
     *
     * @param key
     * @return
     */
    public HairInterface getHairByClassKey(String key) {
        try {
            Map<String, String> map = new PropertiesReader().getProperties();
            HairInterface hair = (HairInterface) Class.forName(map.get(key)).newInstance();
            return hair;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
