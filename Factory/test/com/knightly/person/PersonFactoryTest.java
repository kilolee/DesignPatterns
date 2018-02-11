package com.knightly.person;

import com.knightly.person.Girl;
import com.knightly.person.MCFactory;
import com.knightly.person.PersonFactory;
import org.junit.Test;

/**
 * Created by knightly on 2018/2/11.
 */
public class PersonFactoryTest {

    @Test
    public void MCFactoryTest(){
        PersonFactory factory = new MCFactory();
        Girl girl = factory.getGirl();
        girl.drawWomen();
    }

    @Test
    public void HNFactoryTest(){
        PersonFactory factory = new HNFactory();
        Boy boy = factory.getBoy();
        boy.drawMan();
    }

}
