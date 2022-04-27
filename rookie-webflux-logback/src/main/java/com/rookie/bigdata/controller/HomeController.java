package com.rookie.bigdata.controller;

import com.rookie.bigdata.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.log.LogFormatUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
import reactor.util.context.ContextView;

import java.util.function.Function;

import static org.springframework.web.filter.reactive.ServerWebExchangeContextFilter.EXCHANGE_CONTEXT_ATTRIBUTE;

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


    @RequestMapping({"/controller"})
    public Mono<String> hello() {
        logger.info("打印controller请求");

        return Mono.deferContextual(Mono::just)
                .map(context -> {

                    ServerWebExchange serverWebExchange=(ServerWebExchange)context.get(EXCHANGE_CONTEXT_ATTRIBUTE);

                    String logPrefix = serverWebExchange.getLogPrefix();

                    logger.info("打印日志id[{}],{}",logPrefix,serverWebExchange.getRequest().getPath().value());

                  //  System.out.println((Object) context.get("TRACE_ID"));
                    return context;
                })
                .thenReturn("hello 中国 webflux");


    }


    @RequestMapping(value = "user", method = RequestMethod.POST)
    public Mono<User> hello(@RequestBody User user) {


        logger.info("打印controller请求");
        return Mono.deferContextual(Mono::just)
                .map(context -> {

//                    ServerWebExchange serverWebExchange=(ServerWebExchange)context.get(EXCHANGE_CONTEXT_ATTRIBUTE);
//
//                    String logPrefix = serverWebExchange.getLogPrefix();


                    logger.info("打印日志id[{}],{}",context.get("requestId"),user.toString());

                    //  System.out.println((Object) context.get("TRACE_ID"));
                    return context;
                })
                .thenReturn(user);
    }

}
