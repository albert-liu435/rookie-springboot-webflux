package com.rookie.bigdata.controller;

import com.rookie.bigdata.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.reactive.result.view.Rendering;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.context.ContextView;

import java.net.URI;
import java.util.Arrays;

/**
 * @Classname HomeController
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/25 11:41
 * @Version 1.0
 */
@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);



    //重定向 访问http://localhost:9000/redirectindex

    @RequestMapping("/redirectindex")
    public String redirectUrl(){

        return "redirect:/index";
    }

    //重定向 访问http://localhost:9000/redirectrender
    @RequestMapping("/redirectrender")
    public Mono<Rendering> redirectRender(){

        return Mono.just(Rendering.redirectTo("/index").build());

    }



    @RequestMapping({"/index"})
    public Mono<String> index(final Model model) {

        logger.info("打印controller请求");

        model.addAttribute("name", "张三");

        return Mono.just("index");

    }


    @RequestMapping({"/getusers"})
    public Mono<String> user(final Model model){

        Flux<User> userFlux = Flux.just(new User("张三", 23), new User("李四", 24));
        model.addAttribute("users",userFlux);

        return Mono.just("users.html");


    }




}
