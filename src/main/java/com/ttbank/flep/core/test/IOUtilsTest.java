package com.ttbank.flep.core.test;

import org.apache.commons.io.IOUtils;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.AsyncHandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author lucky
 * @Date 2021/11/29 18:36
 */
public class IOUtilsTest {
    public static void copyFileTest(){
        try {
            InputStream is = IOUtils.toInputStream("This is a String", "utf-8");
            OutputStream os = new FileOutputStream("D:\\data\\3.txt");
            //将字节从 InputStream 复制到 OutputStream。实现文件的拷贝
            int bytes = IOUtils.copy(is, os);
            System.out.println("File Written with " + bytes + " bytes");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readLinesTest(){
        try{
            InputStream is = new FileInputStream("D:\\data\\3.txt");
            List<String> lines = IOUtils.readLines(is);
            for(String line : lines){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeLinesTest()  {
        try {
            List<String> lines = new ArrayList();
            lines.add("hello");
            lines.add("list");
            lines.add("to");
            lines.add("file");
            OutputStream os = new FileOutputStream("D:\\data\\3.txt");
            IOUtils.writeLines(lines,IOUtils.LINE_SEPARATOR,os);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void skipTest(){
        InputStream is = IOUtils.toInputStream("hello world");
        try {
            IOUtils.skip(is,4);
            System.out.println(IOUtils.toString(is,"utf-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String property = System.getProperty("user.home");
        System.out.println(property);
        skipTest();

    }
}


