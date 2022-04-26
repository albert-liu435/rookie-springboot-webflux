package com.rookie.bigdata.filter;

import com.rookie.bigdata.controller.HomeController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

/**
 * @Classname UrlFilter
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/26 14:53
 * @Version 1.0
 */
@Component
public class UrlFilter implements WebFilter {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);


    @Override
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {


        String uri = exchange.getRequest().getPath().value();
        logger.info("{} 获取请求的url为: {}", exchange.getRequest().getId(), uri);


        //访问hello的请求会进入到/hello的映射方法上，其他的请求会全部进入到/world的映射方法上
        if ("/hello".equals(uri)) {
            return chain.filter(exchange)
                    //打印出完成的信号的值
                    .doFinally(signalType -> {
                        logger.info(" hello UrlFilter: "+signalType.toString());
                    });
        } else {

//            ServerHttpRequest request = exchange.getRequest().mutate().path("/world").build();
//            ServerWebExchange webExchange = exchange.mutate().request(request).build();
//
//            return  chain.filter(webExchange);


            return chain.filter(exchange
                    .mutate()
                    .request(
                            exchange.getRequest().mutate().path("/world").build()
                    )
                    .build()
            )
                    .doFinally(signalType -> {
                        logger.info("UrlFilter: "+signalType.toString());
                    })
                    ;

        }


    }
}
