package com.rookie.bigdata;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.status.OnConsoleStatusListener;
import ch.qos.logback.core.status.StatusManager;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Classname WebFluxApplication
 * @Description 基于注解
 * @Author rookie
 * @Date 2022/4/21 17:52
 * @Version 1.0
 */
@SpringBootApplication
public class LogBackWebFluxApplication {

    public static void main(String[] args) {



        SpringApplication.run(LogBackWebFluxApplication.class, args);
    }
}
