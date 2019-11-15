package com.persistantcoder.kyctdd;

import com.persistantcoder.kyctdd.domain.Person;
import com.persistantcoder.kyctdd.utils.Gender;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.*;


/**
 * Created by Evans K F C on Nov ,2019
 **/
@RunWith(JUnit4.class)
public class PersonPojoUnitTest {

    private  Person person ;


    @Before
    public void setUp(){
        person = new Person();
        person.setName("evan");
        person.setSurname("evan");
        person.setAge(10L);
        person.setGender(Gender.MALE);
    }
    

    @Test
    public void shouldCreatePersonObject(){

        assertNotNull(person);
        assertEquals(person.getName(),"evan");
        assertEquals(person.getSurname(),"evan");
        assertEquals(person.getAge().longValue(),10L);
        assertEquals(person.getGender(), Gender.MALE);

    }
}
