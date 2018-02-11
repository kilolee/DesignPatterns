package com.knightly.person;

import com.knightly.person.Boy;
import com.knightly.person.Girl;
import com.knightly.person.MCBoy;

/**
 * 圣诞系列加工厂
 * Created by knightly on 2018/2/11.
 */
public class MCFactory implements PersonFactory {
    @Override
    public Boy getBoy() {
        return new MCBoy();
    }

    @Override
    public Girl getGirl() {
        return new MCGirl();
    }
}
