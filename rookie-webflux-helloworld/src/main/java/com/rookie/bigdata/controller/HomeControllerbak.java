//package com.rookie.bigdata.controller;
//
//import lombok.extern.slf4j.Slf4j;
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.springframework.core.log.LogFormatUtils;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.context.request.RequestAttributes;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//import org.springframework.web.server.ServerWebExchange;
//import org.springframework.web.server.adapter.HttpWebHandlerAdapter;
//import reactor.core.publisher.Mono;
//
//import static org.springframework.web.filter.reactive.ServerWebExchangeContextFilter.EXCHANGE_CONTEXT_ATTRIBUTE;
//
///**
// * @Classname HomeController
// * @Description 基于注解的编码方式，类似于springmvc
// * @Author rookie
// * @Date 2022/4/22 11:09
// * @Version 1.0
// */
//@RestController
////@Slf4j
//public class HomeControllerbak {
//
//
//    private static final Log logger = LogFactory.getLog(HomeControllerbak.class);
//
//    @GetMapping({ "/controller"})
//
//    public Mono<String> hello() {
//        //参考 ServerWebExchangeContextFilter
//
//
//        //ReactorServerHttpRequest.logPrefixIndex
//
////        return getDelegate().handle(exchange)
////                .doOnSuccess(aVoid -> logResponse(exchange))
////                .onErrorResume(ex -> handleUnresolvedError(exchange, ex))
////                .then(Mono.defer(response::setComplete));
//
//
////        logger.debug("debug 调用hello方法");
////        logger.info("info 调用hello方法");
////       // Mono<String> map = Mono.deferContextual(Mono::just).map(contextView -> contextView.get(ServerWebExchange.class).getLogPrefix());
////
////        Mono<ServerWebExchange> map = Mono.deferContextual(Mono::just).map(contextView -> contextView.get(EXCHANGE_CONTEXT_ATTRIBUTE));
////        Mono<ServerWebExchange> serverWebExchangeMono = map.doOnSuccess(exchange -> logResponse(exchange));
////       return serverWebExchangeMono.then(Mono.just("hello 中国 world"));
//
//
//
//        Mono.deferContextual(Mono::just).doOnEach(signl->{
//            //可以做一个日志追踪
//            Object o = signl.getContextView().get("you-key");
//
//        });
//
//        return Mono.just("Hello 中国 world.");
//    }
//
//
//    private void logResponse(ServerWebExchange exchange) {
//        LogFormatUtils.traceDebug(logger, traceOn -> {
//            HttpStatus status = exchange.getResponse().getStatusCode();
//            return exchange.getLogPrefix() + "Completed info 调用hello方法 ";
//        });
//    }
//}