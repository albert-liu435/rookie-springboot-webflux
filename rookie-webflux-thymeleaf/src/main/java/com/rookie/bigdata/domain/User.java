package com.rookie.bigdata.domain;

import java.io.Serializable;

/**
 * @Classname User
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/27 9:23
 * @Version 1.0
 */
public class User implements Serializable {

    private String username;

    private int age;

    public User() {
    }

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
