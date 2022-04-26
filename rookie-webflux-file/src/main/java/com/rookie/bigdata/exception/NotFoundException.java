package com.rookie.bigdata.exception;

/**
 * @Classname NotFoundException
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/25 16:28
 * @Version 1.0
 */
public class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {
        super(message);
    }

}
