package com.rookie.bigdata.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @Classname UserController
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/26 14:48
 * @Version 1.0
 */
@RestController
public class HomeController {

    @RequestMapping({"/hello"})
    public Mono<String> hello() {


        return Mono.just("hello 中国webflux");

    }

    @RequestMapping({"/world"})
    public Mono<String> world() {


        return Mono.just("world 中国webflux");

    }


}
