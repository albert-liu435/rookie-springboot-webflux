//package com.rookie.bigdata.router;
//
//import com.rookie.bigdata.handler.HelloWorldHandler;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.web.reactive.function.server.*;
//
///**
// * @Classname HelloWebFlux
// * @Description TODO
// * @Author rookie
// * @Date 2022/4/21 17:53
// * @Version 1.0
// */
//@Configuration
//public class HelloWebFluxbak {
//
//    @Bean
//    public RouterFunction<ServerResponse> hello(HelloWorldHandler handler) {
//
//        return RouterFunctions.route(RequestPredicates.path("/hello"),handler::helloWorld);
//
//
////        return RouterFunctions
////                .route(RequestPredicates.GET("/hello")
////                                .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
////                        handler::helloWorld);
////
////        添加过滤器解决中文乱码
////        return RouterFunctions
////                .route(RequestPredicates.GET("/hello")
////                                .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
////                        handler::helloWorld).filter((serverRequest, handlerFunction) -> {
////                    return ServerResponse.status(HttpStatus.OK).header("Content-Type","text/plain; charset=utf-8").build();
////                });
//    }
//
//
//
//}
