package com.rookie.bigdata.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 * @Classname User
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/27 16:56
 * @Version 1.0
 */
@Table("t_user")
public class User {
    @Id
    private long id;
    private String name;
    private long age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }
}
