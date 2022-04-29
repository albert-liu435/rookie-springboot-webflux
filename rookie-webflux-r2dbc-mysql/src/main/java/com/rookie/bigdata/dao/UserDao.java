package com.rookie.bigdata.dao;

import com.rookie.bigdata.domain.User;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

/**
 * @Classname UserDao
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/27 16:53
 * @Version 1.0
 */
public interface UserDao extends ReactiveCrudRepository<User, Long> {

    Flux<User> findByName(String name);



}
