package com.rookie.bigdata.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.net.URI;

/**
 * @Classname RedirectController
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/27 9:55
 * @Version 1.0
 */
@Controller
public class RedirectController {


    @RequestMapping("/redirect3")
    public void hello(ServerHttpResponse response){
        response.setStatusCode(HttpStatus.FOUND);
        response.getHeaders().setLocation(URI.create("http://www.taobao.com"));
    }

    @RequestMapping("/redirect2")
    public Mono<Void> hello2(ServerHttpResponse response){
        return Mono.fromRunnable(()->{
            response.setStatusCode(HttpStatus.FOUND);
            response.getHeaders().setLocation(URI.create("http://www.baidu.com"));
        });
    }


    @RequestMapping("/redirect")
    public String redirect(){

        return "redirect:http://www.baidu.com";


    }


}
