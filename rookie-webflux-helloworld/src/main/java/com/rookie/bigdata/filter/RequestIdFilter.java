//package com.rookie.bigdata.filter;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.slf4j.MDC;
//import org.springframework.http.HttpHeaders;
//import org.springframework.stereotype.Component;
//import org.springframework.web.server.ServerWebExchange;
//import org.springframework.web.server.WebFilter;
//import org.springframework.web.server.WebFilterChain;
//import reactor.core.publisher.Mono;
//import reactor.util.context.Context;
//
//import java.util.function.Consumer;
//
///**
// * @Classname RequestIdFilter
// * @Description TODO
// * @Author rookie
// * @Date 2022/4/25 9:24
// * @Version 1.0
// */
//@Component
//public class RequestIdFilter implements WebFilter {
//
//    private Logger LOG = LoggerFactory.getLogger(RequestIdFilter.class);
//
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
//        HttpHeaders headers = exchange.getRequest().getHeaders();
//        return chain.filter(exchange)
//                .doAfterSuccessOrError((r, t) -> logWithContext(headers, httpHeaders -> LOG.info("Some message with MDC set")))
//                .subscriberContext(Context.of(HttpHeaders.class, headers));
//    }
//
//    static void logWithContext(HttpHeaders headers, Consumer<HttpHeaders> logAction) {
//        try {
//            headers.forEach((name, values) -> MDC.put(name, values.get(0)));
//            logAction.accept(headers);
//        } finally {
//            headers.keySet().forEach(MDC::remove);
//        }
//
//    }
//}