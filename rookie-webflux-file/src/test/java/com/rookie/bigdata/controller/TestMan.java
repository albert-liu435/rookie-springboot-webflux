package com.rookie.bigdata.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

/**
 * @Classname TestMan
 * @Description TODO
 * @Author rookie
 * @Date 2022/4/22 17:06
 * @Version 1.0
 */
public class TestMan {

    public static void main(String[] args) throws Exception{
        System.out.println(Long.MAX_VALUE);
        File file=new File("C:\\Users\\liuxili\\Postman\\files\\ASE.java");
        Writer write = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8);

        while (true){
            write.append("abc");
            write.flush();

        }
    }
}
