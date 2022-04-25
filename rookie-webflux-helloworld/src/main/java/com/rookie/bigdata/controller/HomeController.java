package com.rookie.bigdata.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @Classname HomeController
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/25 11:41
 * @Version 1.0
 */
@RestController
public class HomeController {

    private static final Log logger = LogFactory.getLog(HomeController.class);


    @RequestMapping({"/controller"})
    public Mono<String> hello() {

        //Mono.deferContextual()
       // Mono.deferContextual(Mono::just).doOnEach(signl->{})
        logger.info("打印controller请求");

        return Mono.just("hello 中国 webflux");
    }
}
