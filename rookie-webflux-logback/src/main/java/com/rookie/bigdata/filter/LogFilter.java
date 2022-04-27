package com.rookie.bigdata.filter;

import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;
import reactor.util.context.Context;


/**
 * @Classname LogFilter
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/25 9:28
 * @Version 1.0
 */
@Component
public class LogFilter implements WebFilter {
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {

        return chain.filter(exchange)
                .contextWrite(Context.of("requestId", exchange.getLogPrefix()));
    }
}
