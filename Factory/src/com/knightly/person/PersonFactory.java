package com.knightly.person;

import com.knightly.person.Boy;
import com.knightly.person.Girl;

/**
 * 人物的接口实现
 * Created by knightly on 2018/2/11.
 */
public interface PersonFactory {
    //获取男孩
    Boy getBoy();

    //获取女孩
    Girl getGirl();
}
