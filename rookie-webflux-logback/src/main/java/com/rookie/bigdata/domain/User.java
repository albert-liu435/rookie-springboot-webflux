package com.rookie.bigdata.domain;

import java.io.Serializable;

/**
 * @Classname User
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/27 12:35
 * @Version 1.0
 */
public class User implements Serializable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
