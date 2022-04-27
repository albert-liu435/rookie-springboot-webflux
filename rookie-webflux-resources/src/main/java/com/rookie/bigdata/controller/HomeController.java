package com.rookie.bigdata.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import reactor.util.context.ContextView;

/**
 * @Classname HomeController
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/25 11:41
 * @Version 1.0
 */
@RestController
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);


    @RequestMapping({"/hello"})
    public Mono<String> hello() {

        logger.info("打印controller请求");

        return Mono.just("hello 中国 webflux");
    }
}
