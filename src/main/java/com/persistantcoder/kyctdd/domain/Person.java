package com.persistantcoder.kyctdd.domain;

import com.persistantcoder.kyctdd.utils.Gender;

/**
 * Created by Evans K F C on Nov ,2019
 **/
public class Person {

    private String name;
    private String surname;
    private Long age;
    private Gender gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
