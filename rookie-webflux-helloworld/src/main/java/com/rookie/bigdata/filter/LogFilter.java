//package com.rookie.bigdata.filter;
//
//import org.slf4j.MDC;
//import org.springframework.stereotype.Component;
//import org.springframework.web.server.ServerWebExchange;
//import org.springframework.web.server.WebFilter;
//import org.springframework.web.server.WebFilterChain;
//import reactor.core.publisher.Mono;
//import reactor.util.context.Context;
//import reactor.util.context.ContextView;
//
//import java.util.UUID;
//
///**
// * @Classname LogFilter
// * @Description TODO
// * @Author rookie
// * @Date 2022/4/25 9:28
// * @Version 1.0
// */
//@Component
//public class LogFilter implements WebFilter {
//    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
//
////        String requestId = ((HttpServletRequest)request).getHeader("X-Request-ID");
////
////        if (request instanceof HttpServletRequest) {
////
////
////            if(StringUtils.isEmpty(requestId)){
////                requestId=UUID.randomUUID().toString();
////            }
////
//////            if (requestId != null) {
//////                MDC.put(MethodMDCAOP.REQUEST_ID_KEY, requestId);
//////            }else {
////
////            MDC.put(MethodMDCAOP.REQUEST_ID_KEY, requestId);
//////            }
////        }
////
////        if(response instanceof HttpServletResponse){
////            ((HttpServletResponse) response).setHeader("X-Request-ID",requestId);
////        }
////
////
////        try {
////            chain.doFilter(request,response);
////        } finally {
////            // MDC.clear();//must be,threadLocal
////            MDC.remove(MethodMDCAOP.REQUEST_ID_KEY);
////        }
////
////        //chain.doFilter(request, response);
////    }
//
//
//    //https://cloud.tencent.com/developer/ask/sof/668993/answer/992111
//        return chain.filter(exchange)
//                .contextWrite(Context.of("requestId", UUID.randomUUID().toString()));
//    }
//}
