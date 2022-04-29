package com.rookie.bigdata.exception;

/**
 * @Classname NotFoundException
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/27 17:39
 * @Version 1.0
 */
public class NotFoundException extends RuntimeException{


    public NotFoundException(final String message) {
        super(message);
    }
}
