package com.ttbank.flep.core.util;

import java.io.*;

/**
 * @Author lucky
 * @Date 2021/11/5 15:27
 */
public class FileUtils {
    public static void main(String[] args) {
        inputStreamReader();
    }

    public static void inputStreamReader() {
        //1.创建输入流对象，将流理解为一只笔，输入流为读取数据，输出流为写数据
        InputStream inputStream = null;
        FileOutputStream fos=null;

        try {
            //2.实例化输入流对象
            inputStream = new FileInputStream("D:\\data\\测试文件.txt");
            //3.将读取的内容写入指定的文件夹的文件中

            //4.定义输出流的目标文件
            File file=new File("D:\\data\\1.txt");
            //5.实例化输出流对象
            fos = new FileOutputStream(file);
            //6.指定每次读取文件的大小
            byte[] bs = new byte[1024];
            int temp=0;
            //读入多个字节到字节数组中
            while ((temp=inputStream.read(bs))!=-1){
                //7，向指定目标文件写数据，temp为一次实际读入的字节数(会实时变化)
                fos.write(bs,0,temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                //8.inputStream、fos不为空，则关闭文件流
                if (inputStream != null&&fos!=null) {
                    inputStream.close();
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
