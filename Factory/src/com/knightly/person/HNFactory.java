package com.knightly.person;

import com.knightly.person.Boy;
import com.knightly.person.Girl;
import com.knightly.person.HNBoy;

/**
 * 新年系列加工厂
 * Created by knightly on 2018/2/11.
 */
public class HNFactory implements PersonFactory {

    @Override
    public Boy getBoy() {
        return new HNBoy();
    }

    @Override
    public Girl getGirl() {
        return new HNGirl();
    }
}
