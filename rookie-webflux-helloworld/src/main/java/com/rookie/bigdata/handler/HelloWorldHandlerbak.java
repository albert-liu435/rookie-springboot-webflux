//package com.rookie.bigdata.handler;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Component;
//import org.springframework.web.reactive.function.BodyInserters;
//import org.springframework.web.reactive.function.server.RequestPredicates;
//import org.springframework.web.reactive.function.server.RouterFunctions;
//import org.springframework.web.reactive.function.server.ServerRequest;
//import org.springframework.web.reactive.function.server.ServerResponse;
//import reactor.core.publisher.Mono;
//
//import java.nio.charset.StandardCharsets;
//
///**
// * @Classname XttblogHandler
// * @Description TODO
// * @Author rookie
// * @Date 2022/4/21 17:53
// * @Version 1.0
// */
//@Component
//public class HelloWorldHandlerbak {
//
//
//    public Mono<ServerResponse> helloWorld(ServerRequest request) {
//
//
//
//        //return RouterFunctions
//
////        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
////                //.body(BodyInserters.fromObject("Hello, 中国webflux !"));
////                .body(BodyInserters.fromObject("Hello, 中国webflux !"));
//        //解决中文乱码的问题
//        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN).header("Content-Type","text/plain; charset=utf-8")
//                //.body(BodyInserters.fromObject("Hello, 中国webflux !"));
//                .body(BodyInserters.fromObject("Hello, 中国webflux !"));
//
//
//
//    }
//}